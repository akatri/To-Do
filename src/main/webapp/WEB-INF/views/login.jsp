
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
<div class="container">

	<form action="/login.do" method="POST">
		<p>
			<font color="red">${error }</font>
		</p>

		<input type="text" name="name" placeholder="Username" required ><br>
		<br>
		<input type="password" name="password" placeholder="Password" required><br>
		<br>
		<input type="submit" value="login" class="btn btn-primary">

	</form>
	<label>Not registered?</label> <a href="/register.to" class="btn btn-primary">Register</a>

</div>
<%@ include file="../common/footer.jspf"%>


</body>
</html>