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

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        int num = 5; // Example number
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}

