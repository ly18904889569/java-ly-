package test8;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		int n = 0;
		int tmp = 0;
		// 大循环进行遍历
		for (int i = 0; i < 256; i++)
		{
			// 计算sum，并且把sum的值进行分割存储
			sum = i*i;
			n = ComputeDigit(sum, list);
			// 和为一位的情况
			if (n == 1)
			{
				System.out.println(i);
			}
			// 和为两位的情况
			else if (n == 2)
			{
				if(list.get(0)==list.get(1))
				{
					System.out.println(i);
				}
			}
			// 和为三位的情况
			else
			{
				if(list.get(0) ==list.get(2))
				{
					System.out.println(i);
				}
			}
			list.clear();

		}
	}
	public static int ComputeDigit(int sum,ArrayList<Integer> list)
	{ 
		int a,b,c,d,e;
		if(sum<10)
		{
			a= sum;
			list.add(a);
			return 1;
		}
		else if(sum>9&&sum<100)
		{
			a= sum%10;
			b= sum/10;
			list.add(a);
			list.add(b);
			return 2;
		}
		else if(sum>99&&sum<1000)
		{
			a = sum%10;
			b = sum/10%10;
			c = sum/100;
			list.add(a);
			list.add(b);
			list.add(c);
			return 3;
		}
		else if(sum>999&&sum<10000)
		{
			a = sum%100;
			b = sum/10%10;
			c = sum/100;
			list.add(a);
			list.add(b);
			list.add(c);
			return 4;
		}
		else
		{
			a = sum%10;
			b = sum/10%10;
			c = sum/100;
			list.add(a);
			list.add(b);
			list.add(c);
			return 5;
		}

	}

}
