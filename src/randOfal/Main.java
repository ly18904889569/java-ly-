package randOfal;

import java.util.ArrayList;
import java.util.Random;

public class Main
{
//	ArrayList<point> array = new ArrayList<point>();
	public static void main(String[] args)
	{
		double pai;
		double num =1000000;
		int k=0;
		double tmpX;
		double tmpY;
//		ArrayList<point> array = new ArrayList<point>();
		Random rand = new Random();
		for(int i=0;i<num;i++)
		{
			tmpX = rand.nextDouble();
			tmpY = rand.nextDouble();
			point p = new point(tmpX,tmpY);
//			array.add(p);
			if(p.isSam(tmpX, tmpY))
				k+=1;
//			System.out.println(tmpX);
		}
		pai = 4*(k/num);
		System.out.println(pai);
		

	}

}
