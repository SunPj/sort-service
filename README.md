Сервис по сортировке массивов
=========

Решение тестовой задачи с использованием технологий 
- Язык: Java
- Стек: Spring MVC, Spring Security, Hibernate
- Шаблоны пользовательского интерфейса: Freemarker
- Хранилище: Postgres

Задача
----
> Разработать веб-сервис, реализующий JSON API для выполнения сортировки массива.
Каждый запрос на сортировку считается заказом, который должен быть сохранен в личном кабинете пользователя. В заказе указываются: массив данных, метод сортировки и стоимость. Каждый метод сортировки имеет свою стоимость.
В качестве примера должны быть реализованы алгоритмы: Bubble Sort, Merge Sort, LSDRadixSort.
Пользователи имеют возможность регистрироваться, авторизовываться и просматривать свой кабинет.
Должен быть административный пользователь, просматривающий все заказы, а также суммы заказов по месяцам.

### Пример запроса:

Адрес
``` /web-1.0-SNAPSHOT/api/sort ```

Заголовок  ```Content-Type:application/json```

Тело запроса  ```{"apiKey":22, "array": [5,4,7], "sortType":1}```

#### Что сделано дополнительно
* Покрытие тестами логику сортировок

#### Что не успел сделать
* Регистрация пользовалетелей
* Транзакции
