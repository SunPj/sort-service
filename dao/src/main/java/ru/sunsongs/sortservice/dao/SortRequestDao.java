package ru.sunsongs.sortservice.dao;

import ru.sunsongs.sortservice.model.SortRequest;

import java.util.List;

/**
 * Dao по работе с заявками
 * @auldanov on 06.08.2014.
 */
public interface SortRequestDao {
    List<SortRequest> getAll();
}
