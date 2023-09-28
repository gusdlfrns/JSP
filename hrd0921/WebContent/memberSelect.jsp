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
	<%@ include file= "dbcone.jsp" %>
	<section>
	<h1>회원조회</h1>
	<table border=1>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>phone</td>
			<td>address</td>
		</tr>
		<%
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			String sql="select * from member0921";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				System.out.println(id);
				System.out.println(name);
				System.out.println(phone);
				System.out.println(address);
			}
		%>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
	</section>
	<%@ include file= "footer.jsp" %>
</body>
</html>