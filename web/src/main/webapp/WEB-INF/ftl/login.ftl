<#assign content>
<h1>Не верый логин или пароль</h1>
Вы можете авторизоваться <a href="//${springMacroRequestContext.getRequestUri()}/login">еще раз</a>, либо перейти на <a href="//${springMacroRequestContext.getRequestUri()}/">главную</a>
</#assign>

<#include "main_layout.ftl">