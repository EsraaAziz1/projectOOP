
package task.pkg4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Circle extends geometry{
     private double reduis;

    public Circle(double reduis) {
            this.reduis = reduis;
        
    }
         public double getReduis(){
             return reduis;
         }
         public void setReduis(double reduis){
             this.reduis=reduis;
         }
     
      @Override
         public double getArea(){
             
             if(reduis<0){
                 try {
                     throw new NegativeValue("Error "+
                             "\n you must enter a positive number");
                 } catch (NegativeValue ex) {
                     System.out.println(ex.toString());
                 }
             }
             else{
             return (reduis*reduis)*3.14;
             }
         return 0;
         }
}