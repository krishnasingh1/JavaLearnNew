package ProblemsSolve.OppsConcepts.ClassConcepts;

class Rectangle{
    int l;
    int w;

    public int area (){
        return l * w;
    }

    public int perimeter() {
        return 2 * (l + w);
    }


}
public class RectangleProperty {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();

        rec.l = 5;
        rec.w = 4;

        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }
}

/*
        Question --> Create a class Rectangle with a method to initialize its sides, calculating area, perimeter etc.
 */
