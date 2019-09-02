package test14.nigth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{

	public static void main(String[] args)
	{
		// 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
		Scanner in = new Scanner(System.in);
		Set<Character> hash = new HashSet<Character>();
		int sum = 0;
		while(in.hasNextLine())
		{
			String str1 = in.nextLine();
			for(int i=0;i<str1.length();i++)
			{
				char cha = str1.charAt(i);
				int wide=cha;
//				System.out.println(wide);
				if(wide>=0&&wide<=127)
				{
					if(hash.add(cha))
						sum++;
				}
			}
			System.out.println(sum);
		}
	}

}
