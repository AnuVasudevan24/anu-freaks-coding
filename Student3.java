public class Student3 {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the student mark:");
		 int mark = sc.nextInt();
		 
		 System.out.println("enter grade A");
		 int gradeA=sc.nextInt();
		 System.out.println("enter grade B");
		 int gradeB=sc.nextInt();
		 System.out.println("enter grade C");
		 int gradeC=sc.nextInt();
		 System.out.println("enter gradeD");
		 int gradeD=sc.nextInt();
		 if(mark >=90) {
			 System.out.println("greater than or equal to 90 so its gradeA");
		 }else if(mark >=80) {
			 System.out.println("greater than or equal to 80 so its gradeB");
		 }else if(mark >=60) {
			 System.out.println("greater than or equal to 60 so its gradeC");
		 }else if(mark >=35) {
			 System.out.println("greater than or equal to 35 so its gradeD");
		 }else  {
			 System.out.println("lesser than 35 so its fail");
		 }
		sc.close();
	 }