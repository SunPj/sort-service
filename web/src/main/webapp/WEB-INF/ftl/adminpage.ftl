<#assign content>
    <h1>Страница Администратора</h1>
    <ul>
        <#list requests as r>
            <li>${r.array} - ${r.user.userName}</li>
        </#list>
    </ul>
</#assign>

<#include "main_layout.ftl">

