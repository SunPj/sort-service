<!doctype html>
<html>
<head>
    <title>?????? ?? ?????????? ????????</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <!-- Optional theme -->
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
    <!-- Latest compiled and minified JavaScript -->
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

${styles!}
${scripts!}
</head>
<body>
        <nav class="navbar navbar-default" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Sort-service</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href=".${springMacroRequestContext.getRequestUri()}/admin">???????</a></li>
                        <li class="active"><a href=".${springMacroRequestContext.getRequestUri()}/user">?????? ???????? ????????????</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="http://github.com/SunPj/sort-service">??????????? ?? Github</a></li>
                    </ul>
                </div>
            </div>
        </nav>


        <div class="content">
            ${content}
        </div>

    </body>
</html>