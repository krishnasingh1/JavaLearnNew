package JavaVariableAndDatatype;

public class VariableOverflow {
    public static void main(String[] args) {
        // Overflow
        int a = 130;
        byte b = (byte)a;
        /* Why overflow is here because byte contain value -128 to 127 so
           130 is no exist in byte value so value reverce continue
           is value is -126

         */

        System.out.println(a);
        System.out.println(b);
    }
}
