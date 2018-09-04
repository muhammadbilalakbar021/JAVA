import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListTest {

	public static void main(String[] args) 
	{
		//add colors elemnts  to list1
		String[] colors = {"Black","Yellow","Green","Blue","Violet","Silver"};
		
		List<String> list1 =new LinkedList<>();
		
		for(String st : colors)
		{
			list1.add(st);
		}
		
		//add colors 2 to elements to list2
		String[] colors2 = {"Gold","White","Brown","Blue","Gray","Silver"};
		
		List<String> list2 =new LinkedList<>();
		
		for(String st : colors2)
		{
			list2.add(st);
		}
		
		list1.addAll(list2);
		list2=null;
		
		printList(list1);
		
		//Converting Every element to UPPERCASE
		convrtToUppercaseStrings(list1);
		printList(list1);
		
		
		System.out.printf("%nDeleting 4 to 6 ...");
		removeItems(list1 ,4,7);
		
		printList(list1);
		
		printReversedList(list1);
	}
	
	private static void printList(List<String> list)
	{
		System.out.printf("%n Print List %n");
		for(String color : list)
		{
			System.out.printf("%s ",color);
		}
	}
	
	private static void convrtToUppercaseStrings(List<String> list)
	{
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext())
		{
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
	}
	private static void removeItems(List<String> list, int start , int end)
	{
		list.subList(start,end).clear();		
	}
	
	private static void printReversedList(List<String> list)
	{
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.printf("%n Reversed List");
		
		while(iterator.hasPrevious())
		{
			System.out.printf("%s  ",iterator.previous());
		}
	}

}
