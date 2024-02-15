package practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindMaxTests {
	
	@Test
    void nullArrayTest() {
		int[] nullArr = null;
        assertEquals(0, ArrayHelpers.findMax(nullArr));
    }
	
	@Test
    void emptyArrayTest() {
		int[] emptyArr = {};
        assertEquals(0, ArrayHelpers.findMax(emptyArr));
    }
	
	@Test
	void oneElementTest() {
		int[] oneArr = {1};
        assertEquals(1, ArrayHelpers.findMax(oneArr));
    }
	
	@Test
	void multiElementTest() {
		int[] arr = {1, -19, 5, 2};
        assertEquals(5, ArrayHelpers.findMax(arr));
    }
	
	@Test
	void allNegTest() {
		int[] arr = {-1, -19, -5, -2};
        assertEquals(-1, ArrayHelpers.findMax(arr));
    }
}
