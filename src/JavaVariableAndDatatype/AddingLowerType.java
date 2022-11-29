package JavaVariableAndDatatype;

public class AddingLowerType {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        // byte c = a + b ; is Compile time Error : Because a + b = 20 will be int
        byte c = (byte)(a + b);

        System.out.println(c);
    }
}
