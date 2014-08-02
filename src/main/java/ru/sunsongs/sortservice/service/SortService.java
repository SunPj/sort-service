package ru.sunsongs.sortservice.service;

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
    int[] sort(int sortTypeId, int[] array);

    /**
     * Метод возвращает список досупных алгоритмов сотрировки
     * @return
     */
    Map<String, Integer> getAvailableAlgorithms();
}
