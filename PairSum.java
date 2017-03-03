
//ALgortihm to print the indices whose sum produce a given num.
package algorithms;

import java.util.Random;
import java.util.Arrays;
public class PairSum {
	
	
	
	 public static void main(String args[]) 
	 {
		 int[] a = {1,2,3,5,7,9,0,4,10,11};
		 int x = 5;
		 

		 System.out.println("/////////////");
		 
		 
		 Arrays.sort(a);
		 
		 System.out.println("After Sorting");
		 
		 
		 for(int i = 0 ; i< 10; i++)
			 System.out.println(a[i]);
		 
		 int l =0; 
		 int r = a.length-1;
		 while(l < r)
		 {
			 if(a[l]+a[r] == x)
			 {
				 l++;
				 r--;
				 System.out.println(l+ " " + r);
			 }
			 else if( a[l] +a[r] > x)
				 r--;
			 else
				 l++;
				 
		 }
	 }

}
