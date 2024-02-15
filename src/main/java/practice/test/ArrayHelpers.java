package practice.test;

import java.util.Arrays;

public class ArrayHelpers {

	public static void main(String[] args) {

		int[] urTestValues = { 10, 3, 23, 72, 44 };
		int maxValue = findMax(urTestValues);
		System.out.format("Max value is %d.\n", maxValue);

		int[] nullTestValues = null;
		maxValue = findMax(nullTestValues);
		System.out.format("Max value of null returns %d.\n", maxValue);

		int[] emptyTestValues = {};
		maxValue = findMax(emptyTestValues);
		System.out.format("Max value of empty set returns %d.\n", maxValue);

		int[] singleTestValues = { 9 };
		maxValue = findMax(singleTestValues);
		System.out.format("Single value set. Max value is %d.\n", maxValue);

		int[] spicyTestValues = { 9, -900, 88, 0, 88 };
		maxValue = findMax(spicyTestValues);
		System.out.format("Max value is %d.\n\n", maxValue);

		int[] urNegValues = { 4, -3, -2, -1, -5 };
		int minValue = findMin(urNegValues);
		System.out.format("Min value is %d.\n", minValue);

		minValue = findMin(nullTestValues);
		System.out.format("Min value of null returns%d.\n", minValue);

		minValue = findMin(emptyTestValues);
		System.out.format("Min value of empty set returns%d.\n", minValue);

		minValue = findMin(singleTestValues);
		System.out.format("Single value set. Min value is %d.\n", minValue);
	}

	static int findMax(int[] testValues) {
		if (testValues == null || testValues.length == 0) {
			return 0;
		} else if (testValues.length == 1) {
			return testValues[0];
		}

		int intMax = testValues[0];
		for (int n : testValues) {
			if (n > intMax) {
				intMax = n;
			}
		}
		return intMax;

//				Arrays.sort(urTestValues);
//				return urTestValues[urTestValues.length-1];
	}

	private static int findMin(int[] testValues) {
		if (testValues == null || testValues.length == 0) {
			return 0;
		} else if (testValues.length == 1) {
			return testValues[0];
		}

		int intMin = testValues[0];
		for (int n : testValues) {
			if (n < intMin) {
				intMin = n;
			}
		}
		return intMin;

//				Arrays.sort(urTestValues);
//				return urTestValues[0];
	}
}
