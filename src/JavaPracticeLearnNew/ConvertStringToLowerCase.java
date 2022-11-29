package JavaPracticeLearnNew;

public class ConvertStringToLowerCase {

    static String toLower(String S) {
        String p = S.toLowerCase();
       // System.out.println(p);
        return p;

    }

    public static void main(String[] args) {
       toLower("ABCddE");
    }
}
/*
Input: S = "ABCddE"
Output: "abcdde"
Explanation: A, B, C and E are converted to
a, b, c and E thus all uppercase characters
of the string converted to lowercase letter.

Input: S = "LMNOppQQ"
Output: "lmnoppqq"
Explanation: L, M, N, O, and Q are
converted to l, m, n, o and q thus
all uppercase characters of the
string converted to lowercase letter.
 */
