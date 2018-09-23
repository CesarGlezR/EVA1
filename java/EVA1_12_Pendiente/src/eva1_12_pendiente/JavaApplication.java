/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_pendiente;

/**
 *
 * @author temporal2
 */
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce y1");
        double y1;
        
        y1 = input.nextDouble();
        System.out.println("Introduce y2");
        int y2;
        
        y2 = input.nextInt();
        System.out.println("Introduce x1");
        double x1;
        
        x1 = input.nextDouble();
        System.out.println("introduce x2");
        double x2;
        
        x2 = input.nextDouble();
        double p;
        
        p = (y1 - y2) / (x1 - x2);
        System.out.print("La pendiente es ");
        System.out.println(p);
    }
}
