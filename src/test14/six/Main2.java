package test14.six;

import java.util.Scanner;

public class Main2
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double d = scanner.nextDouble();
		System.out.println(getReturn(d));
	}

	public static int getReturn(double d)
	{
		//数值之间可以直接进行强制转换
		int i = (int) d;
		//学会使用三元运算符号。适用于仅仅只有一个if，else
		return (d - i) >= 0.5 ? i + 1 : i;
	}

}
