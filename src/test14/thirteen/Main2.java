package test14.thirteen;

import java.util.Scanner;

public class Main2
{

	public static void main(String[] args)
	{
		// 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。 
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int n=0;
		for(int i = 31;i >= 0; i--)
			if((num >>> i & 1) ==1)
			{
				n++;
			}
		System.out.println(n);
//			System.out.print(num >>> i & 1);

	}

}
