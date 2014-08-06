<h1>Admin page</h1>

<ul>
<#list requests as r>
    <li>${r.array} - ${r.user.userName}</li>
</#list>

</ul>
