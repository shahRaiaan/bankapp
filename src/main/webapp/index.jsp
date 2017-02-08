<%@ include file="header.html"%>
<div class="container">

	<form class="form-signin" action="" method="post">
		<h2 class="form-signin-heading">Please sign in</h2>
		<label for="userName" class="sr-only">Username</label> <input
			name="getUserName" type="userName" id="inputName"
			class="form-control" placeholder="Username" required autofocus>
		<label for="inputPassword" class="sr-only">Password</label> <input
			name="getUserPassword" type="password" id="inputPassword"
			class="form-control" placeholder="Password" required>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
			in</button>
		<br> <a class="form-signin" href="createAccount.jsp">Create
			Account</a> <a class="form-signin" href="forgotpassword.jsp">Forgot
			Password?</a>
	</form>

</div>
<%@ include file="footer.html"%>
<!-- /container -->
