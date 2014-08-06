<#assign content>
    <h1>Личный кабинет пользователя</h1>
    <ul>
        <#list requests as r>
            <li>${r.array} - ${r.user.userName} - ${r.type}</li>
        </#list>
    </ul>
</#assign>

<#include "main_layout.ftl">