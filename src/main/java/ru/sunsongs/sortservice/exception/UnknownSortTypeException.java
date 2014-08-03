package ru.sunsongs.sortservice.exception;

/**
 * @author kraken
 * @time 8/3/14 10:23 AM
 */
public class UnknownSortTypeException extends Throwable {

    private static final String msg = "Не найдены типы сортировок соответсвующих идентификатору";

    @Override
    public String toString() {
        return msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
