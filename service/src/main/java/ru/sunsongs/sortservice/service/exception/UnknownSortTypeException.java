package ru.sunsongs.sortservice.service.exception;

/**
 * @author kraken
 * @time 8/3/14 10:23 AM
 */
public class UnknownSortTypeException extends RestApiRequestException {

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
