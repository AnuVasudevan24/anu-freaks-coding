public class DivisorsRecursive {

    // Recursive method to print divisors
    public static void printDivisors(int number, int current) {
        if (current > number) {
            return; // base case: stop when current exceeds the number
        }

        if (number % current == 0) {
            System.out.print(current + " ");
        }

        printDivisors(number, current + 1); // recursive call
    }

    public static void main(String[] args) {
        int input = 6;  // You can change the number here
        System.out.print("Output: ");
        printDivisors(input, 1);
    }
}