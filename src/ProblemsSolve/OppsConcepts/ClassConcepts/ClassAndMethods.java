package ProblemsSolve.OppsConcepts.ClassConcepts;


class Employee {

    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }
}
public class ClassAndMethods {

    public static void main(String[] args) {


        Employee krishna = new Employee();
        krishna.salary = 233;
        krishna.setName("Krishna Singh Rathore");
        System.out.println(krishna.getName());
        System.out.println(krishna.getSalary());


    }
}

/*
        Question --> Create a class Employee with the following properties and methods:
                        --> Salary (property) (int)
                        --> getSalary (method returning int)
                        --> name (property) (String)
                        --> getName (method returning String)
                        --> setName (method changing name)
 */
