package hashTable;
import linkedList.LinkedList;

public class HashTable<K, V> { // takes a generic key, value pair
    private final LinkedList<entry<K, V>>[] hashTable; // storing linked list of entries
    private final int sizeOfTable = 51;
    private int size;
    public HashTable(){
        size = 0;
        hashTable = (LinkedList<entry<K, V>>[]) new LinkedList[sizeOfTable]; // cast the raw array to our generic type
    }
    private static class entry<K,V>{
        K key;
        V value;
        entry(K key, V value){
            this.key = key;
            this.value = value;

        }

        @Override
        // Overrides the equals method within our linked list, allows us to correctly compare entry objects
        public boolean equals(Object o){
            if (this == o) return true; // checks if it is the exact same object in memory
            if (!(o instanceof entry)) return false; // if not an entry, return false
            entry<?,?> other = (entry<?,?>) o; // cast argument from Object to entry
            // will be used like hashtable[pos].equals(new entry), so we check hashtable[pos].key equals other.key
            return this.key.equals(other.key);
        }

        @Override
        public String toString() {
            return String.format("Key: %s, Value: %s",this.key, this.value);
        }
    }

    public void put(K key, V value){
        int pos = hash(key);
        if (hashTable[pos] == null){
            hashTable[pos] = new LinkedList<entry<K,V>>();
        }
        entry<K, V> newEntry = new entry<K,V>(key, value);
        if(containsKey(key)){
            System.out.println("Key already found! Updating Value!");
            /*
            if the key is already found, we update it by using the first argument to find our original key value pair
            then update it using the second argument. We can use the same variable twice since we have a collision
            within the linked list. This is because the key is the same across both the original value & our new one,
            then we can pass our new value into the linked list to update it correctly.
            */
            hashTable[pos].update(newEntry, newEntry);
            return; // don't need to increase size, since we are only changing the value, not adding something new
        }
        hashTable[pos].append(newEntry);
        size++;
    }

    // returns position in the array to place data
    public int hash(K key){
        int position = key.hashCode();
        /*
        the 0x7fffffff bit just forces the hash to be positive
        in memory, we have 1 sign bit then 31 value bits, where a 1 for a sign bit is negative and a 0 is positive

        ex our number is -4:
        10000000 00000000 00000000 00000100 <- negative 4
        01111111 11111111 11111111 11111111 <- binary representation of 0x7fffffff
        bitwise & operator:
        00000000 00000000 00000000 00000100

        the bitwise and operator goes bit by bit and compares two numbers.
        for bitwise and, 1 & 1 = 1, 1 & 0 = 0, 0 & 1 = 0
        so 0x7fffffff changes case, but keeps value bits
        this needs to be positive, because we can't have a negative array position
         */
        return (position & 0x7fffffff) % sizeOfTable;
    }

    public void prettyPrint(){
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null) continue; // skip if its null
            else{
                System.out.printf("[Bucket %d: ",i);
                hashTable[i].display(false); // prints linked list
                System.out.println("]");
            }
        }
    }
    public V get(K key){ // gets the value associated with a specific key
        int pos = hash(key);
        entry<K, V> searchEntry = new entry<K,V>(key, null);
        return hashTable[pos].search(searchEntry).value;
    }

    public V remove(K key){ // removes value from the list and returns it
        int pos = hash(key);
        entry<K, V> searchEntry = new entry<K,V>(key, null);
        V value = hashTable[pos].removeValue(searchEntry).value; // removes the key value pair
        if (hashTable[pos].isEmpty()){ // if that was the last key value pair and the list is empty, make it null
            hashTable[pos] = null;
        }
        size--;
        return value;
    }

    public boolean containsKey(K key){
        int pos = hash(key);
        if (hashTable[pos] == null){ // to prevent null pointer exceptions
            return false;
        }
        entry<K, V> newEntry = new entry<K,V>(key, null);
        return hashTable[pos].search(newEntry) != null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0; // this is a conditional, if size == 0, returns true, if size != 0 returns false
    }

    public void clear(){
        for (int i = 0; i < hashTable.length; i++){
            hashTable[i] = null; // make it point to null & garbage collection can do the rest
        }
        size = 0; // if we clear, the size will always be 0
    }
}
