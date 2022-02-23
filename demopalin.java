                                        //(4) program to check whether a given string is palindrome or not

/*LOGIC : To check whether a given string is palindrome, lets reverse the string and compare the given string and reversed is equal or not.*/

import java.util.Scanner;
public class demopalin 
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the string:");
       String word  = scan.nextLine(); // get a string as an input from the user to check it is palindrome.
       
       String rev = "";
       int length = word.length(); // getting length of a given string
       
       for(int i= length-1;i>=0;i--)
       {
           rev = rev + word.charAt(i); // reversing the letters at string to compare

       }
       System.out.println("reversed string:"+rev); // to display the reversed string

       if(word.equals(rev)) // comparing whether the given string is equal to reversed string or not
       {
        System.out.println("the given string is palindrome!");
       }
       else
       {
         System.out.println("the given string is not a palindrome!");

       }
       
       
   } 
}
