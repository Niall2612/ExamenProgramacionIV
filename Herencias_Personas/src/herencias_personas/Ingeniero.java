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
public class Ingeniero extends Class_Father{
    private String razonar;
    private String trabajoGru;

    public Ingeniero(String nombre, String apellido, int edad, char sexo, String lugardeNac, String situacionSen, String profesion, String razonar, String trabajoGru) {
        super(nombre, apellido, edad, sexo, lugardeNac, situacionSen, profesion);
        this.razonar = razonar;
        this.trabajoGru = trabajoGru;
    }

    public String getRazonar() {
        return razonar;
    }

    public void setRazonar(String razonar) {
        this.razonar = razonar;
    }

    public String getTrabajoGru() {
        return trabajoGru;
    }

    public void setTrabajoGru(String trabajoGru) {
        this.trabajoGru = trabajoGru;
    }

    @Override
    public void Mostrar(String Datos){
        System.out.println(Datos);
        System.out.println("");
        super.Mostrar(Datos);
        System.out.println("Razonar: " + razonar);
        System.out.println("Trabajo Grupal: " + trabajoGru);
    }
    
}
