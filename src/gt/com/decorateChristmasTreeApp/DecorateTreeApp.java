package gt.com.decorateChristmasTreeApp;

public class DecorateTreeApp {

    public DecorateTreeApp() {
    }

    public static void main(String[] args) {
        ChristmasTreeFacade fachada = new ChristmasTreeFacade();

        fachada.addLights();

        fachada.addBombs();
        fachada.addCandy();
        fachada.addSnow();
        fachada.addStar();

    }

}
