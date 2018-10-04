//import javax.xml.bind.annotation.XmlType;
import java.awt.Color;
import java.awt.Font;
/** This is where the main method is*/
public class Main {
    final static int DEFAULT_WIDTH = 500;
    final static int DEFAULT_HEIGHT = 500;
    static int width;
    static int height;
    private static void setUI(int width, int height) {
        Main.width = width;
        Main.height = height;
        StdDraw.setCanvasSize(width,height);
        StdDraw.setYscale(0, height);
        StdDraw.setXscale(0, width);
        StdDraw.setPenRadius(.5);
        StdDraw.setPenColor(StdDraw.BLUE);
        //StdDraw.point(width/2, height/2);
        StdDraw.text(width/2, height/2, "Tax Calculator");
    }
    public static void doNext() {
        char c;
        while (!StdDraw.hasNextKeyTyped()) {
            continue;
        }
        c = StdDraw.nextKeyTyped();
        if (c == 'n' || c == 'N') {
            StdDraw.clear(Color.white);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.text(width/2, height/2 + 100, "What is your gross income?");
            StdDraw.show();
            newCalculation();

        } else {
            doNext();
        }
    }
    public static void newCalculation() {
        long seed = seedHelper("", 0);
        StdDraw.clear();
        StdDraw.text(width/2, height - 20, "Your Income: ");
        StdDraw.text(width/2, height/2, Long.toString(seed));
        StdDraw.show();
    }
    private static long seedHelper(String c, int count) {
        char curr;
        while (!StdDraw.hasNextKeyTyped()) {
            continue;
        }
        curr = StdDraw.nextKeyTyped();
        StdDraw.textLeft(width/2 - 30 + count, height/2, String.valueOf(curr));
        StdDraw.show();
        if (curr == '1' || curr == '2' || curr == '3' || curr == '4' || curr == '5' || curr == '6'
                || curr == '7' || curr == '8' || curr == '9' || curr == '0') {
            c = (c + String.valueOf(curr));
            return seedHelper(c, count + 10);
        } else if (curr == 's' || curr == 'S') {
            StdDraw.textLeft(30, 25, String.valueOf(c));
            StdDraw.show();
            try {
                long seed = Long.parseLong(c);
                return seed;
            } catch (NumberFormatException i) {
                StdDraw.clear(Color.GRAY);
                StdDraw.text(width / 2, height / 2, "Invalid Use only numbers");
                StdDraw.show();
                return seedHelper("", 0);
            }
        } else {
            c = (c + String.valueOf(curr));
            return seedHelper(c, count + 1);
        }

    }
    public static void main(String[] args) {
        setUI(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        doNext();
    }
}
