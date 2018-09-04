public class AnalysisProgram 
{
	public static void main(String[] args) 
	{
		int[] Responses={1,2,3,4,5,4,3,2,4,5,1,1,1,8,9,13};
		int[] freq=new int[6];
		
		for(int i=0;i<Responses.length;i++)
		{
			try
			{
				++freq[Responses[i]];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("e");
				System.out.printf("Error at Array[%d]=%d%n",i,Responses[i]);
			}
			
		}
		for(int i=0;i<freq.length;i++)
		{
			System.out.printf("Array[%d]=%d%n",i,freq[i]);
		}

	}

}
