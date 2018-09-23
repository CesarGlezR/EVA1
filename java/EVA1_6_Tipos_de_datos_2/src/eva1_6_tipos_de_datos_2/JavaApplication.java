/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_tipos_de_datos_2;

import java.util.Scanner;

/**
 *
 * Cesar gonzalez 18550683
 */

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("introduce tu nombre");
        String sNombre;
        
        sNombre = input.nextLine();
        System.out.print("tu nombre es ");
        System.out.println(sNombre);
    }
}
