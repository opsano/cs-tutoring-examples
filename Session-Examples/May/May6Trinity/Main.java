package May.May6Trinity;

public class Main {
    public static void main(String[] Args){
        Employee e1 = new Employee("Joe", "Editor", 43.21);
        e1.getName();
        System.out.println(e1);
        Manager m1 = new Manager("Jeff", "manager", 1000);
        System.out.println(m1.getName());
    }
}

class Employee{
    protected String name;
    protected String job;
    protected double wage;

    Employee(String name, String job, double wage){
        this.name = name;
        this.job = job;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString(){
        return String.format("""
                Name: %s
                Job:  %s
                Wage: %.2f\n""",name, job, wage);
    }
}

class Manager extends Employee{
    Manager(String name, String job, double wage) {
        super(name, job, wage);
    }

    @Override
    public String getName(){
        System.out.println("I am the best");
        return super.name;
    }
}

