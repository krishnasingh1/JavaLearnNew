package JavaVariableAndDatatype;

// java class
public class PrimitiveDataTypeByte {
    // main Method
    public static void main(String[] args) {

        byte a = 126;

        // byte is 8 bit value
        System.out.println(a);

        a++;
        System.out.println(a);

        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);

        // Looping back within the rannge
        a++;
        System.out.println(a);
    }
}

/*
  note :-->  The byte data type is an 8-bit signed two's complement integer.
             The byte data ype is useful for saving memory in large arrys.

             Syntax :--> byte byteVar;
             Size :--> 1 byte (8 bits)
             Values :--> -128 to 127 ( 2^8/2 to 2^8/2-1)
             Default Value :--> 0



 */
