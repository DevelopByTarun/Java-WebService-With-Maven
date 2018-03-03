package com.bc.server.code.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(
		portName = "BasicCalculatorPort", 
		serviceName = "BasicCalculatorService",	// calling through service name
		endpointInterface = "com.bc.server.code.ws.BasicCalculatorWS"	
	)
@SOAPBinding(style = Style.DOCUMENT)
public class BasicCalculatorWSImplement implements BasicCalculatorWS {
	
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
				
				// for square root implementation
				public int square(int sq) {
					return sq * sq;
				}
				
				// for cube root implementation
				public int cube(int cb) {
					return cb * cb * cb;
				}
}
