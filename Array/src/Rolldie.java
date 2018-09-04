import java.security.SecureRandom;
public class Rolldie {

	public static void main(String[] args) 
	{
		SecureRandom random =new SecureRandom();
		
		int [] array=new int[7];
		for(int i=0;i<600000;i++)
		{
			++array[1+random.nextInt(6)];
		}
		for(int i=1 ;i <array.length;i++)
		{
			System.out.printf("Array[%d]=%d%n", i,array[i]);
		}
	}
	

}
