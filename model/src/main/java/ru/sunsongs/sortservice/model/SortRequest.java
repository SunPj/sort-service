package ru.sunsongs.sortservice.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Заказы на сортировку
 *
 * @author auldanov on 05.08.2014.
 */
@Entity
@Table(name = "sort_request")
public class SortRequest {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private int id;

    /** массив данных для сортировки */
    @Column(name = "\"array\"")
    private String array;

    /** тип сортировки */
    @Column(name = "sort_type")
    private int sortType;

    /** Пользователь - владелец запроса */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public int getSortType() {
        return sortType;
    }

    public void setSortType(int sortType) {
        this.sortType = sortType;
    }

    public String getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = Arrays.toString(array);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
