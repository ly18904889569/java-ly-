package eightNumber;

public class Node
{
	public Map map;
	
	public int fn;
	
	public int gn;
	
	public int hn;
	
	public int flag;
	
	public Node(int[][] array,int row ,int column)
	{
//		this.map.board = array.clone();
		
		this.map = new Map(array,row,column);
		this.flag =0; //初值都是0，因为进队的时候才变为1；
	}
	
	public Node()
	{
		this.map = new Map();
	}

	public Node exchange(int nextRow, int nextColumn)
	{
		int tmp;
		Node next =new Node();;
		int[][] array=new int[3][3];
		array = ArrayExchange(this.map.board);
		if(nextRow<0||nextRow>=3||nextColumn<0||nextColumn>=3)
			next =null;
		else
		{
			tmp = array[nextRow][nextColumn];
			array[nextRow][nextColumn] = 0;
//			array[this.map.row][this.map.column] = tmp;
//			for(int i=0;i<4;i++)
//				for(int j=0;j<4;j++)
//					next.map.board[i][j] = array[i][j];
			next.map.board = array.clone();
			next.flag = 0;
		}
		return next;
	}
	
	public int[][] ArrayExchange(int[][] array)
	{
		int[][] inputArray = new int[array.length][array.length];
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array.length;j++)
				inputArray[i][j] = array[i][j];
		return inputArray;
	}

}
