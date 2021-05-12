package gt.com.decorateChristmasTreeApp;


public class ChristmasTreeDecoratorFactory {

   
    public ChristmasTreeDecoratorFactory() {
    }

    public ChristmasTreeDecorator getChristmasTreeDecorator(TypeDecorator typeDecorator) {
        switch(typeDecorator){
            case Lights:{
                return new LightsDecorator();                
            }               
            case Star:{                
                  return new StarDecorator();
            }                
            case Bombs:{                
                  return new BombsDecorator();
            }
            case Snow:{                
                  return new SnowDecorator();
            }
            case Candy:{
                return new CandyDecorator();
            }
            default:{
                return null;
            }      
        }
        
    }

}