/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias_personas;

/**
 *
 * @author Hosanna
 */
public class Persona extends Class_Father{

    public Persona(String nombre, String apellido, int edad, char sexo, String lugardeNac, String situacionSen, String profesion) {
        super(nombre, apellido, edad, sexo, lugardeNac, situacionSen, profesion);
    }

    @Override
    public void Mostrar(String Datos){
        System.out.println(Datos);
        System.out.println("");
       super.Mostrar(Datos);
    }
}
