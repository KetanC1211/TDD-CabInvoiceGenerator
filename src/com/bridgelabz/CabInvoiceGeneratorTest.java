package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

	@Test
	public void test() {
		CabInvoiceGenerator c = new CabInvoiceGenerator();
		Assert.assertEquals(120.0,c.getInvoice(10, 20), 0);
		
	}
	@Test
	public void test1() {
		CabInvoiceGenerator c = new CabInvoiceGenerator();
		Assert.assertEquals(240.0,c.getInvoice(20, 40), 0);
	}
}
