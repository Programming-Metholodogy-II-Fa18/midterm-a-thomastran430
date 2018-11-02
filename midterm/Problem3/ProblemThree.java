public class ProblemThree 
{
	
	void search(int[] a, int arraySize, int x)
	{
		int count = 0;
		for(int i = 0; i < arraySize; i++)
		{
			if(a[i] == x)
			{
				System.out.println(x + " has been found at index " + i);
				System.out.println(count + " compares");
			}
		count++;
		}
	}
}
