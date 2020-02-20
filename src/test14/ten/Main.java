package test14.ten;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
//		描述： 
//		输入一个整数，将这个整数以字符串的形式逆序输出 
//		程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001 
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int num = in.nextInt();
			String str = Integer.toString(num);	//这里肯定是Integer,因为按照字面就是整数转换为字符
			String str1 ="";
			for(int i=0;i<str.length();i++)
			{
				str1+=str.charAt(str.length()-1-i);
			}
			System.out.println(str1);
			
		}

	}

}
