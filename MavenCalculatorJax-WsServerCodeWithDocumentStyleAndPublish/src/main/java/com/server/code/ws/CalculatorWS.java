package com.server.code.ws;

import javax.jws.WebService;

@WebService(name = "Calculator")
public interface CalculatorWS {
	
		// for addition
		public int add(int add1, int add2);
		
		// for subtraction
		public int subtract(int sub1, int sub2);
		
		// for multiplication
		public int multiply(int mul1, int mul2);
		
		// for division
		public int divide(int div1, int div2);
}
