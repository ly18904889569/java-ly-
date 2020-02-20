package test12;

public class Main
{

	public static void main(String[] args)
	{
		// TODO 加法等式
		int a;
		int b;
		int c;
		int abc;
		int bcc;
		int sum;
		for(a=0;a<10;a++)
		{
			for(b=0;b<10;b++)
			{
				for(c=0;c<10;c++)
				{
					abc = a*100+b*10+c;
					bcc = b*100+c*10+c;
					sum = abc+bcc;
					if(bcc>=100&sum==532)
					{
						System.out.println(a+" "+b+" "+c);
					}
						
				}
			}
		}

	}

}
