package test14.fourteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		// 这是一个典型的0-1背包问题，解决方法有动态规划行表示物品数量从0开始到N，列表示物品价值，从1开始到N/10
		// 动态规划问题需要建立动态规划表，需要写出状态转移方程，状态转移方程需要有临界状态
		// 先解决输入问题
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0])/10;	// 表示物品的价值
		int m = Integer.parseInt(str.split(" ")[1]);	// 表示物品总数量，横坐标
		int[][] res = new int[m+1][N+1];
		ArrayList<Thin> list = new ArrayList<Thin>();
		for(int i=0;i<m;i++)
		{
			String str2 = br.readLine();
			int value = Integer.parseInt(str2.split(" ")[0])/10;
			int weight = Integer.parseInt(str2.split(" ")[1])*value;
			int flag = Integer.parseInt(str2.split(" ")[2]);
			list.add(new Thin(value,weight,flag));
		}
		list.add(0, new Thin(0,0,0));
		Arrays.fill(res[0], 0);
		for(int k=0;k<res.length;k++)
		{
			res[k][0] = 0;
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=N;j++)
			{
				Thin temp = list.get(i);
				if(temp.flag == 0)
				{
					if(temp.value <= j)
					{
						res[i][j] = Math.max(res[i-1][j], res[i-1][j-temp.value]+temp.weigth);
					}
				}
				else
				{
					if(temp.value+list.get(temp.flag).value <= j)
					{
						res[i][j] = Math.max(res[i-1][j], res[i-1][j-temp.value]+temp.weigth);
					}
				}
			}
		}
		System.out.println(res[m][N]*10);
//		for(int i=0;i<res.length;i++)
//		{
//			for(int j=0;j<res[i].length;j++)
//			{
//				System.out.print(res[i][j]+" ");
//			}
//			System.out.println("");
//		}
	}
	public static class Thin
	{
		public int value; // 价值，这个是纵坐标
		public int weigth;	// 价值乘上重要程度，这个是表格中填写的
		public int flag;	// 为0就是主件，为>0就是附件，其中标号表示主件的号码
		
		public Thin()
		{
			
		}
		public Thin(int value,int weight,int flag)
		{
			this.weigth = weight;
			this.value = value;
			this.flag = flag;
		}
	}

}
