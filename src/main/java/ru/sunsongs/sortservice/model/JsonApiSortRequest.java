package ru.sunsongs.sortservice.model;

/**
 * Модель - ответ на JSON API запрос по сортировке
 * массива
 *
 * @author kraken
 * @time 8/3/14 12:42 AM
 */
public class JsonApiSortRequest {
    /** API ключ пользователя */
    private String apiKey;

    /** Отсортированный массив */
    private int[] array;

    /** Тип сортировки */
    private int sortType;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public int getSortType() {
        return sortType;
    }

    public void setSortType(int sortType) {
        this.sortType = sortType;
    }
}
