import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionTest 
{
	public static void main(String[] args)
	{
		String[] colors={"red","blue","white","black"};
		List<String> list = new ArrayList<String>();
		
		for(String color : colors)
		{
			list.add(color);
		}
		
		System.out.printf("Before sending the string to Default remove\n");
		for(String s1 : list)
		{
			System.out.printf("%s ", s1);
		}
		System.out.print("\n");
		String[] Removecolors={"blue"};
		List<String> Removelist = new ArrayList<String>();
		
		for(String color : Removecolors)
		{
			list.remove(color);
		}
		System.out.printf("After  sending the string to Default remove\n");
		for(String s1 : list)
		{
			System.out.printf("%s ", s1);
		}
		
		list.add("blue");
		
		System.out.println("\nArray List");
		
			for(int count =0 ; count<list.size(); count++)
		{
			System.out.printf("%s ",list.get(count));
		}
		for(String s1 : Removecolors)
		{
			Removelist.add(s1);
		}
		
		
		removeColors(list,Removelist);
		
		System.out.printf("%nArray list after calling removeColord\n");
		for(String s1 : list)
		{
			System.out.printf("%s ", s1);
		}
		
	}	
		private static void removeColors(Collection<String> collection1 , Collection<String> collection2)
		{
			Iterator<String> iterator =collection1.iterator();
					
					while(iterator.hasNext())
					{
						if(collection2.contains(iterator.next()))
						{
							iterator.remove();
						}
					}
		}
	
}
