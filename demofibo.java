                               //(2)Program to print fibonacci series till given number
                               
/* LOGIC: To print a fibonacci series, take input as 2 numbers and add it and take it as an 3rd number, then 
          take 2nd number as a 1st number and 3rd number as an 2nd number then add it and store it as a 3rd number,
          repeat the process untill loop reaches the number of digits needed in fibonacci series.*/

import java.io.*;
import java.util.Scanner;

public class demofibo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);// creating new object scan to the scanner class
        System.out.println("enter the digit:");// to get number as an input using SOP
        int n = scan.nextInt();

        int first = 0;
        int second = 1;
        System.out.print(first+" "+second);

        for(int i=1;i<=n;i++)
        {
        int third = first + second;
        System.out.print(" "+third);
        first = second; // assaigning second number to first number
        second = third; // assaigning third number to second number
        }
    }
}
