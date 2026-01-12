package hashTable;

public class Main {
    public static void main(String[] args){
        HashTable<String, Integer> table = new HashTable<>();
        table.put("nathan",413213);
        table.put("joe",413214);
        table.prettyPrint();
        table.put("nathan",1232);
        table.prettyPrint();
        System.out.println(table.containsKey("nathan"));
        System.out.println(table.get("nathan"));
        System.out.println(table.containsKey("nathan"));
        table.prettyPrint();
        System.out.println(table.size());
        System.out.println(table.isEmpty());
        table.clear();
        table.prettyPrint();
        System.out.println(table.size());
        System.out.println(table.isEmpty());

    }
}
