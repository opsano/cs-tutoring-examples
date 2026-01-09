package hashTable;
import linkedList.LinkedList;

public class HashTable<K, V> { // takes a generic key, value pair
    private final LinkedList<entry<K, V>>[] hashTable; // storing linked list of entries
    private final int sizeOfTable = 51;
    public HashTable(){
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

    public boolean put(K key, V value){
        int position = hash(key);
        if (hashTable[position] == null){
            hashTable[position] = new LinkedList<entry<K,V>>();
        }
        entry<K, V> newEntry = new entry<K,V>(key, value);
        if(hashTable[position].search(newEntry)){
            System.out.println("Key already found! Updating Value!");
            hashTable[position].update(newEntry,newEntry);
            return false;
        }
        hashTable[position].append(newEntry);
        return true;
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
            if (hashTable[i] == null) continue;
            else{
                System.out.printf("[Bucket %d: ",i);
                hashTable[i].display(false);
                System.out.println("]");
            }
        }
    }

    /* TODO:
        put(key, value) - insert
        get(key) - search
        remove(key) - delete
        containsKey(key) - check if key exists
        size() - gets size of all entries
        isEmpty() - checks if table is empty
        clear() - empties table
    */



}
