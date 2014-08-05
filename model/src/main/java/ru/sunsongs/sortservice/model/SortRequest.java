package ru.sunsongs.sortservice.model;

import javax.persistence.Entity;
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
    /** идентификатор пользователя */
    private long userId;
    /** массив данных для сортировки */
    private int[] array;
    /** тип сортировки */
    private int sortType;
    /** лата */
    private Date date;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
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
}
