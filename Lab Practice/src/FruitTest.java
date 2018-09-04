public class FruitTest {
	
	
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
			
			for(Fruit fruit:fruitTest)
			{
				if(fruit instanceof Citrus)
				{
					Citrus cit=(Citrus) fruit;
					
					i =i+cit.getVitamin();
					
					
				}
				if(fruit instanceof Melon)
				{
					Melon mel=(Melon) fruit;
					j=j+mel.getAntiOcident();
				}			
				
			}
			System.out.printf("You will get %.1f gm of Vitamin C%n%n",i);
			
			System.out.printf("You will get %.3f gm of Antioxidants",j);
			
			
			

		}
		
		}

}
