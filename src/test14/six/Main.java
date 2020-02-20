package test14.six;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。 
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		if(num<=0)
			System.out.println("error");
		int num2 = (int)num;
//		System.out.println(num2);
		double num3 = num - (double)num2;
		if(num3>=0.5)
			num2+=1;
		System.out.println(num2);

	}

}
