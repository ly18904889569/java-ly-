package test7;

import java.util.Random;

public class Data
{
	public int[] arr = new int[10];
	
	public int max;
	
	public int min;
	
	public Data()
	{
		Random rand = new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = rand.nextInt(100);
		}

	}
	
	public void Print()
	{
		for(int i=0 ;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public  int MaxMin(int start ,int end)
	{
		int mid;
		if(start == end)
		{
			this.max = arr[start];
			this.min = arr[end];
			return max;
		}
		else if(start == end -1)
		{
			if(arr[start]>arr[end])
			{
				this.max = arr[start];
				this.min = arr[end];
				return max;
			}
			else
			{
				this.max = arr[end];
				this.min = arr[start];
				return max;
			}
		}
		else
		{
			int lMax,lMin,rMax,rMin;
			mid = (start + end)/2;
			lMax = MaxMin(start,mid);
			rMax = MaxMin(mid+1,end);
			
			
		}
		return max;
		
	}
}
