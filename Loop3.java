import java.util.*;
class Loop3 {
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        System.out.println("name");
        String firstname=sc.next();
        String lastname=sc.next();
        int n = sc.nextInt();
        
        
        for(int i=0;i<5;i++){
            System.out.print(firstname+"" + lastname+"");
        }
        sc.close();
    }
}
    