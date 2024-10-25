public class TestOperationMathematique {
    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    public class TestOperationMathematique {

        @Test
        public void testFactorial() {
            OperationMathematique operation = new OperationMathematique();

            // Testing factorial of 0 and 1, edge cases
            assertEquals(1, operation.factorial(0), "Factorial of 0 should be 1");
            assertEquals(1, operation.factorial(1), "Factorial of 1 should be 1");

            // Testing factorial of positive numbers
            assertEquals(120, operation.factorial(5), "Factorial of 5 should be 120");
            assertEquals(720, operation.factorial(6), "Factorial of 6 should be 720");
        }

        @Test
        public void testOtherOperations() {
            OperationMathematique operation = new OperationMathematique();

            // Example assertions for other hypothetical methods
            assertTrue(operation.isEven(4), "4 should be an even number");
            assertFalse(operation.isEven(5), "5 should be an odd number");

            assertEquals(8, operation.add(3, 5), "3 + 5 should equal 8");
        }
    }

}
