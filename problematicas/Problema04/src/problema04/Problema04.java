/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author LAB.ELECT
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int limite = 15;
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadena = "";
        int x=1;

        while (denominador <= limite) {
            if(x%2==0){
                signo="-";
            }else{
                signo="+";
            }
            if (denominador == 1) {
                cadena = String.format("%s %d", cadena, numerador);
            } else {
                cadena = String.format("%s %s %d/%d", cadena, signo,
                         numerador,
                        denominador);
            }
            denominador = denominador + 2;
            x=x+1;
        }

        System.out.println(cadena);
    }

}
