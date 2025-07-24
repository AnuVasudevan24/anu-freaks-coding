class Main {
    public static void main(String[] args) {
        
         int number = 353445;  // You can change this input
        int count = 0;
        int temp = number;

        // Special case for 0
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Output: " + count);
    }
}