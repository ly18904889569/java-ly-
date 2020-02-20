package test14.eight;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{

	public static void main(String[] args)
	{
		// 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
		Scanner scan = new Scanner(System.in);
		//再次注意一下对于hashset的定义和使用
		Set<Character> hash = new HashSet<Character>();
		while(scan.hasNextLine())
		{
			String num2 = scan.nextLine();
			String str = "";
			char[] arr = num2.toCharArray();
			for(int i=arr.length-1;i>=0;i--)
			{
				if(hash.add(arr[i]))
					str+=arr[i];
			}
			System.out.println(str);
			
			
		}

	}

}
