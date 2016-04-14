import java.util.Scanner;
 
class S2Assignment1
{
   public static void main(String args[])
   {
      int age;
 
      Scanner in = new Scanner(System.in);

      System.out.println("Enter your age");
      age = in.nextInt();
      System.out.println("You age is - "+age);
	  
	  if(age < 18) {
		  System.out.println("You are not elisible for vote.");  
     } else {
		 System.out.println("You are elisible for vote.");  
	 }
}
}