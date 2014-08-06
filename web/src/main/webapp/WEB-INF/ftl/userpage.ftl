<#assign content>
    <h1>Личный кабинет пользователя</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Идентификато запроса</th>
            <th>Тип сортировки</th>
            <th>Данные для сортировки</th>
        </tr>
        </thead>
        <tbody>
            <#list requests as r>
            <tr>
                <td>${r.id}</td>
                <td>${r.sortType}</td>
                <td>${r.array}</td>
            </tr>
            </#list>
        </tbody>
    </table>
</#assign>

<#include "main_layout.ftl">