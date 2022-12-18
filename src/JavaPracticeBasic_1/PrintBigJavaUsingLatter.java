package JavaPracticeBasic_1;

public class PrintBigJavaUsingLatter {
    public static void main(String[] args) {
        for (int i = 0; i<4;i++){
            switch (i){
                case 0:
                    for (int j=0;j<26;j++){
                        switch (j){
                            case 8 :
                            case 22:
                                System.out.print("a");
                                break;
                            case 3:
                                System.out.print("J");
                                break;
                            case 12:
                            case 18:
                                System.out.print("v");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }
                    }
                    System.out.println("");
                    break;
                case 1:
                    for (int j=0; j<26; j++ ){
                        switch (j){
                            case 3:
                                System.out.print("J");
                                break;
                            case 7:
                            case 9:
                            case 21:
                            case 23:
                                System.out.print("a");
                                break;
                            case 13:
                            case 17:
                                System.out.print("v");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }
                    }
                    System.out.println("");
                    break;

                case 2:

                    for (int j=0; j<26; j++ ){
                        switch (j){
                            case 0:
                            case 3:
                                System.out.print("J");
                                break;
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                                System.out.print("a");
                                break;
                            case 14:
                            case 16:
                                System.out.print("V");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }

                    }
                    System.out.println("");
                    break;
                case 3:
                    for (int j=0; j<26; j++ ){
                        switch (j){
                            case 1:
                            case 2:
                                System.out.print("J");
                                break;
                            case 5:
                            case 11:
                            case 19:
                            case 25:
                                System.out.print("a");
                                break;
                            case 15:
                                System.out.print("V");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }

                    }
                    break;
                default:
                    System.out.println("Ceva nu e bine!!!");
                    break;
            }
        }
    }
}
