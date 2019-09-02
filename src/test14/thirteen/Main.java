package test14.thirteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// 给定n个字符串，请对n个字符串按照字典序排列。
		Scanner in = new Scanner(System.in);
		//我理解hasNext函数就是要继续输入，如果没有就会一直等待
		int num=in.hasNextLine()?Integer.parseInt(in.nextLine()):0;
		ArrayList<String> list = new ArrayList<String>();
		//&&的顺序很重要
		while(--num>=0&&in.hasNextLine())
		{
			list.add(in.nextLine());
		}
		//这个排序就直接能够按照字典序进行排列
		Collections.sort(list);
		for(String str:list)
		{
			System.out.println(str);
		}
		
	}

}
