package ru.sunsongs.sortservice.model;

/**
 * Модель отображающая ответ за запрос
 * по сортировке массива через JSON API
 *
 * @author kraken
 * @time 8/3/14 12:13 AM
 */
public class JsonApiSortResponse {
    /** Признак успешности выполнения запроса сортировки */
    private boolean success;

    /** Отсортированный массив данных */
    private int[] sortedArray;

    /** Сообщение об ошибке */
    private String errorMessage;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
