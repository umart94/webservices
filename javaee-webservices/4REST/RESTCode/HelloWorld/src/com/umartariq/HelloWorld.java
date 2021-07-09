package com.umartariq;

import java.util.ArrayList;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.soap.MTOM;
@MTOM
@WebService(name="newname")
public class HelloWorld {
	
	public HelloWorld() {
		
	}
	@XmlMimeType("[name]") DataHandler data;
	
	@WebMethod
	public String displayAString(String s) {
		return "ssl web service" + s;
	}
	
	@WebMethod
	public ArrayList<Integer> fibonacci(int index) {
		ArrayList<Integer> listOfFibonaccinthTerms = new ArrayList<>();
		
		int n = index, n1 = 0, n2 = 1;
        
		listOfFibonaccinthTerms.add(0);
		listOfFibonaccinthTerms.add(1);
        while (n1 <= n)
        {
            

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            listOfFibonaccinthTerms.add(n2);
        }
		
		return listOfFibonaccinthTerms;
	}

}
