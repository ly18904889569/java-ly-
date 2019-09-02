package test9;

import java.util.ArrayList;
import java.util.HashSet;

public class Main
{

	public static void main(String[] args)
	{
		Stamp zeroPEight = new Stamp(5, 0.8);
		Stamp one = new Stamp(4,1);
		Stamp onePEight = new Stamp(6,1.8);
		
		ArrayList<Double> price = new ArrayList<Double>();
		HashSet<Double> set = new HashSet<Double>();
		double sum;
		
		for(int i=0;i<=onePEight.num;i++)
		{
			for(int j=0;j<=one.num;j++)
			{
				for(int k=0;k<=zeroPEight.num;k++)
				{
					sum = zeroPEight.price*k+one.price*j+onePEight.price*i;
					set.add(sum);
					if(!isHaving(sum,price))
					{
						price.add(sum);
					}
				}
			}
		}
		System.out.println(price.size()-1);
		System.out.println(set.size());

	}

	private static boolean isHaving(double sum, ArrayList<Double> price)
	{
		for(int i=0;i<price.size();i++)
		{
			if(sum == price.get(i))
			{
				return true;
			}
		}
		
		return false;
	}

}
