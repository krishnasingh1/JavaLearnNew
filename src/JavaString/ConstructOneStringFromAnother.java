package JavaString;

public class ConstructOneStringFromAnother {
    public static void main(String[] args) {

        char c[] = {'K', 'R', 'I', 'S', 'H', 'N', 'A'};

        String s1 = new String(c);
        String s2 = new String(s1 + " Singh Rathore");

        System.out.println(s1);
        System.out.println(s2);
    }
}
