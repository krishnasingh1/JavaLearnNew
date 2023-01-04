package ProblemsSolve.OppsConcepts.ClassConcepts;


class Square{
    int side;

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4 * side;
    }
}
public class SquareProperty {

    public static void main(String[] args) {

        Square sq = new Square();

        sq.side = 3;

        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}

/*
        Question --> Create a class Square with a method to initialize its side, calculating area, perimeter etc.
 */
