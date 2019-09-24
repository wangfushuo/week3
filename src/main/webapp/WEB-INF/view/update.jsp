<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>

</head>
<body>
     <table>
         <tr>
            <td>项目名称<input type="text" name="name" value="${name }"></td>
         </tr>
         <tr>
            <td>所属部门<select class="type" name="dptId.dname"></select></td>
         </tr>
         <tr>
            <td>投资金额<input type="text" name="" value="${name }"></td>
         </tr>
         <tr>
            <td>分管领导<input type="text" name="manager" value="${manager }"></td>
         </tr>
         <tr>
            <td>项目介绍<input type="text" name="content" value="${content }"></td>
         </tr>
     </table> 
   


</body>
</html>