package ru.sunsongs.sortservice.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.sunsongs.sortservice.dao.SortRequestDao;
import ru.sunsongs.sortservice.model.SortRequest;

import java.util.List;

/**
 *
 * @author auldanov on 06.08.2014.
 */
@Repository
public class SortRequestDaoImpl implements SortRequestDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<SortRequest> getAll() {
        return sessionFactory.getCurrentSession().createCriteria(SortRequest.class).list();
    }
}
