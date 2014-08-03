package ru.sunsongs.sortservice.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author kraken
 * @time 8/3/14 10:14 AM
 */
@Entity
@Table(name = "user")
public class User {
    /** идентификатор пользователя */
    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;

    /** имя пользователя */
    @Column(name = "user_name")
    private String userName;

    /** пароль */
    @Column(name = "password")
    private String password;

    /** баланс */
    @Column(name = "balance")
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
