package com.server.code.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculatorWS {
	
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
}
