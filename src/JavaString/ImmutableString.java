package JavaString;

public class ImmutableString {

    public static void main(String[] args) {

        String s1 = "Krishna";

        // concat() method appends
        // the String at the end
        s1.concat(" Singh Rathore");

        // This will Print Krishna
        // because strings are immutable object
        System.out.println(s1);
        //Here Krishna is not changed but a new object is created with “Krishna Pal Singh”. That is why a string is known as immutable.

        // How can Concat String immutable
        // there String is immutable Se we can As you can see in the given figure that
        // two objects are created but s reference variable still refers to “Sachin” and not to “Krishna Singh Rathore”.
        //But if we explicitly assign it to the reference variable, it will refer to the “Krishna Singh Rathore” object.
        s1 = s1.concat(" Singh Rathore");
        System.out.println(s1);
    }
}

/*
    Immutable String in Java --> A String is an unavoidable type of variable while writing any application program.
                                 String references are used to store various attributes like username, password, etc.
                                 In Java, String objects are immutable. Immutable simply means unmodifiable or unchangeable.

                                 Once String object is created its data or state can't be changed but a new String object is created.
 */
