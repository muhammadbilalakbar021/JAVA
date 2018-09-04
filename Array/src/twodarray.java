import java.util.Scanner;
public class twodarray 
{

	public static void main(String[] args) 
	{
		int[][] array=new int [3][3];
		Scanner input =new Scanner(System.in);
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				array[i][j]=input.nextInt();
			}
		}
		for(int[] i : array)
		{
			for(int j:i )
			{
				System.out.printf("%d   ", j);
			}
			System.out.println();
		}

	}

}
