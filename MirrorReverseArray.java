                                     //(8) Program to check whether the given array is mirror inverse or not
 
/*LOGIC: To check whether is given array is mirror inverse, first we have to swap the array's value and array's index values, then consider 
          the array's values as its index positions and index values as values of an array, then compare both the given array and 
		  the swapped array is equal or not,if equal then the given array is an mirror inverse , if not the given index is not an mirror inverse.*/
 public class MirrorReverseArray

 {
	static boolean isMirrorInverse(int arr[])
	{
        for(int i=0;i<arr.length;i++)
		{
			if (arr[arr[i]] != i)
				return false;
		}
		return true;
	}
		public static void main(String[] args)
		{
			int arr[]={2,3,1,0};

			if(isMirrorInverse(arr))
			{
				System.out.println("the given array is a mirror inverse!");
			}
			else
			{
                System.out.println("the given array is not a mirror inverse");
			}
		
	}
}