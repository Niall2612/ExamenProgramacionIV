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
public class Ingeniero_Informatico extends Class_Father{
    private String crearPrograma;

    public Ingeniero_Informatico(String nombre, String apellido, int edad, char sexo, String lugardeNac, String situacionSen, String profesion,String crearPrograma) {
        super(nombre, apellido, edad, sexo, lugardeNac, situacionSen, profesion);
        this.crearPrograma = crearPrograma;
    }

    public String getCrearPrograma() {
        return crearPrograma;
    }

    public void setCrearPrograma(String crearPrograma) {
        this.crearPrograma = crearPrograma;
    }
    
    @Override
    public void Mostrar(String Datos){
        System.out.println(Datos);
        System.out.println("");
        super.Mostrar(Datos);
        System.out.println("Crear Programa: " + crearPrograma);
    }
    
}
