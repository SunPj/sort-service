package ru.sunsongs.sortservice.service.impl;

import org.springframework.stereotype.Service;
import ru.sunsongs.sortservice.model.SortType;
import ru.sunsongs.sortservice.service.SortAlgorithm;

/**
 * Реализация алгоритма сортировки массива
 * пузырьковым методом
 *
 * @author kraken
 * @time 8/2/14 11:44 AM
 */
@Service
public class BubbleSort implements SortAlgorithm {
    @Override
    public SortType getType() {
        return SortType.BUBBLE_SORT;
    }

    @Override
    public int[] sort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

        return arr;
    }
}
