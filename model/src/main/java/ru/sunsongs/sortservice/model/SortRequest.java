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

    /** идентификатор пользователя */
    @Column(name = "user_id")
    private long userId;

    /** массив данных для сортировки */
    @Column(name = "\"array\"")
    private String array;

    /** тип сортировки */
    @Column(name = "sort_type")
    private int sortType;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

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
}
