package algorithms;

/* JAVA program to find the median(kth smallest) element using Priority Queue */


import java.util.PriorityQueue;
import java.util.Random;
public class MedianPQ {
    
	public static void main(String args[]) 
	{  
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		Random rand  = new Random();
		
		int[] a = new int[10];
		
		for (int i =0 ; i < 10 ; i++)
		{
			a[i]=rand.nextInt(100);
		}
		
		
		for (int i =0 ; i < 10 ; i++)
		{
			System.out.println(a[i]);
		}
		
       System.out.println("///////////////////////");
		
		
		for(int i=0;i<10; i++)
		{
			PQ.add(a[i]);
			
			
			if(PQ.size()> 5)
				PQ.poll();
		}
		
		
	 System.out.println(PQ.poll());
		
	}
	
}
