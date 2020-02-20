package test14.eleven;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			String str = in.nextLine();
			String str2 = "";
			for(int i=0;i<str.length();i++)
			{
				str2+=str.charAt(str.length()-1-i);
			}
			System.out.println(str2);
		}

	}

}
