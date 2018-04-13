
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
<div class="container">

	<form action="/login.do" method="POST">
		<p>
			<font color="red">${error }</font>
		</p>
		Name :<input type="text" name="name"> Password :<input
			type="password" name="password"> <input type="submit"
			value="login">


	</form>

</div>
<%@ include file="../common/footer.jspf"%>


</body>
</html>