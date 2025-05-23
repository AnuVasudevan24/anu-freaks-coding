import java.util.*;
class Loop1{
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=0;i<y;i++){
            System.out.println(x);
        }
        sc.close();
    }
}
    