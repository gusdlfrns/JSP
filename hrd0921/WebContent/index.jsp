<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header{
	background-color:#0000ff;
	color:#ffffff;
	text-align:center;
	height:10%;
	line-height:80px;
}
html ,body{
	height:100%;
	weight:100%;
}
nav{
	background-color:mediumpurple;
	height:5%;
	line-height:40px;
}
nav ul{
	list-style-type:none;
}
nav li{
	display:inline;
	padding:0 4%;
}
section{
	height:80%;
}
footer{
	height:5%;
	background-color :#0000ff;
	color:#ffffff;
	text-align:center;
}
*{
	padding:0;
	margin:0;
}
</style>

</head>
<body>
	<%@ include file= "header.jsp" %>
	<%@ include file= "nav.jsp" %>
	<section>
	</section>
	<%@ include file= "footer.jsp" %>
</body>
</html>