/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author aldrin
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 15;
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadena = "";
        int x=1;

        do {
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
        }while (denominador <= limite);

        System.out.println(cadena);
    }
    
}
