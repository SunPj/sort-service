package ru.sunsongs.sortservice.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author kraken
 * @time 8/3/14 10:14 AM
 */
@Entity
@Table(name = "users")
public class User {
    /** идентификатор пользователя */
    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;

    /** имя пользователя */
    @Column(name = "username")
    private String userName;

    /** пароль */
    @Column(name = "password")
    private String password;

    /** баланс */
    @Column(name = "balance")
    private double balance;

    /** баланс */
    @Column(name = "api_key")
    private String apiKey;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<SortRequest> requests;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Set<SortRequest> getRequests() {
        return requests;
    }

    public void setRequests(Set<SortRequest> requests) {
        this.requests = requests;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
