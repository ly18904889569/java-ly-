package test2;

public class Buddhist implements Runnable
{

	public boolean quitflag=false;
	@Override
	public void run()
	{
		for (int i = 1; i <= 20; i++)
		{
			if(quitflag==true)
				break;
			System.out.println("mami mami hong……" + i);
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
