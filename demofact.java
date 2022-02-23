                                 //(3) Program to display Factorial of a given number

 //LOGIC : to get a factorial of agiven number multiple  all the positive integers untill the given number.
 
 import java.util.Scanner;

 public class demofact
 {
   public static void main(String[] args)
   {
       Scanner scan=new Scanner(System.in); //creating a new object named as scan to the Scanner class
       System.out.println("Enter the number:"); //geting the number as an input, which factorial should be calculate 
       int n = scan.nextInt();

        int fact = 1; 
       for(int i=1;i<=n;i++)
       {
           fact = fact*i; // storing the intermediate value of product as fact
       }
       System.out.println("factorial of"+" "+ n +" "+"is"+" "+fact);
   } 
}
