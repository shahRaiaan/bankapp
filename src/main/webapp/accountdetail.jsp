<%@ include file="header.html"%>
<%@ page import="com.remotetiger.bankapp.Customer"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">Customer Details</h3>
	</div>
	<div class="panel-body">

		<form action="insert" method="post">
			<%
				Customer dispatchedCustomer = (Customer) request.getAttribute("Customer");
			%>

			<input type="hidden" id="id" name="dispatchedID" value="" />
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="<%=dispatchedCustomer != null ? dispatchedCustomer.getId() : ""%>" />
			</div>
			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					class="form-control" id="address" name="address"
					placeholder="Address"
					value="<%=dispatchedCustomer != null ? dispatchedCustomer.getAddress().getHouseno() + " "
					+ dispatchedCustomer.getAddress().getStreetname() + " "
					+ dispatchedCustomer.getAddress().getZipcode() : ""%>" />
			</div>
			<div class="form-group">
				<label for="name">Date of Birth:</label> <input type="text"
					class="form-control" name="name" id="name" placeholder="Name"
					value="<%=dispatchedCustomer != null ? dispatchedCustomer.getDateofbirth() : ""%>" />
			</div>

		</form>
	</div>

</div>
<%@ include file="footer.html"%>