public class PowerRecursive {

    // Recursive method to calculate base^exponent
    public static int power(int base, int exponent) {
        // Base case: anything to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        }
        // Recursive case
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        int base = 2;      // You can change this input
        int exponent = 3;  // You can change this input

        int result = power(base, exponent);
        System.out.println("Output: " + result);
    }
}
