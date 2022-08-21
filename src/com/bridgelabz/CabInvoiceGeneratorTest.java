package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	@Test
	public void test() {
		CabInvoiceGenerator c = new CabInvoiceGenerator();
		Assert.assertEquals(120.0,c.getInvoice(10, 20,"R"), 0);
	}
	

	@Test
	public void test1() {
		CabInvoiceGenerator c = new CabInvoiceGenerator();
		Assert.assertEquals(360.0,c.generateInvoiceAsPerUserID(2),0);
	}
	
	@Test
	public void test2() {
		CabInvoiceGenerator c = new CabInvoiceGenerator();
		Assert.assertEquals(220.0,c.getInvoice(10, 20,"P"), 0);
	}
	
}
