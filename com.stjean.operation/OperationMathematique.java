import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OperationMathematique {
    // checking if a number is positive
    public boolean estpositif(int number){
        return number > 0;
    }
    public static void main(String[] args) {
        OperationMathematique operation = new OperationMathematique();

        System.out.println(operation.estPositif(5));  // Output: true
        System.out.println(operation.estPositif(-3)); // Output: false
        System.out.println(operation.estPositif(-4));  // Output: false
    }

    public int factorial(int number) throws IllegalParamISIException {
        if (number < 0) throw new IllegalParamISIException("Factorial of a negative number is undefined");
        // existing factorial logics
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        int num = 5; // Example number
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    public Integer[] sort(Integer[] list) {
        List<Integer> intList = Arrays.asList(list); // Convert array to list for easy sorting
        Collections.sort(intList, Collections.reverseOrder()); // Sort in descending order
        return intList.toArray(new Integer[0]); // Convert back to array
    }
}

