package eightNumber;

import java.util.LinkedList;

public class Main
{

	int[][] initialState ={{2,1,5},{0,3,4},{6,7,8}};
	
	int[][] finalState = {{1,3,5},{2,0,4},{6,7,8}};
	
	Node start = new Node(initialState,1,0);
	Node end = new Node(finalState,1,1);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Main().BFS();
	}
	private void BFS()
	{
		LinkedList<Node> queue = new LinkedList<Node>();
		start.flag =1;
		queue.offer(start);
		while(!queue.isEmpty())
		{
			Node temp=queue.poll();
			if(temp.map.isEqual(end.map))
			{
				System.out.println("ok");
				System.exit(0);
			}
			else
			{
				Node next =null;
				for(int i=0;i<4;i++)
				{
					next =direct(temp,i);
					if(next ==null)
						continue;
					if(next.flag ==1)
						continue;
					next.flag=1;
					queue.offer(next);
					
				}
			}
		}
		System.out.println("Not find it");
		
	}
	
	//crazy：这里按照0的位置进行移动
	private Node direct(Node node,int i)
	{
		Node next =null;
		Node temp = node;
		if(i==0)	//crazy:0的位置向上移动
		{
			next = temp.exchange(temp.map.row-1, temp.map.column);
		}
		else if(i==1)	//crazy：0的位置向下移动
		{
			next = temp.exchange(temp.map.row+1, temp.map.column);
		}
		else if(i==2)	//crazy:0的位置向左移动
		{
			next = temp.exchange(temp.map.row, temp.map.column-1);
		}
		else	//crazy:0的位置向右移动
		{
			next = temp.exchange(temp.map.row, temp.map.column+1);
		}
//		next.flag =0;
		return next;
	}

}
