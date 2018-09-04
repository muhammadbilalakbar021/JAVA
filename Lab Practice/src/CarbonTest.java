import java.util.ArrayList;
public class CarbonTest 
{

	public static void main(String[] args) 
	{
		
		if(args.length==3)
		{
			ArrayList<Carbon> carboN = new ArrayList<Carbon>();
			
			
			carboN.add(0,new House(Integer.parseInt(args[0])));
			carboN.add(1,new Car(Integer.parseInt(args[1]))); 
			carboN.add(2,new Bicycle(Integer.parseInt(args[2])));
			
			carboN.trimToSize();
			
			System.out.printf("A %d sq feet House will generate %d gm of C02 %n",carboN.get(0).getCarboNDioXide(),carboN.get(0).getCarbon());
			System.out.printf("A %d CC car  will generate %d gm of C02 %n",carboN.get(1).getCarboNDioXide(),carboN.get(1).getCarbon());
			System.out.printf("A %d gear Bicycle will generate %d gm of C02 %n ",carboN.get(2).getCarboNDioXide(),carboN.get(2).getCarbon());
			System.out.printf("Total Co2 generated is %d%n",carboN.get(0).getCarbon()+carboN.get(1).getCarbon()+carboN.get(2).getCarbon());
			
			System.out.println("Size of Array"+carboN.size());
		}
		else
		{
			System.out.println("Error");
		}
	    
	    
	    
		

	}

}
