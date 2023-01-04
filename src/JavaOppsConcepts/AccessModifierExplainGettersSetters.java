package JavaOppsConcepts;


class MyEmployee{
    private int id;
    private String name;

    public void setName(String n) {
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }


}
public class AccessModifierExplainGettersSetters {
    public static void main(String[] args) {

        MyEmployee krishna = new MyEmployee();
        // krishna.id = 45;
        // krishna.name = "Krishna Singh"; --> Throws an error due to private access modifiers

        krishna.setName("Krishna Pal Singh");
        System.out.println(krishna.getName());
        krishna.setId(234);
        System.out.println(krishna.getId());

        // example
        MyEmployee emp1 = new MyEmployee();

        emp1.setName("Shubham");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());



    }
}
