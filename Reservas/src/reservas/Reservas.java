/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservas;

/**
 *
 * @author Futturis-05
 */
public class Reservas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        ingresso.setNome("Nestor");
        ingresso.setCpf("123.456.789-58");
        
        /*Ingresso ingresso2 = new Ingresso("Theodor", "123.123.123-58");
        
        Ingresso ingresso3 = new Ingresso("Thay", "456.456.456-45");*/
        ingresso.imprimirIngresso();
    }
    
}
