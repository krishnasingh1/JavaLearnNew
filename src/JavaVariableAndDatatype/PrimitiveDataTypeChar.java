package JavaVariableAndDatatype;

// java class
public class PrimitiveDataTypeChar {
    public static void main(String[] args) {

        // Creating and initializing custom character
        char a = 'G';

        // Integer data type is generally
        // used for numeric values
        int i = 89;

        // use byte and short
        // if memory is a constraint
        byte b = 4;

        // this will give error as number is
        // large than byte range
        // byte b1 = 7888888955;

        short s = 56;

         // this will give error as number is
         // larger than short range
         //short s1 = 87878787878;

        // by default fraction value
        // is double is java

        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need this data type
        long l = 12121;

        System.out.println(" char  : " + a);
        System.out.println(" integer : " + i);
        System.out.println(" byte : " + b);
        System.out.println(" short : " + s);
        System.out.println(" float : " + f);
        System.out.println(" double : " + d);
        System.out.println(" long : " + l);
        
    }
}

/*
 note :-> The char data type is a single 16-bit Unicode character.

 Syntax :-> char charVar;
 Size :-> 2 byte (16 bits)
 Values :-> ‘\u0000’ (0) to ‘\uffff’ (65535)
 Note: The default value is ‘\u0000’

 You must be wondering why is the size of char 2 bytes in Java?

  So, in other languages like C/C++ uses only ASCII characters,
  and to represent all ASCII characters 8-bits is enough. But
  java uses the Unicode system not the ASCII code system and to
  represent the Unicode system 8 bits is not enough to represent
  all characters so java uses 2 bytes for characters.
  Unicode defines a fully international character set that can
  represent most of the world’s written languages. It is a
  unification of dozens of character sets, such as Latin, Greeks, Cyrillic, Katakana, Arabic, and many more.

*/
