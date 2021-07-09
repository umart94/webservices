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
	
	@POST
	@Consumes("text/plain")
	@Produces("text/plain")
	public String post(String date) throws IOException {
		if(ScheduleFunction.updateTime(date)) {
			return "Success!";
		}
		return "Failure!";
	}
	
	@GET
	@Consumes("text/plain")
	@Produces("text/plain")
	public String get(String date) throws IOException {
		if(ScheduleFunction.checkTime(date)) {
			return "Open";
		}
		return "Filled";
	}
}
