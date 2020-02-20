package test12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main4
{

	public static void main(String[] args)
	{
		// TODO count the number of words
		//	首先是输入的单词如何进行存放
		String words = "A blockhouse is a small castle that has four openings through which to shoot.";
//		System.out.println(words);
		
		char[] word = words.toLowerCase().toCharArray();
//		System.out.println(word);
		ArrayList<Character> cha = new ArrayList<Character>();
		ArrayList<ArrayList<Character>> wor = new ArrayList<ArrayList<Character>>();
		int[] num = new int[1000];
		for(char ins : word)
		{
			if(ins>='a'&&ins<='z')
			{
				cha.add(ins);
			}
			if(ins==' ')
			{
				int i=0;
				for(i=0;i<wor.size();i++)
				{
					if(cha.equals(wor.get(i)))
					{
						num[i]+=1;
						wor.add(cha);
					}
				}
					wor.add(cha);
					num[i]+=1;
			}
			
		}
		//	其次是如何统计单词数量
		System.out.println("");
		
		//	最后是按照格式输出

	}

}
