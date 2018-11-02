public class main {
	public static void main(String[] args) 
	{
		ProblemThree test = new ProblemThree();
		int[] a = {1, 5, 8, 10, 12, 14, 18, 20, 33, 41};
		test.search(a, a.length, 8);
		test.search(a, a.length, 33);
	}
}
