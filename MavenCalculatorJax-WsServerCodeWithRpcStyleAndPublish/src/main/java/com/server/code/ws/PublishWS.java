package com.server.code.ws;

import javax.xml.ws.Endpoint;

public class PublishWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endpoint.publish("http://localhost:9090/calculator/CalculatorWS", new CalculatorWSImplement());
		System.out.println("<<done>>");
	}
}
