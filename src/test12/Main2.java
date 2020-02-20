package test12;

import java.util.ArrayList;

public class Main2
{

	public static void main(String[] args)
	{
		// TODO 完全数和盈数问题
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i=2;i<=60;i++)
		{
			if(i==Factor(i))
			{
				arr1.add(i);
			}
			else if(i<Factor(i))
			{
				arr2.add(i);
			}
		}
//		System.out.println(arr1);
//		System.out.println(arr2);
		System.out.print("E: ");
		for(int ins : arr1)
		{
			System.out.print(ins+" ");
		}
		System.out.print("G: ");
		for(int ins : arr2)
		{
			System.out.print(ins+" ");
		}
	}

	public static int Factor(int num)
	{
		int sum=0;
		for(int i=1;i<num/2+1;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}
