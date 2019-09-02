package test13;

import java.util.LinkedList;

public class BFS2
{

	int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
	int[][] arc =  new int[4][4];
	
	int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new BFS2().Bfs2();
	}
	private void Bfs2()
	{
		int newRow;
		int newColumn;
		int newRound;
		Node start = new Node(0,0,0);
		arc[0][0] = 1;
		LinkedList<Node> queue = new LinkedList();
		queue.offer(start);
		while(!queue.isEmpty())
		{
			//crazy:第二步将队列的第一个元素拿出，然后判断是否是目标状态，是的话结束，不是继续接来步骤
			Node temp = queue.poll();
			System.out.println(array[temp.row][temp.column]);
			for(int i=0;i<4;i++)
			{
				newRow = temp.row+direct[i][0];
				newColumn = temp.column+direct[i][1];
				newRound = temp.round+1;
				if(newRow<0||newRow>=4||newColumn<0||newColumn>=4)
					continue;
				if(arc[newRow][newColumn]==1)
					continue;
				Node next = new Node(newRow,newColumn,newRound);
				arc[newRow][newColumn] = 1;
				queue.offer(next);
				
			}
		}
		
	}

}
