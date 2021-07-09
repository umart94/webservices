package scheduler;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="root")
public class root {
	
	public root() {
		
	}
	
	/*@POST
	@Produces("text/plain")
	@Consumes("text/plain")
	public String post(String s) throws IOException {
		if(ScheduleFunction.updateTime(s) == true) {
			return "Success";
		}
		else {
			return "Failure";
		}
	}*/
	
	@POST
	public String post(String date) throws IOException {
		if(ScheduleFunction.updateTime(date) == true) {
			return "Success";
		}
		else {
			return "Failure";
		}
	}
	
	@GET
	public String get(String date) throws IOException {
		if(ScheduleFunction.checkTime(date) == true) {
			return "Open";
		}
		else {
			return "Filled";
		}
	}
	

}
