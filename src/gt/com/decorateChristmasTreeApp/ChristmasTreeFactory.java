package gt.com.decorateChristmasTreeApp;


public class ChristmasTreeFactory {

   
    public ChristmasTreeFactory() {
    }

    
    public IChristmasTree getChristmasTree(TypeTree typeTree) {
        switch(typeTree){
            case Pinabete:{
                return new Pinabete();                
            }               
            case Chiribisco:{                
                  return new Chiribisco();
            }                
            case Holly:{                
                  return new Holly();
            }
            case Thuya:{                
                  return new Thuya();
            }
            case NobleFir:{
                return new NobleFir();
            }
            default:{
                return null;
            }      
        }
        
    }

}