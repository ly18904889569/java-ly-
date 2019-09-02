package test6;

public class QuickSortTest
{

	public static void quickSort(int[] arrays, int p, int r)
	{
		if (p < r)
		{
			int q = partition(arrays, p, r);
			quickSort(arrays, p, q - 1);
			quickSort(arrays, q + 1, r);
		}
	}
 
	public static int partition(int[] arrays, int p, int r)
	{
		int key = arrays[r];	//crazy:k的值等于当前的数组的最后一个元素
		int i = p - 1;
		//crazy:遍历当前的数组，p~r
		for (int j = p; j < r; j++)
		{
			//crazy:将大的数字往后移动
			if (arrays[j] <= key)
			{
				i++;
				int tmp = arrays[j];
				arrays[j] = arrays[i];
				arrays[i] = tmp;
			}
		}
		int tmp = arrays[i + 1];
		arrays[i + 1] = arrays[r];
		arrays[r] = tmp;
		return i + 1;
	}
	
	public static void main(String[] args)
	{
		int[] arrays = { 1, 7, 23, 14, 16, 3, 6, 9, 12, 21, 13, 15, 8, 9, 23, 14, 11, 25, 15 };
		quickSort(arrays, 0, arrays.length - 1);
		for (int num : arrays)
		{
			System.out.print(num + " ");
		}

	}

}
