import java.util.Scanner;
class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n =sc.nextInt();
   
    for(int i=n;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print( j );
        }
      System.out.println();
    }
    sc.close();
    }
}