package com.cg.findmaximum;

import org.junit.Test;
import org.junit.Assert;

public class TestMaximum {
	@Test
	public void testIntegerMaxWithMaxAtFirstPosition() {
		Integer max = Maximum.findIntegerMaximum(50, 40, 10);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtSecondPosition() {
		Integer max = Maximum.findIntegerMaximum(40, 50, 10);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtThirdPosition() {
		Integer max = Maximum.findIntegerMaximum(10, 40, 50);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
}
