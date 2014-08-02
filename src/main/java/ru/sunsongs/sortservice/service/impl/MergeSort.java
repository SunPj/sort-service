package ru.sunsongs.sortservice.service.impl;

import org.springframework.stereotype.Service;
import ru.sunsongs.sortservice.service.SortAlgorithm;

/**
 * Реализация алгоритма сортировки массива
 * методом слияния
 *
 * @author kraken
 * @time 8/2/14 12:09 PM
 */
@Service
public class MergeSort implements SortAlgorithm{

    private int[] numbers;
    private int[] helper;
    private int number;

    @Override
    public SortType getType() {
        return SortType.MERGE_SORT;
    }

    @Override
    public int[] sort(int[] arrayToSort) {
        numbers = arrayToSort;
        number = arrayToSort.length;
        helper = new int[number];
        mergesort(0, number - 1);

        return numbers;
    }

    private void mergesort(int low, int high) {
        // если индекс головы массива больше чем начала то сортируем,
        // иначе считаем отсортированным
        if (low < high) {
            // получаем индекс середины массива
            int middle = low + (high - low) / 2;
            // сотируем левую часть
            mergesort(low, middle);
            // сортируем правую часть массива
            mergesort(middle + 1, high);
            // объединяем массивы
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Копируем обе части во временный массив
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // копируем меньше значение с обеих частей массива в оригинальную
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}
