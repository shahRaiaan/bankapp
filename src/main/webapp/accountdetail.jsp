<%@ include file="header.html"%>
<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">Customer Details</h3>
	</div>
	<div class="panel-body">

		<form action="insert" method="post">


			<input type="hidden" id="id" name="dispatchedID" value="" />
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>
			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					class="form-control" id="address" name="address"
					placeholder="Address" value="" />
			</div>
			<div class="form-group">
				<label for="name">Date of Birth:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="" />
			</div>

		</form>
	</div>

</div>
<%@ include file="footer.html"%>