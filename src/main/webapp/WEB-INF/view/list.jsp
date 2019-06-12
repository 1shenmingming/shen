<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/index2.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="删除影片" onclick="del()"> 
	<input type="button" value="查询影片" onclick="cha()">
	<table>
		<tr>
			<td><input type="checkbox" id="qx">全选/全不选<input type="checkbox" id="fx">反选</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<c:if test="${flag==3 }"><td><a href="list?flag=2">上映时间</a></td></c:if>
			<c:if test="${flag==2 }"><td><a href="list?flag=1">上映时间</a></td></c:if>
			<c:if test="${flag==1 }"><td><a href="list?flag=2">上映时间</a></td></c:if>
			<c:if test="${timel==3 }"><td><a href="list?timel=2">时长</a></td></c:if>
			<c:if test="${timel==2 }"><td><a href="list?timel=1">时长</a></td></c:if>
			<c:if test="${timel==1 }"><td><a href="list?timel=2">时长</a></td></c:if>
			<td>类型</td>
			<c:if test="${dai==3 }"><td><a href="list?dai=2">年代</a></td></c:if>
			<c:if test="${dai==2 }"><td><a href="list?dai=1">年代</a></td></c:if>
			<c:if test="${dai==1 }"><td><a href="list?dai=2">年代</a></td></c:if>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
	<c:forEach items="${list }" var="x">
		<tr>
			<td><input type="checkbox" class="a" name="all" value="${x.id }"></td>
			<td>${x.name }</td>
			<td>${x.author }</td>
			<td>${x.price }</td>
			<td>${x.sdate }</td>
			<td>${x.ltime }</td>
			<td>${x.lei }</td>
			<td>${x.nyear }</td>
			<td>${x.area }</td>
			<c:if test="${x.status==1}"><td>即将上映</td></c:if>
			<c:if test="${x.status==0}"><td>已经下架</td></c:if>
			<c:if test="${x.status==2}"><td>正在热映</td></c:if>
				
		
			<c:if test="${x.status==0}"><td><input type="button" value="上架" onclick="sj(${x.id})"></td></c:if>
			<c:if test="${x.status==1}"><td><input type="button" value="下架" onclick="xj(${x.id})"></td></c:if>
			<c:if test="${x.status==2}"><td><input type="button" value="下架" onclick="xj(${x.id})"></td></c:if>
		
		</tr>
	</c:forEach>
	<tr>
		<td colspan="11">${fenye }</td>
	</tr>
	</table>
	<form action="list" method="post" style="display: none" id="xx">
		影片名称<input type="text" name="name"><br>
		导演<input type="text" name="author"><br>
		电影年代<select name="year">
			<option value="0">--请选择--</option>
			<option value="2013">2013</option>
			<option value="2014">2014</option>
			<option value="2015">2015</option>
			<option value="2016">2016</option>
			<option value="2017">2017</option>
			<option value="2018">2018</option>
			<option value="2019">2019</option>
		</select><br>
		
		上映时间<input type="text" name="sstart" onclick="WdatePicker()">至<input type="text" name="send" onclick="WdatePicker()"><br>
		价格<input type="text" name="pstart">-<input type="text" name="pend"><br>
		电影时长<input type="text" name="lstart" value="${lstart==0?'':lstart }">-<input type="text" name="lend" value="${lend==999?'':lend }"><br>
		<input type="submit" value="查询影片"><input type="reset" value="重置查询">
	</form>
	<script type="text/javascript">
		$("#qx").click(function() {
			$(".a").prop("checked",$(this).prop("checked"));
		})
		$("#fx").click(function() {
			$(".a").each(function() {
				$(this).prop("checked",!$(this).prop("checked"));
			})
		})
		function sj(pp) {
			$.ajax({
				url:"upsj",
				type:"post",
				data:{id:pp},
				success:function(obj){
					if(obj){
						alert("上架成功");
						location.href="list";
					}
				}
			})
		}
		function xj(ppp) {
			$.ajax({
				url:"upxj",
				type:"post",
				data:{id:ppp},
				success:function(obj){
					if(obj){
						alert("下架成功");
						location.href="list";
					}
				}
			})
		}
		function cha() {
			$("#xx").show();
		}
		function del() {
			var ids="";
			$(":checkbox:checked.a").each(function() {
				ids+=","+$(this).val();
			})
			ids=ids.substring(1);
			$.ajax({
				url:"del",
				type:"post",
				data:{ids:ids},
				success:function(obj){
					if(obj){
						alert("删除成功");
						location.href="list";
					}
				}
			})
		}
	</script>
</body>
</html>