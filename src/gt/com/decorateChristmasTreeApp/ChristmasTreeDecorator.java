package gt.com.decorateChristmasTreeApp;


public abstract class ChristmasTreeDecorator {

    public ChristmasTreeDecorator() {
    }

    protected IChristmasTree tree;

    public void place() {
           System.out.println("Colocando Árbol");
    }

}