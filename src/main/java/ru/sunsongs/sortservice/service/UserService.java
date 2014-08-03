package ru.sunsongs.sortservice.service;

import ru.sunsongs.sortservice.exception.NotEnoughBalanceException;
import ru.sunsongs.sortservice.exception.UnknownSortTypeException;
import ru.sunsongs.sortservice.model.JsonApiSortRequest;
import ru.sunsongs.sortservice.model.User;

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
     * @throws ru.sunsongs.sortservice.exception.NotEnoughBalanceException сигнализирует о недостаточном балансе
     */
    int[] sortArray(JsonApiSortRequest sortRequest) throws UnknownSortTypeException, NotEnoughBalanceException;

    /**
     * Метод возвращает пользователя по API key
     *
     * @param apiKey
     * @return
     */
    User getUserByApiKey(String apiKey);

    /**
     * Снятие денег с баланса пользователя
     *
     * @param amount
     * @throws ru.sunsongs.sortservice.exception.NotEnoughBalanceException
     */
    void withdraw(long userId, BigDecimal amount) throws NotEnoughBalanceException;
}
