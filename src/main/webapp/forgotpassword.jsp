<%@ include file="header.html"%>
<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">Enter Information</h3>
	</div>
	<div class="panel-body">

		<form action="insert" method="post">


			<input type="hidden" id="id" name="dispatchedID" value="" />
			<div class="form-group">
				<label for="name">UserName:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>

			<div class="form-group">
				<label for="country">Security Question</label> <select id="country"
					name="country" class="form-control">
					<option value="United States">What is your dog's name?</option>
					<option value="Bangladesh">What is mother's maiden name?</option>
					<option value="Germany">What is your nick name?</option>
					<option value="Canada">What is your favorite hobby?</option>
				</select>

			</div>
			<div class="form-group">
				<label for="name">Answer to Security Question</label> <input
					type="text" class="form-control" name="name" id="name"
					placeholder="Name" value="" />
			</div>

			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

</div>
<%@ include file="footer.html"%>