<!DOCTYPE html>
<html>  
    <head>  
        <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>  
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>  
        <title>WebJars Demo</title>  
        <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />  
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    </head>  
    <body>  
        <div class="container">
            <h3>${msg}</h3>
            
            <#list list as item>
	            <div class="panel panel-default">
				  <div class="panel-body">
				    <h4>panel</h4> 
				    <br>
				    ${item}
				  </div>
				</div>
            </#list>
        </div>  
    </body>  
</html>