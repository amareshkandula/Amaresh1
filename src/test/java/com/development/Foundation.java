package com.development;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Foundation {

	@Test
	public void testAComposer(){
		System.out.println("Running Composer Test Cases");
	}
	
	@Test
	public void testBWorkflow(){
		System.out.println("Running Workflow Test Cases");
	}
	
	@Test
	public void testCFoundation(){
		System.out.println("Running Foundation Test Cases");
	}
	
	@Test
	public void testDSAP(){
		System.out.println("Running SAP Test Cases");
	}
	
	@Test
	public void testELMS(){
		System.out.println("Running LMS Test Cases");
	}
}
