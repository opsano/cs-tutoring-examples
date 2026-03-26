package March.March26Trinity;

public class Main {
    public static void main(String[] Args){
        Employee Joe = new Employee("Joe", 5);
        Employee John = new Employee();
        System.out.println(John.getWage());
        System.out.println(Joe.getWage());
    }
}

class Employee{
    // belongs to the class itself rather than any individual instances of it, will persist across any individual object
    private static int numberOfEmployees;

    private String name; // belongs to objects, the class itself can't see this, and objects can't see the static variable.
    private int wage;
    Employee(){
        //numberOfEmployees++; // every time we make an employee, we want to increase the total number of employees
        //System.out.printf("Total Employees: %d\n", numberOfEmployees);
        name = "";
        wage = 0;
    }
    Employee(String name, int wage){
        this.name = name;
        this.wage = wage;
    }

    public String getName(){
        return name;
    }
    public int getWage(){
        return wage;
    }
    public void setWage(int wage){
        this.wage = wage;
    }

    // this is a static method, meaning you shouldn't use a specific object to call it, instead use the Employee class itself.
    public static int getNumberOfEmployees(){
        return numberOfEmployees;
    }
}
