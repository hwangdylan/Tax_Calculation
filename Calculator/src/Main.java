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

        } else {
            doNext();
        }
    }
    public static void main(String[] args) {
        setUI(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        doNext();
    }
}
