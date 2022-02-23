                                      
                                      //(9)Program to remove elements from an arraylisst
 /* LOGIC: To remove an element of an arraylist use, remove() builtin methods in ArrayList package.*/

import java.util.ArrayList;
public class arrayList
 {

  public static void main(String[] args)
  {
     ArrayList <String> array= new ArrayList<String>(4); // creating new object for arraylist class, called array. 

     array.add("apple");      // adding elements to the array 
     array.add("papaya");
     array.add("strawberry");
     array.add("guava");

     System.out.println("the size of the given array "+array.size());  //printing the size of an array using size() method
     System.out.println("the given array:"+array);

     array.remove(2); // remove element using its index 
     array.remove("guava"); //remove element using object of array

     System.out.println("size of modified array: "+array.size());
     System.out.println("modified array:"+" "+array);
  }  
}
