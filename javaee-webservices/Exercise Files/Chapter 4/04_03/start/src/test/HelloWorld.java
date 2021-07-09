package test;

import javax.jws.WebService;

@WebService
public class HelloWorld {
	
	public void constructor(){
	}

	public String hello(String data) {
        return "Hello " + data + ".";
    }
}
