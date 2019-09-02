package test8;

public class Main3
{
	

	public static void main(String[] args)
	{
		for(int i=1;i<4;i++)
			System.out.println(i);
		for(int i=4;i<256;i++)
			if(isSymmetric(i))
				System.out.println(i);

	}

	private static boolean isSymmetric(int i)
	{
		char[] digit = String.valueOf(i*i).toCharArray();	//这个就是我一直想要的一个转换手法，就是把数字或者是字母转换为数组
		int t=0; //循环中定义变量千万注意，因为循环的因素会把变量赋值为初值
		for(int j=digit.length-1;j>0;j--)
		{
			if(digit[j]!=digit[t])
				return false;
			t++;
		}
		return true;
	}

}
