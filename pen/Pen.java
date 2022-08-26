package pen;

public class Pen {
    String colour;
    String type; //ballpoint, gel
    public void write(){
        System.out.println("writing something");
    }
    // This keyword is used to pointing out specific object such as printColour
    public void printColour(){
        System.out.println("The Colour of the pen is " + this.colour);
    }

}
