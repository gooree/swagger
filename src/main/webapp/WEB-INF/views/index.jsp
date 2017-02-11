<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Swagger入门演示</title>
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
	<script type="text/javascript">
		var ctx = '${ctx}';
	</script>
</head>
<body class="container">
	<h2>Swagger入门演示</h2>
	<h5>支持最低的spring版本为3.2.9.RELEASE</h5>
	<table class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>Name</th>
				<th>Description</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><a href="#api">@Api</a></td>
				<td>Marks a class as a Swagger resource.</td>
			</tr>
			<tr>
				<td><a href="#apiimplicitparam-apiimplicitparams">@ApiImplicitParam</a></td>
				<td>Represents a single parameter in an API Operation.</td>
			</tr>
			<tr>
				<td><a href="#apiimplicitparam-apiimplicitparams">@ApiImplicitParams</a></td>
				<td>A wrapper to allow a list of multiple ApiImplicitParam objects.</td>
			</tr>
			<tr>
				<td><a href="#apimodel">@ApiModel</a></td>
				<td>Provides additional information about Swagger models.</td>
			</tr>
			<tr>
				<td><a href="#apimodelproperty">@ApiModelProperty</a></td>
				<td>Adds and manipulates data of a model property.</td>
			</tr>
			<tr>
				<td><a href="#apioperation">@ApiOperation</a></td>
				<td>Describes an operation or typically a HTTP method against a specific path.</td>
			</tr>
			<tr>
				<td><a href="#apiparam">@ApiParam</a></td>
				<td>Adds additional meta-data for operation parameters.</td>
			</tr>
			<tr>
				<td><a href="#apiresponses-apiresponse">@ApiResponse</a></td>
				<td>Describes a possible response of an operation.</td>
			</tr>
			<tr>
				<td><a href="#apiresponses-apiresponse">@ApiResponses</a></td>
				<td>A wrapper to allow a list of multiple ApiResponse objects.</td>
			</tr>
			<tr>
				<td><a href="#authorization-authorizationscope">@Authorization</a></td>
				<td>Declares an authorization scheme to be used on a resource or an operation.</td>
			</tr>
			<tr>
				<td><a href="#authorization-authorizationscope">@AuthorizationScope</a></td>
				<td>Describes an OAuth2 authorization scope.</td>
			</tr>
		</tbody>
	</table>
	
	<a class="btn btn-default" href="${ctx}/swagger/index.html">查看接口文档</a>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
