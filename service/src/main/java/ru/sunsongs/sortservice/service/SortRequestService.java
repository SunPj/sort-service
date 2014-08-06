package ru.sunsongs.sortservice.service;

import ru.sunsongs.sortservice.model.SortRequest;

import java.util.List;

/**
 * @author auldanov on 06.08.2014.
 */
public interface SortRequestService {
    List<SortRequest> getAll();
}
