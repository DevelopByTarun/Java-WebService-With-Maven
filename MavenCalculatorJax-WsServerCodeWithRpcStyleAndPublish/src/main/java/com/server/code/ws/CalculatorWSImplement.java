package com.server.code.ws;

import javax.jws.WebService;

@WebService(
		portName = "CalculatorPort", 
		serviceName = "CalculatorService",	
		endpointInterface = "com.server.code.ws.CalculatorWS"	
	)
public class CalculatorWSImplement implements CalculatorWS {
	
		// for addition implementation
		public int add(int add1, int add2) {
			return add1 + add2;
		}
		
		// for subtraction implementation
		public int subtract(int sub1, int sub2) {
			return sub1 - sub2;
		}
		
		// for multiplication implementation
		public int multiply(int mul1, int mul2) {
			return mul1 * mul2;
		}
		
		// for division implementation
		public int divide(int div1, int div2) {
			return div1 / div2;
		}
}
