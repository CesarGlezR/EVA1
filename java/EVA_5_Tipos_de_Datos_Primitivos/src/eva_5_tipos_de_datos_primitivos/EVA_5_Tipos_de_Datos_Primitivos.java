/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_5_tipos_de_datos_primitivos;

/**
 *
 * Cesar Gonzalez 18550683
 */
public class EVA_5_Tipos_de_Datos_Primitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable entera que ocupa 4 bytes, donde existe la variable
        int iDato; //declaracion de la variable
        //iDato = 10.5;//define operaciones para enteros
                     //NO PODEMOS asignarle valores diferentes
        //System.out.println(iDato);//nos imprime cero
        int iVal = 10;//declarando e inicializando la variable
        String sCade = "Hola mundo";
        System.out.println(sCade.length());
        //Constantes--->MAYUSCULAS
        final double PI = 3.1416;
        //PI = 5.5; MArca error potque no se puede cambian una constante
        System.out.println(PI);
    }
    
}
