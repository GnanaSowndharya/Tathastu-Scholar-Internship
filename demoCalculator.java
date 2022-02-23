//                                        (1) simple calculator program

/*logic: get 2 numbers as an input from user and get the operation to be done,then perform the operation by using switch
 cases and return the computed answer*/

import java.io.*;
import java.util.Scanner;
public class demoCalculator 
{
    public static void main(String[] args) // Main function 
    {    
        System.out.println("enter the numbers:");
        Scanner scan = new Scanner(System.in); //creating new object named as scan to the Scanner class
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("enter the operator:");
        char opr = scan.next().charAt(0); //get an operator as an input

        int ans = 0;

        switch(opr)  // using switch case to perform right operation
        {
          case '+':   // adding 2 numbers
            ans= num1+num2;
            break;

          case '-':   // subracting 2 numbers
            ans= num1-num2;
            break;

          case '*':  //multiply 2 numbers
            ans= num1*num2;
            break;

          case '/':  //dividing 2 numbers
            ans= num1/num2;
            break;

          default:
            System.out.println("You entered a wrong option!");
        }
        System.out.println("final answer:");
        System.out.println(num1+" "+ opr +" "+num2 +" "+"="+ " "+ ans); //display the final answer

    }
    
}
