public class PassArray 
{
	public static void main(String[] args) 
	{
		int [] array={1,2,3,4,5};
		System.out.println("Effects of passing reference to entire array");
		System.out.printf("The values of origional array are :%n");
		for(int i : array)
		{
			System.out.printf("%d   ", i);
		}
		modifyArray(array);
		System.out.printf("The values of origional array are  modifying:%n");
		for(int i : array)
		{
			System.out.printf("%d   ", i);
		}
		System.out.printf("The value of  before array[4]=%d",array[4]);
		modifyElement(array[4]);
		System.out.printf("The value of after array[4]=%d",array[4]);
		
	}
	public static void modifyArray(int[] array1)
	{
		for(int i=0;i<array1.length;i++)
		{
			array1[i] *=2;
		}
	}
	public static void modifyElement(int array1)
	{
		array1 *=2;
		System.out.printf("Value of modifying elemnt is :%d",array1);
	}

}
