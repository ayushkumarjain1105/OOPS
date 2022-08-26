package pen;

import pen.Pen;

public class Main {
    public static void main(String[] args) {
    Pen pen = new Pen();
    pen.write();
    pen.colour = "Red";
    pen.type = "Gel";
    Pen pen1 = new Pen();
    pen1.type = "Bol";
    pen1.colour = "Black";

    pen.printColour();
    pen1.printColour();
    }
}
