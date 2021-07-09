package HelloWorld;

import javax.jws.WebService;

@WebService
public class HelloWorld {
	public void constructor(){
	
	}
	public String hello(String s) {
        return "Hello " + s;
    }
	
}
