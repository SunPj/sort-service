package ru.sunsongs.sortservice.dao;

import ru.sunsongs.sortservice.model.User;

import java.math.BigDecimal;

/**
 * Dao для пользователей
 *
 * @author kraken
 * @time 8/3/14 12:55 PM
 */
public interface UserDao {
    /**
     * Получение пользователя по apiKey
     *
     * @param apiKey
     * @return
     */
    User getUserByApiKey(String apiKey);

    /**
     * Обновляет балланс пользователя
     *
     * @param userId идентификато пользователя
     * @param balance баланс
     */
    void updateBalance(long userId, BigDecimal balance);
}
