package ru.sunsongs.sortservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sunsongs.sortservice.dao.SortRequestDao;
import ru.sunsongs.sortservice.model.SortRequest;
import ru.sunsongs.sortservice.service.SortRequestService;

import java.util.List;

/**
 * @author auldanov on 06.08.2014.
 */
@Service
public class SortRequestServiceImpl implements SortRequestService {

    @Autowired
    SortRequestDao sortRequestDao;

    @Override
    public List<SortRequest> getAll() {
        return sortRequestDao.getAll();
    }
}
