package ru.sunsongs.sortservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sunsongs.sortservice.exception.NotEnoughBalanceException;
import ru.sunsongs.sortservice.exception.UnknownSortTypeException;
import ru.sunsongs.sortservice.model.JsonApiSortRequest;
import ru.sunsongs.sortservice.model.User;
import ru.sunsongs.sortservice.service.SortService;
import ru.sunsongs.sortservice.service.UserService;

import java.math.BigDecimal;

/**
 * @author kraken
 * @time 8/3/14 10:13 AM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SortService sortService;

    @Override
    public int[] sortArray(JsonApiSortRequest sortRequest) throws UnknownSortTypeException, NotEnoughBalanceException {
        // получаем пользователя по ключу && проверить API ключ
        User user = getUserByApiKey(sortRequest.getApiKey());
        // получаем цену
        double price = sortService.getPrice(sortRequest.getSortType());
        // списываем со счета пользователя
        withdraw(user.getId(), BigDecimal.valueOf(price));

        return sortService.sort(sortRequest.getSortType(), sortRequest.getArray());
    }

    @Override
    public User getUserByApiKey(String apiKey) {
        // TODO
        return null;
    }

    @Override
    public void withdraw(long userId, BigDecimal amount) throws NotEnoughBalanceException {
        // TODO
    }

}
