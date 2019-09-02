package test14.five;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		String result = getResult(num);
		System.out.println(result);

	}

	private static String getResult(long num)
	{
		int pum = 2;
		String result="";
		while(num!=1)
		{
			if(num%pum==0)
			{
				num = num/pum;
				result+=pum+" ";
			}
			else
			{
				pum++;
			}
		}
		return result;
	}

}
