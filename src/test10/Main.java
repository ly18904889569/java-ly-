package test10;

public class Main
{

	public static void main(String[] args)
	{
		int tmp;
		for(int i=1000;i<=1111;i++)
		{
			tmp = i*9;
			if(isReOrder(i,tmp))
			{
				System.out.println(i);
			}
		}

	}

	private static boolean isReOrder(int i, int tmp)
	{
		char[] arrPos = String.valueOf(i).toCharArray();
		char[] arrNeg = String.valueOf(tmp).toCharArray();
		for(int j=0;j<arrPos.length;j++)
		{
			if(arrPos[j]!=arrNeg[arrNeg.length-1-j])
				return false;
		}
		return true;
	}

}
