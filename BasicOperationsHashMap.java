/*performing basic operations on HashMap*/

import java.util.HashMap;
public class BasicOperationsHashMap
{
	public static void main(String x[])
	{
		HashMap<Integer, String> capitalCities = new HashMap<>();

		//adding elements in the HashMap.
		capitalCities.put(1,"abc");
		capitalCities.put(2,"pqr");
		capitalCities.put(3,"lmn");

		//printing the values.
		System.out.println(capitalCities);

		//access an item.
		System.out.println("Accessing the value at the 1st key");
		System.out.println(capitalCities.get(1));

		//remove a item.
		System.out.println("Value at the 3rd key removed.");
		capitalCities.remove("3");
		
		//printing the hashmap after value removal.
		System.out.println(capitalCities);

		//remove all items.
		capitalCities.clear();
		System.out.println("After clearing.....");
		System.out.println(capitalCities);

		//size of a hashmap.
		System.out.println("Size : " +capitalCities.size());
		
		//adding the elements again.
		capitalCities.put(1,"zml");
		capitalCities.put(2,"ppp");
		capitalCities.put(3,"dsd");
		
		//printing the hashmap.
		System.out.println(capitalCities);
		
		//new size after adding elements.
		System.out.println("Size : "+capitalCities.size());

		//looping through HashMap.

		//printing only the keys.
		System.out.println("Printing the keys.");
		for(Integer i : capitalCities.keySet())
		{
			System.out.println(i);
		}

		//printing the values only.
		System.out.println("Printing the values only.");
		for(String i : capitalCities.values())
		{
			System.out.println(i);
		}
		
		//printing the key and values together.
		System.out.println("Printing the key and values together.");
		for(Integer i : capitalCities.keySet())
		{
			System.out.println("Key " + i + " value : " + capitalCities.get(i));
		}

	}
}