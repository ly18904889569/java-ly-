package test14.twelve;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
//		将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
//		所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = "";
		String str3="";
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
				str2+=str1.charAt(i);
			else
			{
				str3 = str2+" "+str3;
				str2="";
			}
		}
		str3 = str2+" "+str3;
		System.out.println(str3);
	
	}

}
