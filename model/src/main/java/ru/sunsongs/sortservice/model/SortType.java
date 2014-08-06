package ru.sunsongs.sortservice.model;

/**
 * Алгоритмы сортировок
 * @author kraken
 * @time 8/2/14 11:19 AM
 */
public enum SortType {
    BUBBLE_SORT(1, "Пузырьковая сортировка", 10),
    MERGE_SORT(2, "Сортировка слиянием", 20),
    LSD_RADIX_SORT(3, "Поразрядная сортировка", 30);

    // идентификатор
    private int id;

    // название сортировки
    private String name;

    // цена
    private double price;


    SortType(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
