package test12;

public class Main5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		String str1 = "This is only a test!";
//		String[] arr1 = str1.split("s");
//		for(String ins : arr1)
//		{
//			System.out.println(ins);
//		}
		String str2 = "hjfkdhjk3hjk3h4h34h32324324g3g4g3hg4j23gh";
		String[] arr2 = str2.split("(?<=\\D)(?=\\d)");
		for(String ins : arr2)
		{
			System.out.println(ins);
		}
		if(3-2==1)
			System.out.println("ok");
	}

}
