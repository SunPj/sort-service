package ru.sunsongs.sortservice.dao;

import ru.sunsongs.sortservice.model.User;

/**
 * Dao для пользователей
 * @author kraken
 * @time 8/3/14 12:55 PM
 */
public interface UserDao {
    User getUserByApiKey(String apiKey);
}
