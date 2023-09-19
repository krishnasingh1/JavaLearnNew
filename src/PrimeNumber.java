public class PrimeNumber {

    public static void main(String[] args) {

        int num = 4;
        PrimeNum(num);
    }

    public static void PrimeNum(int num){

        int temp = 0;
        if (num <= 1){
            System.out.println(" The " +num+ " is Not Prime");
            return;
        }
        for (int i = 2; i < num/2; i++) {

            if (num % i == 0) {
                temp = temp + 1;
                break;
            }
        }

        if (temp > 0){
            System.out.println(" The " +num+ " is Not Prime");
        }else {
            System.out.println(" The " +num+ " is Prime");
        }
    }
}
