package test14.huawei;

import java.util.Scanner;
import java.util.TreeSet;

public class Main4
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<Integer>();
		//这个判断相当于一个无限输入，就相当于输入多个列子
		while(in.hasNext())
		{
			int n = in.nextInt();
			for(int i = 0 ; i < n ;i++){
                int curr = in.nextInt();
                set.add(curr);
            }
			for(Integer i : set){
                System.out.println(i);
            }
		}

	}

}
