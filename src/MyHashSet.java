
public class MyHashSet {

	class V {
		int val;
		V next;
	}

	int bucket_size = 100;
	V[] mArray;

	/** Initialize your data structure here. */
	public MyHashSet() {
		mArray = new V[bucket_size];
	}

	public void add(int key) {
		int k = key % bucket_size;
		V v = mArray[k];
		if (v == null) {
			V newItem = new V();
			newItem.val = key;
			mArray[k] = newItem;
		} else {
			if (v.val == key) {
				return;
			}
			while (v.next != null) {
				if (v.next.val == key) {
					return;
				}
				v = v.next;
			}
			V newItem = new V();
			newItem.val = key;
			v.next = newItem;
		}
	}

	public void remove(int key) {
		int k = key % bucket_size;
		V v = mArray[k];
		if (v == null) {
			return;
		} else {
			if (v.val == key) {
				mArray[k] = v.next;
			} else {
				while (v.next != null) {
					if (v.next.val == key) {
						v.next = v.next.next;
					} else {
						v = v.next;
					}
				}
			}
		}
	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		int k = key % bucket_size;
		V v = mArray[k];
		while (v != null) {
			if (v.val == key) {
				return true;
			}
			v = v.next;
		}
		return false;
	}

	public static void main(String[] args) {
		MyHashSet hashSet = new MyHashSet();
		hashSet.add(1);
		hashSet.add(2);
		System.out.println(hashSet.contains(1)); // returns true
		System.out.println(hashSet.contains(3)); // returns false (not found)
		hashSet.add(2);
		System.out.println(hashSet.contains(2)); // returns true
		hashSet.remove(2);
		hashSet.remove(2);
		hashSet.remove(101);
		System.out.println(hashSet.contains(2)); // returns false (already removed)
	}
}
