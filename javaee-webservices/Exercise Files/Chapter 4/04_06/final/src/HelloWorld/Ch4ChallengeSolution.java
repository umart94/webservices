package HelloWorld;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value = "RESTfulRoot")
public class Ch4ChallengeSolution {
	
	ArrayList<Integer> data = new ArrayList<Integer>();

	public Ch4ChallengeSolution() {
	}
	
    @GET
    @Consumes("text/xml")
    @Produces("text/xml")
	public int get(int index) {
    	return data.get(index);
	}
    
    @PUT
    @Consumes("text/xml")
    public void put(int index, int value) {
    	while(data.size()<=index) {
    		data.add(0);
    	}
    	data.set(index,value);
    }
    
    @DELETE
    @Consumes("text/xml")
    public void post(int index) {
    	data.remove(index);
    }
}
