package io.javabrains.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

//learned on 2025-11-05
class MathUtilsTest {
	
	private MathUtils mathUtils;
	
	
	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
	}

	@Nested
	class AddTest {
		@Test
		void testAddingTwoPositives() {
			assertEquals(2, mathUtils.add(1, 1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingTwoNegatives() {
			assertEquals(-2, mathUtils.add(-1, -1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingAPositiveAndANegative() {
			assertEquals(0, mathUtils.add(-1, 1), 
					"Add method should return the sum of two numbers");
		}
	}
	
	@Test 
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathUtils.multiply(1, 0)),
				() -> assertEquals(1, mathUtils.multiply(1, 1)),
				() -> assertEquals(6, mathUtils.multiply(2, 3))
				);
	}
	
	@Test 
	void computeCircleArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), 
				"Should return right circle area");
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), 
				"Divide should throw ArithmeticException when denominator is zero");
	}

    //mine
    @Test
    void testSubstract(){
        assertEquals(3,mathUtils.subtract(4,1),"subtact should shoe the difference.");
    }

    @Nested
    class SubTwo{
        @Test
        void testSubtractTwoPositive(){
            assertEquals(4,mathUtils.subtract(5,1),"Testing two positive numbers.");
        }

        @Test
        void testSubtractTwoNegetive(){
            assertEquals(-5,mathUtils.subtract(-10,-5),"Testing two Negetive numbers");
        }

        @Test
        void testSubtractPositiveNegetive(){
            assertEquals(8,mathUtils.subtract(5,-3),"Testing one positive and one negetive");
        }
    }
	
}