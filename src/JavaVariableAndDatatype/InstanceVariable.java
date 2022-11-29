package JavaVariableAndDatatype;

public class InstanceVariable {

    public String str; // Declared  Instance Variable
    {
        // Default Constructor
        this.str = " Krishna "; // initializing Instance Variable;
    }
    // Main Method
    public static void main(String[] args) {
         // object Creation
        InstanceVariable name = new InstanceVariable();
        // Displaying Output
        System.out.println(" The name is : " + name.str);
    }
}

/*
  Instance Variable : Instance variable are non-static variable are declared in a class outside of any method, block or constructor.
 */
