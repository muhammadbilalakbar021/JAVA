import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class FruitTest
{
	
	
	public static void main(String[] args) 
	{
		double i=0 ;
		double j=0 ;
		if(args.length!=4)
		{
			System.out.println("Error");
		}
		else
		{
			Fruit[] fruitTest=new Fruit[4];
			
			
			fruitTest[0]=new Kinnu(Integer.parseInt(args[0]));
			fruitTest[1]=new Malta(Integer.parseInt(args[1]));
			fruitTest[2]=new Kharbooza(Integer.parseInt(args[2]));
			fruitTest[3]=new Tarbooz(Integer.parseInt(args[3]));
			
			List<Fruit> list = new ArrayList<>();
			
			list.add(fruitTest[0]);
			list.add(fruitTest[1]);
			list.add(fruitTest[2]);
			list.add(fruitTest[3]);
			
			
			Collections.sort(list);
			
			System.out.printf("%s",list);
			
			
			
			

		}
		
		}

}
