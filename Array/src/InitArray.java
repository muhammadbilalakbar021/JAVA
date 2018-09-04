public class InitArray 
{
	public static void main(String[] args)
	{
		int [] array=new int[10];
		
		System.out.println("The very first array");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.printf("%d%5d%n", i,array[i]);
		}
	}
}
