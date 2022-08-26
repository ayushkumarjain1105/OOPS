package inheritance;

import pen.Pen;

public class OOPs {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.colour = "red";
        System.out.println("triangle.colour = " + triangle.colour);


        // Hear we are using information from another package.

        pen.Pen pen = new pen.Pen();
        pen.printColour();

    }
}
