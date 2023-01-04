package JavaOppsConcepts.ClassConcapts;


class Employee{

    int id;
    int salary;
    String name;

    public void printDetail() {
        System.out.println("My id is : "+id);
        System.out.println("My name is : "+name);
    }

    public int getSalary() {
        return salary;
    }
}
public class CreateCustomClass {

    public static void main(String[] args) {

        System.out.println("This is our custom class");
        Employee krishan = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Krishna
        krishan.id = 12;
        krishan.salary = 34;
        krishan.name = "CodeKrishna";

        // Setting Attributes for john
        john.id = 19;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        krishan.printDetail();
        john.printDetail();
        int salary = john.getSalary();
        System.out.println(salary);


        // Direct print
        //System.out.println(krishan.id);
        //System.out.println(krishan.name);




    }}
