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

<script type="text/javascript">


function check(flag) {
	if(flag==1){
		$(".ids").prop("checked",true)
	}else if(flag==2){
		$(".ids").prop("checked",false)
	}else{
		$(".ids").each(functoin(){
			this.checked=!this.checked
		})
	}
}


function delete(id) {

	alert(id)
	var id=$("ids:cheched").val(function(msg) {
		if(msg){
			alert("删除成功")
			location.href="redirect:selects"
		}else{
			alert("删除失败")
		}
	})	
	
}


</script>

</head>
<body>
<form action="selects" method="post">
<input type="text" name="name"  placeholder="按项目名称查找">
<input type="submit" value="查找"> 
</form>
 <table>
      <tr>
           <td>
              <button type="button" onclick="check(1)">全选</button>
              <button type="button" onclick="check(2)">全选</button>
              <button type="button" onclick="check(3)">全选</button>
           </td>
          <td>编号</td>
          <td>项目名称</td>
          <td>投资金额</td>
          <td>分管领导</td>
          <td>部门</td>
          <td>操作</td>
      
      </tr>
   <c:forEach items="${ plans}" var="b" varStatus="i">
    <tr>
      <td> <input type="text" class="ids" name=${b.id }></td>
       <td>${i.index+1 }</td>
       <td>${b.name }</td>
       <td>${b.amount}</td>
       <td>${b.manager}</td>
       <td>${b.dptId.dname}</td>
       <td>
       <button type="button" onclick="delete(${b.id})">批量删除</button>
       <button type="button" onclick="update(${b.id})">修改</button>
       <button type="button" onclick="select()">查看详情</button>
       
       </td>
    </tr>
   </c:forEach>
    <tr>
       <td colspan="5"> ${page }</td>
    </tr>
 </table>


</body>
</html>