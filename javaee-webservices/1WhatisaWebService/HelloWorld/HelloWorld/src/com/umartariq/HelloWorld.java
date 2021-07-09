package com.umartariq;

import javax.jws.WebService;

@WebService
public class HelloWorld {
	
	public HelloWorld() {
		
	}
	
	public String displayAString(String s) {
		return "GlassFish is the Open Source Java EE Reference Implementation; as such, we welcome external contributions. " + s;
	}

}
