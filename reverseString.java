                                    //(7)Program to display the reverse of a given string

/* LOGIC : To get a reverse of a string, we assaign a for loop which should repeat untill the length of the given string and print 
           from last index position character,so decreament the loop untill it reaches final index value. */

import java.util.Scanner;
import java.math.*;
public class reverseString
{
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   System.out.println("enter the String:");
   String word = scan.nextLine();

   int l = word.length(); // getting the length of a string
   String rev = "";       // initializing the rev variable
   for(int i=(l-1);i>=0;i--)  // loop to  be repeat untill the final index value
   {
       rev = rev + word.charAt(i); // storing the i'th index valued letter by using charAt() function 
   }
   System.out.print("reversed String:"+rev); // printing the reversed string
} 
    
}
