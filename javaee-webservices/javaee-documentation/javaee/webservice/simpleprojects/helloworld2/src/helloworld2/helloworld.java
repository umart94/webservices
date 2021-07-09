package helloworld2;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class helloworld {
	
	private Map<Integer, BigInteger> memo = new HashMap<>();
	
	public void constructor() {
		memo.clear();
	}
	
	public String Hello(String s) {
		return "Hello" + s;
	}
	
	@WebMethod
	public ArrayList<Integer> fibonacci(int n) {
		ArrayList<Integer> listOfFibonaccinthTerms = new ArrayList<>();
		 int prevterm = 0, nextterm = 1;
	        
	        System.out.print("Upto " + n + ": ");
	        while (prevterm <= n)
	        {
	            
	        	listOfFibonaccinthTerms.add(prevterm);
	            int sum = prevterm + nextterm;
	        	prevterm = nextterm;
	        	nextterm = sum;
	        }
		
	        return listOfFibonaccinthTerms;
		
	}
	
	

	

	
	
}
