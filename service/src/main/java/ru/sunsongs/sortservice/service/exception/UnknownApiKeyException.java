package ru.sunsongs.sortservice.service.exception;

/**
 * Не верный api ключ
 * @author auldanov on 05.08.2014.
 */
public class UnknownApiKeyException extends RestApiRequestException{
    private static final String MSG = "Не верный api ключ";

    @Override
    public String getMessage() {
        return MSG;
    }

    @Override
    public String toString() {
        return MSG;
    }
}
