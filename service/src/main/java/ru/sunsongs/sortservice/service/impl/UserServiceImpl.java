package ru.sunsongs.sortservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sunsongs.sortservice.dao.UserDao;
import ru.sunsongs.sortservice.model.JsonApiSortRequest;
import ru.sunsongs.sortservice.model.SortType;
import ru.sunsongs.sortservice.model.User;
import ru.sunsongs.sortservice.service.SortService;
import ru.sunsongs.sortservice.service.UserService;
import ru.sunsongs.sortservice.service.exception.NotEnoughBalanceException;
import ru.sunsongs.sortservice.service.exception.RestApiRequestException;
import ru.sunsongs.sortservice.service.exception.UnknownApiKeyException;
import ru.sunsongs.sortservice.service.exception.UnknownSortTypeException;

import java.math.BigDecimal;

/**
 * @author kraken
 * @time 8/3/14 10:13 AM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SortService sortService;

    @Autowired
    private UserDao userDao;

    @Override
    public int[] sortArray(JsonApiSortRequest sortRequest) throws RestApiRequestException {
        // получаем пользователя по ключу && проверить API ключ
        User user = getUserByApiKey(sortRequest.getApiKey());
        // получаем цену
        double price = sortService.getPrice(sortRequest.getSortType());
        // списываем со счета пользователя
        withdraw(user, price);
        // сохраняем заказ у пользователя
        SortType sortType = sortService.getSortTypeByTypeId(sortRequest.getSortType());
        userDao.saveRequest(user, sortRequest.getArray(), sortType);

        return sortService.sort(sortRequest.getSortType(), sortRequest.getArray());
    }

    @Override
    public User getUserByApiKey(String apiKey) throws UnknownApiKeyException {
        User userByApiKey = userDao.getUserByApiKey(apiKey);
        if (userByApiKey == null){
            throw new UnknownApiKeyException();
        } else {
            return userByApiKey;
        }
    }

    @Override
    public void withdraw(User user, double amount) throws NotEnoughBalanceException {
        // проверка баланса
        if (user.getBalance() < amount){
            throw new NotEnoughBalanceException();
        }

        // обновляем баланс
        userDao.updateBalance(user.getId(), user.getBalance() - amount);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }
}
