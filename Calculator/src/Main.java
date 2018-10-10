//import javax.xml.bind.annotation.XmlType;
import java.awt.Color;
import java.awt.Font;
/** This is where the main method is*/
public class Main {
    final static int DEFAULT_WIDTH = 500;
    final static int DEFAULT_HEIGHT = 500;
    static int width;
    static int height;
    private GrossIncome person;
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
    public static void doNext(Person person) {
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
            newCalculation(person);

        } else {
            doNext(person);
        }
    }

    /**this is where most of the methods will be called
     * and processed.
     * the called methods will be helper methods
     * @param pers person instance
     */
    public static void newCalculation(Person pers) {
        long seed = askGrossIncome("", 0);
        GrossIncome temp = pers.getGrossIncome();
        temp.setGrossIncome(seed);
        StdDraw.clear();
        StdDraw.text(width/2, height - 20, "Your Income: ");
        StdDraw.text(width/2, height/2, Long.toString(temp.getGrossIncome()));
        System.out.println("your income: " + Long.toString(temp.getGrossIncome()));
        StdDraw.show();

    }

    private static long askFilingStatus(String c, int count) {

        return 0;
    }
    private static long askGrossIncome(String c, int count) {
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
            return askGrossIncome(c, count + 10);
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
                return askGrossIncome("", 0);
            }
        } else {
            c = (c + String.valueOf(curr));
            return askGrossIncome(c, count + 1);
        }

    }
    public static void main(String[] args) {
        Person currentPerson = new Person(new GrossIncome(), new FilingStatus(), new Deductibles());
        setUI(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        doNext(currentPerson);
    }
}
