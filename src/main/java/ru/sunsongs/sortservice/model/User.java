package ru.sunsongs.sortservice.model;

import java.math.BigDecimal;

/**
 * @author kraken
 * @time 8/3/14 10:14 AM
 */
public class User {
    /** идентификатор пользователя */
    private long id;

    /** имя пользователя */
    private String userName;

    /** пароль */
    private String password;

    /** баланс */
    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
