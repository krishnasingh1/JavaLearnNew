package SomePrecticeProblum.StaticVariable.OOPsConcepts.StaticKeyword;

import SomePrecticeProblum.StaticVariable.OOPsConcepts.Encapsulation.Employee;

public class StaticEmployee {

    int empid;
    String name;
    static String company = "SP";

    StaticEmployee(int empid, String name){

        this.empid = empid;
        this.name = name;

    }

    void display(){
        System.out.println(empid + " " + name + " " + company);
    }

    public static void main(String[] args) {

        StaticEmployee se1 = new StaticEmployee(101, "amit");
        se1.display();
        StaticEmployee se2 = new StaticEmployee(102, "deepak");
        se2.display();
    }

}
