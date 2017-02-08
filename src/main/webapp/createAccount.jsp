<%@ include file="header.html"%>
<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">Enter Information</h3>
	</div>
	<div class="panel-body">

		<form action="insert" method="post">


			<input type="hidden" id="id" name="dispatchedID" value="" />
			<div class="form-group">
				<label for="name">Username:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">Password:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">Security-Question:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">Security-Answer:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">Date of Birth:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">Street Name:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">House No:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">Zipcode:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="name">Given Id:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>

			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

</div>
<%@ include file="footer.html"%>