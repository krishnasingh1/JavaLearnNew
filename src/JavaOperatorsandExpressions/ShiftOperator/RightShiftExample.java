package JavaOperatorsandExpressions.ShiftOperator;

public class RightShiftExample {
    public static void main(String[] args) {

        char [] Hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                        'a', 'b', 'c', 'd', 'e', 'f'};

        byte b = (byte) 0xf1;

        System.out.println("b = 0x" + Hex [(b >> 4) & 0x0f] + Hex[b & 0x0f]);
    }
}
