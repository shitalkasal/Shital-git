public class factorial {
    public static void main(String[] args) {
        int number = 5; // Change this to compute factorial of a different number
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is 1
        }
        return n * factorial(n - 1); // Recursive call
    }
}