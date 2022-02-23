//                                     (5) Program to find Permutuation and Combination of Two numbers
public class permutCombin
 {
        static int factorial(int n)// passing numers as an argument to the function factorial()
         {
           int fact = 1;
           int i = 1;
           while(i <= n)
            {
              fact *= i;
              i++;
           }
           return fact;
        }
        public static void main(String args[]) 
        {
           int n = 7, r = 3, comb, per;
           per = factorial(n) / factorial(n-r);
           System.out.println("Permutation: " + per);
           comb = factorial(n) / (factorial(r) * factorial(n-r));
           System.out.println("Combination: " + comb);
        }
     }

