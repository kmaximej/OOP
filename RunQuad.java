package runquad;

import java.util.*;
public class RunQuad {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      Square sq = new Square();
      Rectangle rec = new Rectangle();
      
        System.out.print("Press R for rectangle or S for square. ");
        String k = input.nextLine();
       
        if(k.equalsIgnoreCase("R")){
            System.out.println("A rectangle: ");
            rec.showDescription();
        }if(k.equalsIgnoreCase("S")){
            System.out.println("A square: ");
            sq.showDescription();
        }
        
        
    }
    
}
