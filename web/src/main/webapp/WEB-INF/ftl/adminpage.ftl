<#assign content>
    <h1>Страница Администратора</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Идентификато запроса</th>
            <th>Пользователь</th>
            <th>Тип сортировки</th>
            <th>Данные для сортировки</th>
        </tr>
        </thead>
        <tbody>
            <#list requests as r>
                <tr>
                    <td>${r.id}</td>
                    <td>${r.user.userName}</td>
                    <td>${r.sortType.getName()}</td>
                    <td>${r.array}</td>
                </tr>
            </#list>
        </tbody>
    </table>
</#assign>

<#include "main_layout.ftl">

