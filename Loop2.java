import java.util.*;
class Loop2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=n;i<=1000;i+=n){
            System.out.println(i);
        }
        sc.close();
    }
}