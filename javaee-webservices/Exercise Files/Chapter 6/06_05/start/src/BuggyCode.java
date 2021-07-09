import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BuggyCode {
	
	CopyOnWriteArrayList<Integer> data;
	
	@WebMethod
	public void constructor() {
		for(int i=1; i<1024; i++) {
			Random r = new Random();
			data.add(r.nextInt(1024));
		}
	}
	
	@WebMethod
	public int search(int value) {
		for(int i=0; i<data.size(); i++) {
			if(data.get(i) == value) {
				return i;
			}
		}
		return -1;
	}

}
