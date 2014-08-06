package ru.sunsongs.sortservice.service;

import ru.sunsongs.sortservice.model.SortType;
import ru.sunsongs.sortservice.service.exception.UnknownSortTypeException;

import java.util.Map;

/**
 * Сервис по сортировке массивов
 *
 * @author kraken
 * @time 8/2/14 11:12 AM
 */
public interface SortService {
    /**
     * Сортировка массива
     *
     * @param sortTypeId идентификатор типа сортировки
     * @param array массив для сортировки
     * @return отсортированный массив
     */
    int[] sort(int sortTypeId, int[] array) throws UnknownSortTypeException;

    /**
     * Метод возвращает список досупных алгоритмов сотрировки
     * @return
     */
    Map<String, Integer> getAvailableAlgorithms();

    /**
     * Возвращает цену для сортировки с идентификатором id,
     * и кидает UnknownSortTypeException в случае не
     * существования алгоритма с таким идентификатором
     *
     * @param id идентификатор сортировки
     * @return
     * @throws UnknownSortTypeException
     */
    double getPrice(int id) throws UnknownSortTypeException;

    /**
     * Получение типа сортировки
     * по идентификатору
     *
     * @param typeId
     * @return
     */
    SortType getSortTypeByTypeId(int typeId) throws UnknownSortTypeException;
}
