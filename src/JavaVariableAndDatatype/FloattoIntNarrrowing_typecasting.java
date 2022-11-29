package JavaVariableAndDatatype;

public class FloattoIntNarrrowing_typecasting {
    public static void main(String[] args) {
        float f = 10.5f;
        // int a = f is a Compile Time Error
        int a = (int)f;

        System.out.println(f);
        System.out.println(a);
    }
}
