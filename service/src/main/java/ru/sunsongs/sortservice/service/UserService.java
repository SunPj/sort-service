package ru.sunsongs.sortservice.service;

import ru.sunsongs.sortservice.model.JsonApiSortRequest;
import ru.sunsongs.sortservice.model.User;
import ru.sunsongs.sortservice.service.exception.NotEnoughBalanceException;
import ru.sunsongs.sortservice.service.exception.RestApiRequestException;
import ru.sunsongs.sortservice.service.exception.UnknownApiKeyException;
import ru.sunsongs.sortservice.service.exception.UnknownSortTypeException;

import java.math.BigDecimal;

/**
 * @author kraken
 * @time 8/3/14 10:11 AM
 */
public interface UserService {
    /**
     * Метод для обработки запроса на сортировку массива
     *
     * @param sortRequest содержит параметры запроса на сортировку
     * @return возвращает отсортированный массив
     * @throws UnknownSortTypeException сигнализирует о неверном идентификаторе вида сортировки
     * @throws ru.sunsongs.sortservice.service.exception.NotEnoughBalanceException сигнализирует о недостаточном балансе
     */
    int[] sortArray(JsonApiSortRequest sortRequest) throws RestApiRequestException;

    /**
     * Метод возвращает пользователя по API key
     *
     * @param apiKey
     * @return
     */
    User getUserByApiKey(String apiKey) throws UnknownApiKeyException;

    /**
     * Снятие денег с баланса пользователя
     *
     * @param amount
     * @throws NotEnoughBalanceException
     */
    void withdraw(User user, double amount) throws NotEnoughBalanceException;

    /**
     * Получить пользователя по имени
     * @return
     */
    User getUserByName(String name);
}
