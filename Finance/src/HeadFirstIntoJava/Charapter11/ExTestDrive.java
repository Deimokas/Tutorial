package HeadFirstIntoJava.Charapter11;

import javax.swing.*;

class MyEx extends Exception {
}

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];
        try {
            System.out.print("t");
            doRisky(test);
            System.out.print("o");
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
        }
        System.out.println("s");

        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.getDefaultCloseOperation();
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r");
    }
}