package test14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main3
{

	public static void main(String[] args)
	{
		// 输入一个英文句子，把句子中的单词(不区分大小写)按出现次数按从多到少把单词和次数在屏幕上输出来，要求能识别英文句号和逗号，即是说单词由空格、句号和逗号隔开。
		// 采用数据结构，我认为自己定义一个数据结构，用于存放字符和数量。
		// 算法简单的一次遍历，然后统计数量
		String input = "Suppose that we have a square city with straight streets. A map of a city is a square board with n rows and n columns, each representing a street or a piece of wall. A blockhouse is a small castle that has four openings through which to shoot. The four openings are facing North, East, South, and West, respectively. There will be one machine gun shooting through each opening. Here we assume that a bullet is so powerful that it can run across any distance and destroy a blockhouse on its way. On the other hand, a wall is so strongly built that can stop the bullets. The goal is to place as many blockhouses in a city as possible so that no two can destroy each other. A configuration of blockhouses is legal provided that no two blockhouses are on the same horizontal row or vertical column in a map unless there is at least one wall separating them. In this problem we will consider small square cities (at most 4x4) that contain walls through which bullets cannot run through.";
		String input2 = input.toLowerCase();
		char tmp;
		int k=0;
		String letter="";
		String[] arr2 = new String[1000]; 
		LinkedList<String> arr3 = new LinkedList<String>();
		// 首先我们需要把这一串字符进行存储
		for(int i=0;i<input.length();i++)
		{
			tmp = input2.charAt(i);
			// 如果是字母的话进行拼接
			if(tmp>='a'&&tmp<='z')
			{
				letter+=tmp;
			}
			// 如果不是字母那一定就是空格或者是逗号或者是句号
			else
			{
				arr2[k] = letter;
				arr3.add(k, letter);
				k++;
				letter = "";
			}
		}
		
		// 在写一个统计数量并且输出
		for(int j=0;j<arr3.size();j++)
		{
			int count = 1;
			String tmpStr = arr3.get(j);
			// 统计数量
			for(int m=j+1;m<arr3.size();m++)
			{
				// 如果找到相等的那么就删除该元素，然后坐标后移一位
				if(tmpStr.equals(arr3.get(m)))
				{
					arr3.remove(m);
					count++;
					m--;
				}
			}
			System.out.println(tmpStr+":"+count);
			count = 0;
			
		}

	}

}
