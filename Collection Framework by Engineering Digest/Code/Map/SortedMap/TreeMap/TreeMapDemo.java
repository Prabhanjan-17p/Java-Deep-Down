package Map.SortedMap.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		// TreeMap stores keys in **sorted ascending order**.
		// It does NOT allow null keys, but allows multiple null values.

		TreeMap<Object, String> t = new TreeMap<>();

		// Inserting key-value pairs
		t.put(4, "Ravi");
		t.put(7, "Aswin");
		t.put(2, "Ananya");
		t.put(1, "Dinesh");
		t.put(9, "Ravi");     // Duplicate values are allowed
		t.put(3, "Ankita");
		t.put(5, null);       // Null values are allowed

		// TreeMap will auto-sort the keys
		System.out.println("TreeMap sorted by keys: " + t);
		// Output: {1=Dinesh, 2=Ananya, 3=Ankita, 4=Ravi, 5=null, 7=Aswin, 9=Ravi}
	}
}
