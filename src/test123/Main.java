package test123;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
//		ArrayList<ArrayList<Character>> listsPBWT = new ArrayList<ArrayList<Character>>();
//		for(int i=0; i<3; i++)
//		{
//			ArrayList<Character> list = new ArrayList<Character>();
//			char ch;
//			
//		}

//		int num = 2;
//		int end = (2 << 3)& 0xff;
//		System.out.println(end);
		byte[] by = new byte[3];
		byte[] tempBy = new byte[3];
		by[0] = (byte) 60;
		by[1] = (byte) -67;
		by[2] = (byte) -37;
		byte b1 = 0b00000011;
		System.out.println(b1);
		String[] deStr = new String[8];
		for(int i=0; i<by.length; i+=3)
		{
//			for(int j=0; j<3; j++)
//			{
//				tempBy[j] = (byte) (by[j] + (byte)(128));
//			}
			deStr[0] = Byte.toString((byte) ((((by[i]&0xff)+128) >> 5)%8));
			deStr[1] = Byte.toString((byte) (((by[i]&0xff) >> 2)%8));
			deStr[2] = Byte.toString((byte) ((((by[i]&0xff)%4)*2)+((((by[i+1]&0xff)+128) >> 7)%2)));
			System.out.println(by[i+1]);
			System.out.println((by[i+1]&0xff)); //((by[i+1] >> 4)%8)
			deStr[3] = Byte.toString((byte) (((by[i+1]&0xff) >> 4)%8));
			System.out.println(((((by[i+1]&0xff)+128) >> 7)%2));	//(((by[i+1]+128) >> 7)%2)
			System.out.println(((by[i]%4)*2));	//((by[i]%8)*2)
			System.out.println();
		}
//		deStr[0] = Byte.toString((byte) (((by[0]+ 128) >> 5)%8));
//		deStr[1] = Byte.toString();
		for(int i=0; i<4; i++)
		{
			System.out.println(deStr[i]);
		}
//		System.out.println(deStr[0]);
		
		
	}

}
