class Palindrome1 {
    public static void main(String[] args) {
       int n = 325345, sum = 0;
      
       while(n > 0){
         int l = n%10;
           sum = sum*10+(l);
           n = n/10;
       }
       System.out.println(sum);
      
}
}
       
        
       
     