package test14.seven;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<valueAndKey> arr = new ArrayList<valueAndKey>();
		for(int i=0;i<n;i++)
		{
			int value = in.nextInt();
			int key = in.nextInt();
			valueAndKey vk = new valueAndKey(value, key);
			arr.add(vk);
		}
		for(int i=0;i<arr.size();i++)
		{
			int tmpvalue = arr.get(i).value;
			int tmpkey = arr.get(i).key;
			for(int j=i+1;j<arr.size();j++)
			{
				if(tmpvalue==arr.get(j).value)
				{
					arr.get(i).key += arr.get(j).key;
					arr.remove(j);
					j--;
				}
			}
		}
		Collections.sort(arr);
		for(int k=0;k<arr.size();k++)
		{
			System.out.println(arr.get(k).value+" "+arr.get(k).key);
		}
		

	}
	
	public static class valueAndKey implements Comparable<valueAndKey>
	{
		int value;
		int key;
		public valueAndKey(int value,int key)
		{
			this.value = value;
			this.key = key;
		}
		@Override
		public int compareTo(valueAndKey o)
		{
			return this.value-o.value;
		}
		@Override
		public String toString()
		{
			return  value + " " + key ;
		}
		
		
	}

}
