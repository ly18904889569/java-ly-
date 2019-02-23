package test4;

import java.util.ArrayList;
import java.util.Random;

public class Main
{	
	final static int N = 10;
	final static int M = 5;

	public static void main(String[] args)
	{
		// TODO 随机产生一个M*N大小的随机数组
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();	//crazy:M*N的一个reads二维数组
		Random rand = new Random();
		for(int i=0;i<M;i++)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0;j<N;j++)
			{
				int value;
				value =  rand.nextInt(2);
				list.add(value);
			}
			lists.add(list);
		}
		PrintArray(lists);
	}
	public static void PrintArray(ArrayList<ArrayList<Integer>> lists)
	{
		for(ArrayList<Integer> list : lists)
		{
			System.out.println(list);
		}
	}

}


