package test13;

import java.util.LinkedList;

public class DFS
{

	int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
	int[][] arc = new int[4][4];
	
	int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}};

	public static void main(String[] args)
	{
		new DFS().Dfs();

	}

	private void Dfs()
	{
		LinkedList<Node> stack = new LinkedList<Node>();
		Node start = new Node(0,0,0);
		arc[0][0] = 1;
		stack.push(start);
		int k=1;
		while(!stack.isEmpty())
		{
			//这里有一步判断是否是目标节点，但是这里并不需要
			Node temp = stack.pop();
			System.out.println("第"+(k++)+"轮的数字是："+array[temp.row][temp.column]);
			for(int i=0;i<4;i++)
			{
				int newRow = temp.row+direct[i][0];
				int newColumn = temp.column+direct[i][1];
				int newRound = temp.round+1;
				
				if(newRow<0||newRow>=4||newColumn<0||newColumn>=4)
					continue;
				if(arc[newRow][newColumn]==1)
					continue;
				arc[newRow][newColumn]=1;
				Node next = new Node(newRow,newColumn,newRound);
				stack.push(next);
			}
			
		}
		
	}

}
