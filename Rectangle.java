

package task.pkg4;
public class Rectangle extends geometry{
    private double width;
    private double length;
      public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
      
     @Override
    public double getArea(){
         if(width<0 ||length<0){
                 try {
                     throw new NegativeValue("Error "+
                             "\n you must enter a positive number");
                 } catch (NegativeValue ex) {
                     System.out.println(ex.toString());
                 }
             }
             else{
              return width*length;
             }
         return 0;
        
    }
}
