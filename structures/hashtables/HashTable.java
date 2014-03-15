/* 

Use a HashMap when: 

1) O(1) lookup is necessary 
2) 

The best way to implement a hash table in Java is: 
HashMap<Object, Object> hashmap_objects = new HashMap<Object, Object>();

hashmap_objects.put(Object k, Object v);
hashmap_objects.get(Object k);

hashmap_objects.clear();

hashmap_objects.containsKey();
hashmap_objects.containsValue();

for (Map.Entry<Object, Object> entry : hashmap_objects.entrySet()) {
	
	Object key = entry.getKey();
	Object value = entry.getValue();
}

for (Iterator i = hashmap_objects.entrySet().iterator(); i.hasNext();) {
	
	Map.Entry pair = (Map.Entry)i.next();

	Object key = pair.getKey();
	Object value = pair.getValue();
}

*/

public class HashTable {


}


for (Map.Entry<Object, Object> entry : hashmap_objects.entrySet()) {

	
}