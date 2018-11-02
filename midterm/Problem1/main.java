public class main 
{
	public static void main(String[] args) 
	{
		Sorting x = new Sorting();
		int[] array = {15, 9, 60, 44, 12, 1, 4};
		System.out.println("Array before sorting: ");
		x.print(array);
		System.out.println();
		System.out.println("Array after sorting: ");
		x.ExamSort(array, array.length);
		x.print(array);
	}
}
