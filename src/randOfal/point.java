package randOfal;

public class point
{
	public double x;
	public double y;
	
	public point(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public point()
	{
		
	}
	
	public boolean isSam(double x,double y)
	{
		if(x*x+y*y<1)
			return true;
		else 
			return false;
	}

}
