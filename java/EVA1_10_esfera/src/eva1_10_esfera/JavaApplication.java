/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_esfera;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */


public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("introduce R");
        double r;
        
        r = input.nextDouble();
        System.out.println("introduce n");
        double n;
        
        n = input.nextDouble();
        int p;
        
        p = (int) 3.1416;
        double v;
        
        v = (double) 4 / 3 * ((double) p * Math.pow(r, 3) / 360) * n;
        System.out.println("el volumen es ");
        System.out.println(v);
    }
}
