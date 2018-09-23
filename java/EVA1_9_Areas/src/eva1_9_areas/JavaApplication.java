/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_areas;

import java.util.Scanner;

/**
 *
 * Cesar Gonzalez 18550683
 */

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("introduce b");
        double b;
        
        b = input.nextDouble();
        System.out.println("introduce B");
        double bg;
        
        bg = input.nextDouble();
        System.out.println("introduce h");
        double h;
        
        h = input.nextDouble();
        int a;
        
        a = (int) ((b + bg) / 2 * h);
        System.out.print("el area es ");
        System.out.println(a);
    }
}
