/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author aldrin
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 1;

        do {
            numero1 = numero1 + numero2;
            numero2 = numero2 + 2;
            System.out.println(numero1);
        } while (numero1 < 37);
    }

}
