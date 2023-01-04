package ProblemsSolve.OppsConcepts.ClassConcepts;


class CellPhone{

    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend(){
        System.out.println(" Calling Lakshya...");
    }
}
public class PhoneProperty {
    public static void main(String[] args) {

        CellPhone asus = new CellPhone();

        asus.callFriend();
        asus.vibrate();
        asus.ring();

    }
}

/*
        Question --> Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
 */
