/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_8_formula_distancia;

import java.util.Scanner;

/**
 *
 *cesar gonzalez 18550683
 */


public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("velocidad inicial");
        double rVI;
        
        rVI = input.nextDouble();
        System.out.println("velocidad final");
        double rVF;
        
        rVF = input.nextDouble();
        System.out.println("tiempo");
        double rT;
        
        rT = input.nextDouble();
        double rD;
        
        rD = (rVI + rVF) / 2 * rT;
        System.out.print("La distancia es ");
        System.out.println(rD);
    }
}
