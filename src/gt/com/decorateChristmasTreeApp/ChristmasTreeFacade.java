package gt.com.decorateChristmasTreeApp;

import java.util.*;

public class ChristmasTreeFacade {

    private List<IChristmasTree> christmasTree;

    public ChristmasTreeFacade() {
        System.out.println("Colocando Árbol");
        ChristmasTreeFactory fabrica = new ChristmasTreeFactory();
        this.christmasTree = new ArrayList();

        this.christmasTree.add(fabrica.getChristmasTree(TypeTree.Pinabete));
        this.christmasTree.add(fabrica.getChristmasTree(TypeTree.Chiribisco));
        this.christmasTree.add(fabrica.getChristmasTree(TypeTree.Holly));
        this.christmasTree.add(fabrica.getChristmasTree(TypeTree.NobleFir));
        this.christmasTree.add(fabrica.getChristmasTree(TypeTree.Thuya));
       for (int i = 0; i <christmasTree.size() ; i++) {
             christmasTree.get(i).place();
        }
    }

    public void addLights() {

        LightsDecorator dec1 = new LightsDecorator();
       
        for (int i = 0; i <christmasTree.size() ; i++) {
             dec1.addLights(christmasTree.get(i));
        }
       

    }

    public void addSnow() {
         SnowDecorator dec2 = new SnowDecorator();
          for (int i = 0; i <christmasTree.size() ; i++) {
             dec2.addSnow(christmasTree.get(i));
        }
    }

    public void addBombs() {
        BombsDecorator dec3 = new BombsDecorator();
          for (int i = 0; i <christmasTree.size() ; i++) {
             dec3.addBombs(christmasTree.get(i));
        }
    }

    public void addStar() {
        StarDecorator dec4 = new StarDecorator();
          for (int i = 0; i <christmasTree.size() ; i++) {
             dec4.addStar(christmasTree.get(i));
        }
    }

    public void addCandy() {
        CandyDecorator dec5 = new CandyDecorator();

          for (int i = 0; i <christmasTree.size() ; i++) {
             dec5.addCandy(christmasTree.get(i));
        }

    }

}
