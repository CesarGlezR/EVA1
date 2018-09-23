 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_tipos_de_datos;

import java.util.Scanner;

/**
 *
 * Cesarglezr
 */
public class Eva1_5_tipos_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce tu nombre");
        String sNombre;//Declarando
        Scanner sInput;//Declarando
        //SE CREAN CON LA PALABRA new
        sInput = new Scanner(System.in);
        //Scanner sInput2 = new Scanner(System.in);
        //int iVal = 10
        sNombre = sInput.nextLine();//cuando da "enter"
        System.out.println("Tu nombre es" + sNombre);
    }
    
}
