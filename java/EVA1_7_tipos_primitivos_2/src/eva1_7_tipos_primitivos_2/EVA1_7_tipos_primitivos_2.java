/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_tipos_primitivos_2;

import java.util.Scanner;

/**
 *
 * CesarGonzalez 18550683
 */
public class EVA1_7_tipos_primitivos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nomre");
        String sNombre;
        sNombre = input.nextLine();
        System.out.println("Cual es tu edad");
        int iEdad;
        iEdad = input.nextInt();
        System.out.print("Tu nombre es ");
        System.out.println(sNombre);
        System.out.print("Tu edad es ");
        System.out.println(2018 - iEdad);
    }   
}
