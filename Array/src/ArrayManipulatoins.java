import java.util.Arrays;
public class ArrayManipulatoins 
{

	public static void main(String[] args) 
	{
		double [] array ={0.4, 4.3,0.01};
		System.out.println("Entered Array is :");
		for(double  i: array)
		{
			System.out.printf("array[%.3f]%n",i);
		}
		Arrays.sort(array);
		System.out.println("Sorted Array is :");
		for(double  i: array)
		{
			System.out.printf("array[%.3f]%n",i);
		}
		
		int[] fillArray=new int[10];
		Arrays.fill(fillArray, 5);
		
		int[] array1={1,2,3,4,5,6,7};
		int[] copy=new int[array.length];
		System.arraycopy(array1, 0,copy, 0, array1.length);

		boolean b=Arrays.equals(array1, fillArray);
				System.out.printf("%narray %s copyarray",b ? "==" : "!=");
				
				int location =Arrays.binarySearch(array1, 4);
				if(location>=0)
				{
					System.out.println("Found");
				}
	}

}
