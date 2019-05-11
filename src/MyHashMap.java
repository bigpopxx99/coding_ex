
class MyHashMap {
	
	class KV {
		public int key;
		public int value;
		public KV next;
	}
	
	private KV[] link;
	private final int BUCKET_NUM = 1000000;

	/** Initialize your data structure here. */
	public MyHashMap() {
        link = new KV[BUCKET_NUM];
	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		int k = key % BUCKET_NUM;
		if (link[k] == null) {
			KV item = new KV();
			item.key = key;
			item.value = value;
			link[k] = item;
		}else {
			KV kv = link[k];
			while (kv != null) {
				if (kv.key == key) {
					kv.value = value;
					return;
				}
				kv = kv.next;
			}
			KV item = new KV();
			item.key = key;
			item.value = value;
			item.next = link[k];
			link[k] = item;
		}
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {
        int k = key % BUCKET_NUM;
        if (link[k] == null) {
        	return -1;
        }else {
        	KV item = link[k];
        	while (item != null) {
        		if (item.key == key) {
        			return item.value;
        		}
        		item = item.next;
        	}        	
        }
        return -1;
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a mapping
	 * for the key
	 */
	public void remove(int key) {
        if (get(key) == -1) {
        	return;
        }else {
        	int k = key % BUCKET_NUM;
        	KV item = link[k];
        	if (item.key == key) {
        		link[k] = link[k].next;
        	}
        	while (item.next != null) {
        		if (item.next.key == key) {
        			item.next = item.next.next;
        		}
        	}
        }
	}
	
	private static void print(int i) {
	    System.out.println(i);	
	}
	
	public static void main(String[] args) {
		MyHashMap hashMap = new MyHashMap();
		hashMap.put(395, 865);          
		hashMap.put(595, 271);         
		print(hashMap.get(395));            // returns 1
		print(hashMap.get(595));            // returns -1 (not found)
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj
 * = new MyHashMap(); obj.put(key,value); int param_2 = obj.get(key);
 * obj.remove(key);
 */
