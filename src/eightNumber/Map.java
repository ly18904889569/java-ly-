package eightNumber;

public class Map
{
	public int row;	//crazy:用于记录空白，或者是0的位置
	public int column;	
	public int[][] board;	//crazy:棋盘的状态
	
	public Map(int[][] board,int row,int column)
	{
		this.board = board.clone();
		this.row = row;
		this.column = column;
	}
	public Map()
	{
		
	}
	
	public boolean isEqual(Map temp)
	{
		if(temp.row!=this.row||temp.column!=this.column)
			return false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(temp.board[i][j]!=this.board[i][j])
					return false;
			}
		}
		return true;
	}
}
