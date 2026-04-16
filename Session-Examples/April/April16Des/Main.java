package April.April16Des;

public class Main {
    public static void main(String[] Args){
        Employee joe = new Employee("joe", 20.0);
        Employee jeff = new Employee("Jeff", 25.0);


        System.out.println(Employee.getNumberOfEmployees());
    }
}

class Employee{
    // non static variables
    double salary;
    String name;

    // static variable
    static int numberOfEmployees = 0; // belongs to the class rather than a specific object

    Employee(String name, double salary){ // constructor (instructions for setting up objects)
        this.name = name;
        this.salary = salary;
        System.out.println("Creating Employee"); // prints every time we create an object
        numberOfEmployees++; // increments our static variable every time the constructor runs
    }

    // getters / setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
