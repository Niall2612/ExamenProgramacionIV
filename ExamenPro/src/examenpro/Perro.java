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
public class Perro extends Animal {

    public Perro(String nombre, String tAlimentacion, int edad, String raza) {
        super(nombre, tAlimentacion, edad, raza);
    }

    @Override
    public void MostrarInfo(String Mostrar){
        super.MostrarInfo(Mostrar);
        
    }
    
    
}
