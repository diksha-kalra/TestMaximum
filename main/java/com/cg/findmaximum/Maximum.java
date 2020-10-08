package com.cg.findmaximum;

public class Maximum {

	public static Integer findIntegerMaximum(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if (num2.compareTo(max) > 0) {
			max = num2;
		}
		if (num3.compareTo(max) > 0) {
			max = num3;
		}
		printMaxInteger(num1, num2, num3, max);
		return max;
	}

	public static Float findFloatMaximum(Float num1, Float num2, Float num3) {
		Float max = num1;
		if (num2.compareTo(max) > 0) {
			max = num2;
		}
		if (num3.compareTo(max) > 0) {
			max = num3;
		}
		printMaxFloat(num1, num2, num3, max);
		return max;
	}

	public static void printMaxInteger(Integer num1, Integer num2, Integer num3, Integer max) {
		System.out.printf("Max of %d, %d and %d is  %d\n", num1, num2, num3, max);
	}

	public static void printMaxFloat(Float num1, Float num2, Float num3, Float max) {
		System.out.printf("Max of %.2f, %.2f and %.2f is  %.2f\n", num1, num2, num3, max);

	}
}
