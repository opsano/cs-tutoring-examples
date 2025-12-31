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

    private int hash(K key){
        return 0; // placeholder
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
