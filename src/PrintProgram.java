import java.awt.*;
import java.io.IOException;

public class PrintProgram {

    public static void main(String[] args) throws IOException, FontFormatException {
        // Load the Pranjal font
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font font = Font.createFont(Font.TRUETYPE_FONT, Main.class.getResourceAsStream("Pranjal.ttf"));
        ge.registerFont(font);

        // Set the font to Pranjal
        font = font.deriveFont(Font.PLAIN, 36);
        String name = "Prajjwal";

        // Print the name in Pranjal font
        System.out.println(name);

          String s2 = "Prajjwal";
          //Print the name in Pranjal font
          System.out.println(s2);


    }
}
