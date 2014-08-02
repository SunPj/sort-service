package ru.sunsongs.sortservice.service;

import ru.sunsongs.sortservice.service.impl.SortType;

/**
 * Интрефей который должен реализовывыть каждый алгоритм сортировки
 *
 * @author kraken
 * @time 8/2/14 11:41 AM
 */
public interface SortAlgorithm {
    /**
     * Метод возвращает уникальный
     * тип сортировки
     * @return
     */
    SortType getType();

    /**
     * Метод реализующий алгоритм сортировки
     * @param arrayToSort массив для сортировки
     * @return отсортированный массив
     */
    int[] sort(int[] arrayToSort);
}
