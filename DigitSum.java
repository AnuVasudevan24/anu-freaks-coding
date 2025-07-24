public class DigitSum {

    // Recursive method to calculate sum of digits
    public static int sumOfDigits(int number) {
        // Base case: if number becomes 0, stop recursion
        if (number == 0) {
            return 0;
        }
        // Recursive step: last digit + sum of remaining digits
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        int input = 342;  // You can change this input
        int result = sumOfDigits(input);
        System.out.println("Output: " + result);
    }
}