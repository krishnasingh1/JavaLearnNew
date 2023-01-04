package ProblemsSolve.OppsConcepts.ClassConcepts;


class TommyVecetti{

    public void hit(){
        System.out.println("Hitting the enemy ");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class RockstarGames {
    public static void main(String[] args) {

        TommyVecetti player1 = new TommyVecetti();

        player1.hit();
        player1.hit();
        player1.fire();
    }
}

/*
        Question --> Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
 */
