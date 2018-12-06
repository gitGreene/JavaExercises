import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public enum FilingStatus {SINGLE, MARRIED, MARRIED_FILING_SEPARATELY};


    public static void main(String[] args) {
//        showMessage();
//        askNameDialog();
//        showImage();
//        powersAndRoots();
//        elevatorFloor();
//        compareToMethod();
//        System.out.println(testingWhileLoop(0, 5000, 5, 20000));
//        System.out.println(testingWhileLoop2());
//        testingDoLoop();
//        charArray();
//        nestedLoop();
//        nestedLoop2();
        jFrameTest();


    }

    public static void showMessage() {
        JOptionPane.showMessageDialog(null, "Hello World");
    }

    public static void askNameDialog() {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
    }

    public static void showImage() {

        try {
            URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
            JOptionPane.showMessageDialog(null, "Hello", "Title",
                    JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        } catch(MalformedURLException exception) {
            exception.printStackTrace();
        }
    }

    public static void powersAndRoots() {
        int firstNumber = 5;
        int secondNumber = 6;
        int thirdNumber = 64;
        System.out.println(Math.pow(firstNumber, secondNumber));
        System.out.println(Math.sqrt(thirdNumber));
    }

    // Using the conditional operator in value assignment
    public static void elevatorFloor() {
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        int floor = in.nextInt();

        System.out.println("The actual floor is: " + (floor > 13 ? floor -1 : floor));
    }

    // Method to determine which String comes first alphabetically
    // Making sure to match both strings case-wise since
    // the compareTo method compares Strings Lexicographically
    public static void compareToMethod() {
        String firstName = "MITCH";
        String lastName = "greene";

        if(firstName.toLowerCase().compareTo(lastName.toLowerCase()) < 0) {
            System.out.println("firstName comes before lastName in the dictionary");
        } else if(firstName.toLowerCase().compareTo(lastName.toLowerCase()) > 0) {
            System.out.println("lastName comes before firstName in the dictionary");
        } else {
            System.out.println("The strings are equal");
        }
    }

    public static void testingEnum() {
        FilingStatus status = FilingStatus.SINGLE;

    }

    public static String testingWhileLoop(int year, double balance, double RATE, double target) {
        while(balance < target) {
            year++;
            double interest = balance * RATE / 100;
            balance += interest;
        }
        return year + " years";
    }

    public static int testingWhileLoop2() {
        int startingInteger = 0;
        int endingInteger = 10;

        while(startingInteger <= endingInteger) {
            startingInteger++;
        }

        return startingInteger;
    }


    public static void charArray() {
        String str = "Mitch";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    // Testing Do loop, where the condition is testing AFTER the loop runs once
    // Continues to run is the condition is true0
    public static void testingDoLoop() {
        Scanner in = new Scanner(System.in);
        int value;

        do {
            System.out.println("Enter and integer between 0 and 100: ");
            value = in.nextInt();
        } while (value > 100 || value < 0);
    }

    public static void nestedLoop() {
        final int NMAX = 5;
        final double XMAX = 10;

        for(int i = 1; i <= NMAX; i++) {
            System.out.printf("%10d", i);
        }
        System.out.println();

        for(int i = 1; i <= NMAX; i++) {
            System.out.printf("%10s", "x ");
        }
        System.out.println();

        for(double x = 1; x <= XMAX; x++){
            for(int n = 1; n <= NMAX; n++) {
                System.out.printf("%10.0f", Math.pow(x, n));
            }
            System.out.println();
        }
    }

    public static void nestedLoop2() {
        final int firstNumber = 3;
        final int secondNumber = 5;

        for(int i = 0; i < firstNumber; i++) {
            for(int j = 0; j < secondNumber; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void draw(Graphics g) {
        final int WIDTH = 20;
        final int HEIGHT = 20;
        g.setColor(Color.BLUE);

        int x = 0;
        int y = 0;

        for(int i = 0; i < 10; i++) {
            g.fillRect(x, y, WIDTH, HEIGHT);
            x = x + 2 * WIDTH;
        }
    }

    public static void jFrameTest() {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 800;
        final int FRAME_HEIGHT = 800;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                draw(g);
            }
        };

        frame.add(component);
        frame.setVisible(true);
    }


}
