/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpro;

/**
 *
 * @author Hosanna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        Gato gato = new Gato("Pelusa", "Especial",8, "Siames");
        Caballo caballo = new Caballo("Jhonny", "Pasto", 21, "Fino");
        
        perro.MostrarInfo("Datos del Perro");
        System.out.println("--------------------------------------------------");
        gato.MostrarInfo("Datos del Gato");
        System.out.println("--------------------------------------------------");
        caballo.MostrarInfo("Datos del Caballo");
    }
    
}
