package test2;

public class Confucian extends Thread
{

	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("人之初，性本善……"+i);
			try
			{
				Thread.sleep(1000*1);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public String toString()
	{
		return "Confucian []"+"原来是实现输出对象的";
	}
	
}
