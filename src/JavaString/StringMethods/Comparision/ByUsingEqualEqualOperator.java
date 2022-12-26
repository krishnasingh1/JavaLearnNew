package JavaString.StringMethods.Comparision;

public class ByUsingEqualEqualOperator {

    public static void main(String[] args) {

        String s1 = "Krishna";
        String s2 = "Krishna";
        String s3 = new String("Krishna");

        System.out.println(s1 == s2);//true (Because both refer to same instance)
        System.out.println(s1 == s3);//false (Because s3 refers to instance create in non-pool)
    }
}

/*
        By Using == operator --> The == operator compares references not values.

 */
