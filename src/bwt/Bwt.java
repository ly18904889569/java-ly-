package bwt;

import java.util.Arrays;

public class Bwt
{
	private String bwt;	//起始输入的字符串
	private char[] StBwt;	//转换为字符型数组
	private char[][] StaBwt;	//用于bwt转换的初始字符串数组
	private char[][] EndBwt;	//bwt转换之后的数组
	private char[] Front;
	private char[] Last;
	
	public Bwt(String bwt)
	{
		this.bwt=bwt;
//		System.out.println(bwt);
	}
	
	/**
	 * 将字符串转化为字符型数组
	 */
	public void StoNum()
	{
		char[] StrArr = this.getBwt().toCharArray();
		char[] StrArr2 = new char[StrArr.length+1];
		for(int i=0;i<StrArr2.length;i++)
		{
			if(i<StrArr2.length-1)
				StrArr2[i] = StrArr[i];
			else
				StrArr2[i]='$';
		}
		this.setStBwt(StrArr2);
//		this.Print(getStBwt());
		
	}
	/**
	 * 选进行循环移动位置构成一个初始的字符数组
	 */
	public void StoStaBwt()
	{
		this.StaBwt=new char[this.StBwt.length][this.StBwt.length];	//这里对字符数组使用的时候注意不要为空
		for(int i=0;i<this.StBwt.length;i++)
		{
			if(i==0)
			{
				for(int j=0;j<this.StBwt.length;j++)
				{
//					this.StaBwt[i][j]='1';	这里犯了一个严重错误仍然是对于char赋值的时候是''
//					System.out.println(this.StaBwt[i][j]);
					this.StaBwt[i][j]=this.StBwt[j];
				}
			}
			else
			{
				for(int j=0;j<this.StBwt.length;j++)
				{
					if(j-i<0)
						this.StaBwt[i][j]=this.getStBwt()[j-i+this.StBwt.length];
					else
						this.StaBwt[i][j]=this.getStBwt()[j-i];
				}
			}
		}
		this.setStaBwt(StaBwt);
//		this.Print2(StaBwt);
	}
	/**
	 * 将轮转之后的数组按照首字母进行排序
	 * @param Arr
	 */
	public void Sort(char[][] Arr)
	{
		int index=0;	//用于之后的排序
		char[] tmp;
		char[] front = new char[Arr.length];
		char[] last = new char[Arr.length];
		//接下来写一段关于按照字典序排序的代码,写一个简单的排序
		for(int i=0,secondIndex=0;i<Arr.length;i++)
		{
			index=i;
			for(int j=i+1;j<Arr.length;j++)
			{
				while(Arr[index][secondIndex]==Arr[j][secondIndex])
				{
					secondIndex+=1;
					if(Arr[index][secondIndex]>Arr[j][secondIndex])
					{
						index = j;
						break;
					}
				}
				secondIndex = 0;
				if(Arr[index][secondIndex]>Arr[j][secondIndex])
				{
					index = j;
				}
			}
			//将最小的放到最前面,交换索引比较好
			if(index>i)
			{
				tmp=Arr[i];
				Arr[i]=Arr[index];
				Arr[index]=tmp;
			}
			
		}
		this.setEndBwt(Arr);
//		System.out.println("The result of sorted:");
//		this.Print2(Arr);
		//提取EndBwt的第一列和最后一列放到Front和Last中
		for(int i =0;i<Arr.length;i++)
		{
			front[i]=Arr[i][0];
			last[i]=Arr[i][Arr.length-1];
		}
		this.setFront(front);
//		this.Print(front);
		this.setLast(last);
//		this.Print(last);
	}
	
	/**
	 * 打印一维数组
	 * @param Arr
	 */
	public void Print(char[] Arr)
	{
		int i;
		System.out.println();
		for(i=0;i<Arr.length;i++)
		{
			if(i<Arr.length-1)
				System.out.print(Arr[i]+",");
			else
				System.out.println(Arr[i]);
		}
		System.out.println();
	}
	
	/**
	 * 打印二维数组
	 * @param Arr
	 */
	public void Print2(char[][] Arr)
	{
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	/**
	 * 进行bwt编码
	 * @param bwt
	 */
	public void EncodeBwt()
	{
		this.StoNum();
		this.StoStaBwt();
		this.Sort(this.getStaBwt());
		System.out.print("The encode result: ");
		System.out.println(this.getLast());
	}
	
	/**
	 * 解码
	 */
	public void DecodeBwt()
	{
		int[] Pro = new int[this.Last.length];	//前缀数组用于统计小于当前字符的字符个数
		int count = 0;		//计算L从开始位置到当前位置等于该字符的字符数
		int index=0;
		int index2=0;
		String EndString;
		char[] EndBwt = new char[this.Last.length];
		//通过前缀数组计算数组pro
		for(int i=0;i<this.Front.length;i++)
		{
			int tcount=0;
			for(int j=0;j<this.Front.length;j++)
			{
				if(this.getFront()[j]<this.getFront()[i])
					tcount++;
			}
			Pro[i] = tcount;
		}
//		SubNum(Pro);
		//将index初始值设置为0；
		EndBwt[index2++] = this.getFront()[index];
		SetOne(this.getFront()[index], Pro);
		while(MinPro(Pro))
		{
			EndBwt[index2++] = this.getLast()[index];
			SetOne(this.getLast()[index],Pro);
			if(!MinPro(Pro))
				continue;
			count=SamCount(this.getLast()[index],this.getLast(),index);
			index=CoutoInd(this.getLast()[index], this.getFront(), count);

		}
		EndString = NumtoStr(BwtTran(EndBwt));
//		Print(EndBwt);
		System.out.println("The decode result: "+EndString);
	}
	
	/**
	 * 实现数组转换为字符串
	 * @param bwt
	 */
	private String NumtoStr(char[] bwt)
	{
		String tmpString;
		tmpString = Arrays.toString(bwt);
		return tmpString;
	}
	/**
	 * 是一个是返回在Front中的索引
	 * @param index
	 * @return
	 */
	
	private char[] BwtTran(char[] bwt)
	{
		char[] temp= new char[bwt.length-1];
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=bwt[bwt.length-1-i];
		}
		return temp;
	}
	
	private int LtoT(int index)
	{
		char tmp;
		tmp = Last[index];
		
		return 0;
	}
	
	/**
	 * L->F中非常关键的一步，计算出ch的位置索引
	 * @param ch
	 * @param front
	 * @param count
	 * @return
	 */
	private int CoutoInd(char ch,char[]front,int count)
	{
		int index=0;
		int cou=0;
		int realStat;
		for(int i=0;i<front.length;i++)
		{
			if(ch == front[i])
			{
				cou++;
				index=i;
			}
		}
		realStat=index-cou+1+count;
		return realStat;
	}
	
	/**
	 * 将pro中使用过的ch设置为-1，避免二次使用
	 * @param ch
	 * @param fla
	 */
	private void SetOne(char ch,int[] fla)
	{
		for(int i=0;i<fla.length;i++)
		{
			if(ch==Front[i]&&fla[i]!=-1)
			{
				fla[i]=-1;
				break;
			}
		}
	}
	/**
	 * 统计L中从开始位置到当前字符位置等于该字符的字符数量
	 * @param ch
	 * @param bwt
	 * @param index
	 * @return
	 */
	private int SamCount(char ch,char[] bwt,int index)
	{
		int count = 0;
		for(int i=0;i<index;i++)
		{
			if(ch==bwt[i])
				count++;
		}
		return count;
	}
	/**
	 * 判断循环是否可以继续
	 * @param num
	 * @return
	 */
	private boolean MinPro(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>=0)
				return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param num
	 */
	private void SubNum(int[] num)
	{
		for(int i=0;i<num.length;i++)
			num[i]=num[i]-1;
	}
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	private int IndexPro(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==0)
				return i;
		}
		return 0;
	}
 	public String getBwt()
	{
		return bwt;
	}

	public void setBwt(String bwt)
	{
		this.bwt = bwt;
	}

	public char[] getStBwt()
	{
		return StBwt;
	}

	public void setStBwt(char[] stBwt)
	{
		StBwt = stBwt;
	}

	public char[][] getStaBwt()
	{
		return StaBwt;
	}

	public void setStaBwt(char[][] staBwt)
	{
		StaBwt = staBwt;
	}

	public char[][] getEndBwt()
	{
		return EndBwt;
	}

	public void setEndBwt(char[][] endBwt)
	{
		EndBwt = endBwt;
	}
	

	public char[] getFront()
	{
		return Front;
	}
	

	public void setFront(char[] front)
	{
		Front = front;
	}
	

	public char[] getLast()
	{
		return Last;
	}
	

	public void setLast(char[] last)
	{
		Last = last;
	}
	

}
