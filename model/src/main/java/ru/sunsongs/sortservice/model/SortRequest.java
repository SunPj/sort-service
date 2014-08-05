package ru.sunsongs.sortservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

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
    private int id;

    /** идентификатор пользователя */
    @Column(name = "user_id")
    private long userId;

    /** массив данных для сортировки */
    @Column(name = "array")
    private String array;

    /** тип сортировки */
    @Column(name = "sort_type")
    private int sortType;

    /** лата */
    @Column(name = "date")
    private Date date;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array.toString();
    }
}
