package bfs;

import java.util.LinkedList;

public class BFS2
{
	int[][] direct = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
	
	int[][] arc = new int[4][4];
	
	int [][] array = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	

	
	public static void main(String[] args)
	{
		new BFS2().Bfs2();
	}
	private void Bfs2()
	{
		LinkedList<Node> queue = new LinkedList<Node>();
		Node start = new Node(0,0,0);
		queue.offer(start);
		
		while(!queue.isEmpty())
		{
			//这里正常是第二步
			Node temp = queue.poll();
			for(int i=0;i<4;i++){
				int newRow = temp.row+direct[i][0];
				int newColumn = temp.column+direct[i][1];
				
				if(newRow<0||newRow>=4||newColumn<0||newColumn>=4)
					continue;
				if(arc[newRow][newColumn]==1)
					continue;
				arc[newRow][newColumn]=1;
				Node next = new Node(newRow,newColumn,temp.round+1);
				queue.offer(next);
//				System.out.println(next);
			}
		}
		
		
	}
	//crazy:和LinkedList队列搭配使用的结构
	class Node{
		int row;
		int column;
		int round;
		
		Node(int row,int column,int round){
			this.row =row;
			this.column = column;
			this.round = round;
			
		}

		@Override
		public String toString()
		{
			// TODO Auto-generated method stub
			return "row:"+row+" column:"+column+" round:"+round;
		}
		
	}
}
