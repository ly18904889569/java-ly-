package test4;

import java.util.ArrayList;

public class ReadStruct
{
	private int alignmentStart;
	private int alignmentEnd;
	private ArrayList<Integer> reads;
	
	public ReadStruct()
	{
		
	}

	public int getAlignmentStart()
	{
		return alignmentStart;
	}

	public void setAlignmentStart(int alignmentStart)
	{
		this.alignmentStart = alignmentStart;
	}

	public int getAlignmentEnd()
	{
		return alignmentEnd;
	}

	public void setAlignmentEnd(int alignmentEnd)
	{
		this.alignmentEnd = alignmentEnd;
	}

	public ArrayList<Integer> getReads()
	{
		return reads;
	}

	public void setReads(ArrayList<Integer> reads)
	{
		this.reads = reads;
	}
	
	
}
