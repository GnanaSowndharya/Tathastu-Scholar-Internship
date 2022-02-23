                              //(6)Program to print Diamond shape stars pattern

/* LOGIC : To print a diamond shape, using nested for loops.
   
    (1) loop variable i denotes number of rows to be printed,
    (2) loop variable j denotes number of spaces to be printed,
    (3) loop variable k denotes number of stars to be printed

    Look the stars and spaces as an increamenting and decreamenting triangles.
    __________________________________________________________________________________________________________________________            
                "Code for Increamenting Stars"                  

         for(int i=1;i<=5;i++)            | output:      
         {                                |       *
            for(int k=1;k<=i;k++)         |       **
            {                             |       ***
                System.out.print("*");    |       ****
            }                             |       *****
          System.out.println();           |
         }                                |
    __________________________________________________________________________________________________________________________     
                 "code for Decreamenting Stars"

          for(int i=1;i<=5;i++)           |  OUTPUT :
         {                                |        *****
            for(int k=n;k>=i;k--)         |        ****
            {                             |        ***
                System.out.print("*");    |        **
            }                             |        *
          System.out.println();           |
         }    
    __________________________________________________________________________________________________________________________
     
*/
import java.util.Scanner;
public class demostar
 {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in); // creating new object named as scan to Scanner class
        System.out.println("enter the number of rows:"); // getting input from user to print number of rows needed
        int n=scan.nextInt();

        for(int i=1;i<n;i++)  //1st set of loops for upper part
         {
            
            for(int k=n;k>=i;k--) // decreamenting space triangle
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)  // increamenting star triangle
            {
                System.out.print("*");
            }
            for(int s=1;s<i;s++)  // increamenting star triangle
            {
                System.out.print("*");
            }

          System.out.println(" "); // print rows in next line
        }

        for(int i=1;i<=n;i++)  //2nd set of loops for lower part
        {
            
            for(int k=1;k<=i;k++) // increamenting space triangle
             {
                System.out.print(" ");
             }
            for(int j=n;j>=i;j--)  // decreamenting star triangle
             {
                System.out.print("*");
             }
            for(int s=n;s>i;s--)  //  decreamenting star triangle
             {
                System.out.print("*");
             }
            

        System.out.println(" ");
        }
    }
}
