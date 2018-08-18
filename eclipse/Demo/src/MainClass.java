import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	
	
	public static void main(String[] args) {
		Bsearch bsearch = new Bsearch();
		List<Item> items = new ArrayList<Item>();
		
		Item item = new Item();
		item.setCity("India");
		item.setTime(0);
//		items.add(item);

		Item item1 = new Item();

		item1.setCity("Delhi");
		item1.setTime(5);
		items.add(item1);
		
		Item item2 = new Item();

		item2.setCity("Chandigarh");
		item2.setTime(7);
		items.add(item2);
		
		Item item3 = new Item();

		item3.setCity("Banaras");
		item3.setTime(10);
		items.add(item3);
	
		Item item4 = new Item();

		item4.setCity("Bhatinda");
		item4.setTime(15);
		items.add(item4);
		
		int time = 4;
		Item resultItem = bsearch.BSearch(items, time);
		if(resultItem != null)
			System.out.println(" items are " + resultItem.getCity() + "   " + resultItem.getTime());
		else 
			System.out.println(" not found ");
	}
}
