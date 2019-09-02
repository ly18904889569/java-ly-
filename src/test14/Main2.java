package test14;

import java.util.Arrays;
import java.util.Random;

public class Main2
{

	public static void main(String[] args)
	{
		//先产生一串0，1字符，然后在实现拼接，16个0,1形成一个String
		//产生的0,1字符串长度随机，假定限制在2-5之间，然后随机生成
		//str的长度不是很容易估算出来，先按照最长的进行开辟把
		String str[] = new String[100];
		String str1[] = new String[30];	//这个数组空间的开辟，说实话无法确定，暂时先不用管他
		Arrays.fill(str1, "");
		String strTmp="";
		int k=0;
		int tmp;
		int size;
		int num = 100;
		for(int i=0;i<num;i++)
		{
			Random rand = new Random();
			size = 2 + rand.nextInt(4);	//范围是2~5之间
			for(int j=0;j<size;j++)
			{
				Random rand2 = new Random();
				tmp = rand2.nextInt(2);
				strTmp+=tmp;
			}
			
			//下面的是进行拼接
			str[i] = strTmp;
//			strTmp = null;
			int strTmpSize = strTmp.length();
//			int strSixteenSize = 0;
//			if(str1[k]==null)
//			{
//				strSixteenSize = 16;
//			}
//			else
//			{
//				strSixteenSize = 16 - str1[k].length();
//			}
			int strSixteenSize = 16 - str1[k].length();
			if(strTmpSize<strSixteenSize)
			{
				str1[k] = str1[k] + strTmp;
			}
			else if(strTmpSize == strSixteenSize)
			{
				str1[k] = str1[k]+strTmp;
				k++;
			}
			else
			{
				String str3 = strTmp.substring(0, strSixteenSize);	//截取能够加入的大小
				String str4 = strTmp.substring(strSixteenSize, strTmpSize);	//将剩下的截取保存
				str1[k] = str1[k] + str3;
				str1[++k]+=str4;
			}
			strTmp = "";
		}
		for(int i1=0;i1<str1.length;i1++)
		{
			System.out.println(str1[i1]);
		}

	}

}
