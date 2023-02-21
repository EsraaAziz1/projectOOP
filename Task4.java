package task.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) throws NegativeValue, FileNotFoundException {
        File f = new File("data.txt");
        FileOutputStream fs = new FileOutputStream("out.txt");
        PrintWriter p= new PrintWriter(fs, true);
            Scanner sc = new Scanner(f);
            int x;
            while (sc.hasNext()) {
                System.out.println("""
                                   choose the number from 1 to 4
                                   1:Calculate The Area of a Circle
                                     2:Calculate The Area of a Rectangle
                                     3:Calculate The Area of a Triangle
                                     4:Quit""");
                x = sc.nextInt();
                
                switch (x) {
                    case 1 -> {
                        geometry a1 = new Circle(sc.nextDouble());
                        p.println("The Area Of Circle is: " + a1.getArea());
                    }
                    case 2 -> {
                        geometry a2 = new Rectangle(sc.nextDouble(), sc.nextDouble());
                        p.println("The Area Of Circle is: " + a2.getArea());
                    }
                    case 3 -> {
                        geometry a3 = new Triangle(sc.nextDouble(), sc.nextDouble());
                        p.println("The Area Of Circle is: " + a3.getArea());
                    }
                    case 4 -> p.println("Quit");
                    default -> {
                        try {
                            throw new NegativeValue("the number of outside the range of 1 through 4");
                        } catch (NegativeValue e) {
                            p.println(e.toString());
                        }
                    }
                    
                }

            }
        p.close();
    }
 
    

}
