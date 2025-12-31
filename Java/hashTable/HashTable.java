package hashTable;
import linkedList.LinkedList;

public class HashTable<K,V> { // takes a generic key, value pair
    private LinkedList[] hashTable;
    private final int sizeOfTable = 51;
    public HashTable(){
        LinkedList[] hashTable = new LinkedList[sizeOfTable];
    }

    public boolean insert(K key, V value){
        return false; // placeholder
    }

    // returns position in array to place data
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
