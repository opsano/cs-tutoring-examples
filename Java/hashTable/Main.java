package hashTable;

public class Main {
    public static void main(String[] args){
        HashTable<String, String> tble = new HashTable<>();
        System.out.println(tble.hash("names"));
    }
}
