package ru.sunsongs.sortservice.service.exception;

/**
 * @author kraken
 * @time 8/3/14 10:42 AM
 */
public class NotEnoughBalanceException extends Throwable {
    public static final String msg = "Не достаточно средств на балансе";

    @Override
    public String getMessage() {
        return msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
