
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
<div class="container">
	<div>
		<form action="/add-todo.do" method="post">
			<fieldset class="form-group">
				<label>Description</label><input type="text"
					placeholder="Add a ToDo" name="newToDo" class="form-control">
			</fieldset>
			<fieldset class="form-group">
				<label>Category</label><input type="text" placeholder="Category"
					name="category" class="form-control">
			</fieldset>
			<input type="submit" value="Add" class="btn btn-success">


		</form>


	</div>

</div>


<%@ include file="../common/footer.jspf"%>


</body>
</html>

