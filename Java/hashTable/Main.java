package hashTable;

public class Main {
    public static void main(String[] args){
        HashTable<String, Integer> table = new HashTable<>();
        System.out.println(table.put("nathan",413213));
        System.out.println(table.put("joe",413214));
        table.prettyPrint();
        System.out.println(table.put("nathan",1232));
        table.prettyPrint();
    }
}
