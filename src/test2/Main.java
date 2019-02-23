package test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Confucian confucian = new Confucian();
		Buddhist buddhist = new Buddhist();
		Thread t =new Thread(buddhist);
		t.start();
		InputStreamReader m = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(m);
		try
		{
			reader.readLine();
			reader.close();
			buddhist.quitflag=true;
		}
		catch(Exception e)
		{
			
		}
//		con1.start();
//		Thread t = new Thread(bud1);
//		t.start();
//		System.out.println(con1);
	}

}
