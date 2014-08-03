package ru.sunsongs.sortservice.service.impl;

import ru.sunsongs.sortservice.service.impl.BubbleSort;
import ru.sunsongs.sortservice.service.impl.LsdRadixSort;
import ru.sunsongs.sortservice.service.impl.MergeSort;
import org.junit.*;
import ru.sunsongs.sortservice.service.SortAlgorithm;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;

public class SortTest {

    SortAlgorithm bubbleSort;
    SortAlgorithm mergeSort;
    SortAlgorithm lsdRadixSort;

    public SortTest() {
        bubbleSort = new BubbleSort();
        mergeSort = new MergeSort();
        lsdRadixSort = new LsdRadixSort();
    }

    @Test
    public void testSort(){
        testAll(new int[]{3, 2, 1, 0}, new int[]{0 , 1, 2, 3});
        testAll(new int[]{}, new int[]{});
        testAll(new int[]{1, 1, 1}, new int[]{1, 1, 1});
        testAll(new int[]{1, 0}, new int[]{0, 1});
    }

    private void testAll(int[] in, int[] correctResult){
        assertTrue("Пузырьковая сортировка", Arrays.equals(bubbleSort.sort(in.clone()), correctResult));
        assertTrue("Сортировка слиянием", Arrays.equals(mergeSort.sort(in.clone()), correctResult));
        assertTrue("Поразрядныая сортировка", Arrays.equals(lsdRadixSort.sort(in.clone()), correctResult));
    }
}