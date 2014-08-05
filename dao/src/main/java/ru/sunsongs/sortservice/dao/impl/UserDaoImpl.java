package ru.sunsongs.sortservice.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.sunsongs.sortservice.dao.UserDao;
import ru.sunsongs.sortservice.model.SortRequest;
import ru.sunsongs.sortservice.model.User;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

/**
 * Dao пользователя
 *                                             `
 * @author kraken
 * @time 8/3/14 5:25 PM
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getUserByApiKey(String apiKey) {
        return (User) getCurrentSession()
            .createCriteria(User.class)
                .add(Restrictions.eq("apiKey", apiKey)).uniqueResult();
    }

    @Override
    public void updateBalance(long userId, double balance) {
        User user = (User) getCurrentSession().get(User.class, userId);
        user.setBalance(balance);
        getCurrentSession().update(user);
        getCurrentSession().flush();
    }

    @Override
    public void saveRequest(long userId, int[] array, int type) {
        SortRequest sortRequest = new SortRequest();
        sortRequest.setUserId(userId);
        sortRequest.setArray(array);
        sortRequest.setSortType(type);
        // save
        getCurrentSession().save(sortRequest);
        getCurrentSession().flush();
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
