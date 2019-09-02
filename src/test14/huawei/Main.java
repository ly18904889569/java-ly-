package test14.huawei;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// TODO 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			//这道题学习的地方在于输入，next就是不换行的意思 而如果输入一个字符就按照cha格式
			String str1 = in.next();
			String str2 = str1.toLowerCase();
			char cha = in.next().charAt(0);
			char cha2 = Character.toLowerCase(cha);
			int num = 0;
			for(int i=0;i<str1.length();i++)
			{
				char tmp = str2.charAt(i);
				if(tmp == cha2)
					num++;
			}
			System.out.println(num);
		}

	}

}
