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
public class Animal {
    private String nombre;
    private String tAlimentacion;
    private int edad;
    private String raza;

    public Animal(String nombre, String tAlimentacion, int edad, String raza) {
        this.nombre = nombre;
        this.tAlimentacion = tAlimentacion;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String gettAlimentacion() {
        return tAlimentacion;
    }

    public void settAlimentacion(String tAlimentacion) {
        this.tAlimentacion = tAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void MostrarInfo(String Mostrar){
        
        System.out.println("Nombre del animal: " + nombre);
        System.out.println("Tipo de Alimentacion: " + tAlimentacion);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        
    }
    
}
