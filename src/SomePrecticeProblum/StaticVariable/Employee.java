package SomePrecticeProblum.StaticVariable;

public class Employee {
    int empid;
    String name;
    static String company = "SP";

    Employee(int empid, String name){
        this.empid = empid;
        this.name = name;

    }

    void display() {
        System.out.println(empid+ " "  +name+ " " +company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Krishna");
        e1.display();
        Employee e2 = new Employee(102, "Amit");
        e2.display();
    }
}
