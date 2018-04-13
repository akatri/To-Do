<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

	<div class="container">
		<h1>
			Hello <em>${name}</em>
		</h1>
		<p>Your ToDo's are :</p>
		<table class="table table-striped">
			<thead>
			<th>Description</th>
			<th>Category</th>
			<th>Actions</th>
			</thead>
			<tbody>
				<c:forEach var="list" items="${toDoList}">
					<tr>
						<td>${list.name }</td>
						<td>${list.category }</td>
						<td><a
							href="/deletetodo.do?name=${list.name }&category=${list.category}"
							class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>




		</table>

		<a href="/add-todo.do" class="btn btn-success">Add a ToDo</a>

	</div>

	<%@ include file="../common/footer.jspf" %>

</body>
</html>