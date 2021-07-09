package test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld {
	
	public void constructor(){
	}
	@WebMethod
	public String hello(String data) {
        return "Hello " + data + ".";
    }
	
	@WebMethod
	public String talk(String input) {
		return input + " talks";
	}
}
