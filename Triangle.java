
package task.pkg4;

public class Triangle extends geometry{
    private double base;
    private double length;

    public Triangle(double base, double length) {
        this.base = base;
        this.length = length;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
      @Override
    public double getArea(){
         if(base<0 ||length<0){
                 try {
                     throw new NegativeValue("Error "+
                             "\n you must enter a positive number");
                 } catch (NegativeValue ex) {
                     System.out.println(ex.toString());
                 }
             }
             else{
              return base*length*0.5;
             }
         return 0;
        
    }
    
}
