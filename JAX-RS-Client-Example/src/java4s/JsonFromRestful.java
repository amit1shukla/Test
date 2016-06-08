package java4s;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/customers")
public class JsonFromRestful {
	
	@GET
	@Path("/{cusNo}")
	@Produces("application/json")
	public Customer produceCustomerDetailsinJSON(@PathParam("cusNo") int no) {

		/* 
		 * I AM PASSING CUST.NO AS AN INPUT, SO WRITE SOME BACKEND RELATED STUFF AND
		 * FIND THE CUSTOMER DETAILS WITH THAT ID. AND FINALLY SET THOSE RETRIEVED VALUES TO 
		 * THE CUSTOMER OBJECT AND RETURN IT, HOWEVER IT WILL RETURN IN JSON FORMAT :-) 
		 * */ 
		
		Customer cust = new Customer();		
			cust.setCustNo(no);
			cust .setCustName("Java4s");
			cust .setCustCountry("India");
			//convertFromLatLong(("18.92038860,72.83013059999999"));
			try {
				GoogleResponse res1 = new AddressConverter().convertFromLatLong("18.92038860,72.83013059999999");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  
		return cust;
		
	}
}