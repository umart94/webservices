package webService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BuggyCode {
	
	List<Integer> data = new ArrayList<Integer>();
	
	@WebMethod
	public boolean constructor() {
		Random r = new Random();
		for(int i=1; i<1024; i++) {
			data.add(r.nextInt(1024));
		}
		Collections.sort(data);
		return true;
	}
	
	@WebMethod
	public int search(int value) {
		int low = 0;
		int high = data.size()-1;
		while(low != high) {
			if(data.get((low+high)/2) == value) return (low+high)/2;
			if(data.get((low+high)/2) > value) {
				high = (low+high)/2;
			}
			else {
				low = (low+high)/2+1;
			}
		}
		return -1;
	}

}
