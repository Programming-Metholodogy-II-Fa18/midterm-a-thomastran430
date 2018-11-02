import java.util.Arrays;

public class queue
{
	private int count;
	private int arraySize;
	private int[] x;
	
	queue()
	{
		count = 0;
		arraySize = 6;
		int[]x = new int[arraySize];
		Arrays.fill(x, 0);
	}
	void add(int a)
	{
		x[count] = a;
		count++;
	}
	
	int remove()
	{
		int temp = x[0];
		for (int i = 0; i < arraySize; i++)
		{
			x[i] = x[i + 1];
		}
		arraySize--;
		return temp;
	}
	
	int getValue(int i)
	{
		if (i > arraySize)
		{
			return -1;
		}
		return x[i];
	}
}
