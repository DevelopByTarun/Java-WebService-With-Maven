package com.bc.server.code.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BasicCalculatorWS {
	
			// for addition
			@WebMethod
			public int add(int add1, int add2);
			
			// for subtraction
			@WebMethod
			public int subtract(int sub1, int sub2);
			
			// for multiplication
			@WebMethod
			public int multiply(int mul1, int mul2);
			
			// for division
			@WebMethod
			public int divide(int div1, int div2);
			
			// for square root
			@WebMethod
			public int square(int sq);
			
			// for cube root
			@WebMethod
			public int cube(int cb);
}
