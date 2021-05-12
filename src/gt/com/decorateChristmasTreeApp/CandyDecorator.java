package gt.com.decorateChristmasTreeApp;


public class CandyDecorator extends ChristmasTreeDecorator {

    public CandyDecorator() {
    }

    
    public void addCandy(IChristmasTree christmasTree) {
        if (christmasTree instanceof NobleFir) {
            System.out.print("Noble fir");
        }
        if (christmasTree instanceof Thuya) {
            System.out.print("Thuya");
        }
        if (christmasTree instanceof Holly) {
            System.out.print("Holly");
        }
        if (christmasTree instanceof Chiribisco) {
            System.out.print("Chiribisco");
        }
        if (christmasTree instanceof Pinabete) {
            System.out.print("Pinabete");
        }
       System.out.println(" Decorado con Dulces");
    }

}