class Palindrome2 {
    public static void main(String[] args) {
       int n = 987987, sum = 0;
      
       while(n > 0){
         int l = n%10;
           sum = sum*10+(l);
           n = n/10;
       }
       System.out.println(sum);
      
}
}