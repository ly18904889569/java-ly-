package test7;


public class MinMax
{	
	public static void main(String[] args)
	{
		int end;
		int max;
		Data data = new Data();
		end = data.arr.length;
//		System.out.println("The original data:");
		data.Print();
		max = data.MaxMin(0, end);
		System.out.println("The max number is :"+max);
		System.out.println("The min number is :"+data.min);
		System.out.println("***************End**************");
		
	}

}
