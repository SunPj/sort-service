package ru.sunsongs.sortservice.service.impl;

import org.springframework.stereotype.Service;
import ru.sunsongs.sortservice.model.SortType;
import ru.sunsongs.sortservice.service.SortAlgorithm;

/**
 * Реализация алгоритма поразрядной сортировки
 * массива
 *
 * @author kraken
 * @time 8/2/14 12:31 PM
 */
@Service
public class LsdRadixSort implements SortAlgorithm {
    private final static int BITS_PER_BYTE = 8;

    @Override
    public SortType getType() {
        return SortType.LSD_RADIX_SORT;
    }

    @Override
    public int[] sort(int[] arrayToSort) {
        int BITS = 32;
        int W = BITS / BITS_PER_BYTE;
        int R = 1 << BITS_PER_BYTE;
        int MASK = R - 1;

        int N = arrayToSort.length;
        int[] aux = new int[N];

        for (int d = 0; d < W; d++) {

            // вычислеие частоты
            int[] count = new int[R+1];
            for (int i = 0; i < N; i++) {
                int c = (arrayToSort[i] >> BITS_PER_BYTE*d) & MASK;
                count[c + 1]++;
            }

            for (int r = 0; r < R; r++)
                count[r+1] += count[r];

            if (d == W-1) {
                int shift1 = count[R] - count[R/2];
                int shift2 = count[R/2];
                for (int r = 0; r < R/2; r++)
                    count[r] += shift1;
                for (int r = R/2; r < R; r++)
                    count[r] -= shift2;
            }

            for (int i = 0; i < N; i++) {
                int c = (arrayToSort[i] >> BITS_PER_BYTE*d) & MASK;
                aux[count[c]++] = arrayToSort[i];
            }

            for (int i = 0; i < N; i++)
                arrayToSort[i] = aux[i];
        }

        return arrayToSort;
    }
}
