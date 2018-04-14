<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">

	<form action="/register.to" method="post">
		<fieldset class="form-group">

			<label>Name </label><br>
			<input type="text" name="username" required class="span3"><br>
		</fieldset>

		<fieldset class="form-group">

			<label class="control-label">Password </label><br>
			<input type="text" name="password" required class="span3"><br>
		</fieldset>
		<fieldset class="form-group">

			<label>Phone </label><br> <input type="number" name="phonenum"
				required class="span3"><br>
		</fieldset>


		<input type="submit" value="Register" class="btn btn-success">

	</form>



</div>
<%@ include file="../common/footer.jspf"%>
</body>
</html>