<%@include file="index.jsp"%>

<form action="addCategory" method="post">
	<table class="table-bordered">
		<tr>
			<td colspan="2">Category Detail</td>
		</tr>

		<tr>
			<td>Category Name</td>
			<td><input type="text" name="categoryName" /></td>
		</tr>
		<tr>
			<td>Category Desc</td>
			<td><input type="text" name="categoryDesc" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Enter Category" /></td>
		</tr>
	</table>
</form>
<table class="table">
	<tr>
		<td colspan="3">Category Detail</td>
	</tr>
	<tr>
		<td>CategoryID</td>
		<td>categoryName</td>
		<td>CategoryDescription</td>
	</tr>
	
	<c:forEach items="${categoryList}" var="category">
	<tr>
	
		<td>${category.categoryid}</td>
		<td>${category.categoryname}</td>
		<td>${category.categorydescription}</td>
		<td>
		<a href="<c:url value="/deleteCategory/${category.categoryid}"/>">Delete</a>
		<a href="<c:url value="/editCategory/${category.categoryid}"/>">Edit</a>
		</td>
</tr>
	</c:forEach>
	</table>