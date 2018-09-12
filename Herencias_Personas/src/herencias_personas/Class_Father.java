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
public class Class_Father {
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String lugardeNac;
    private String situacionSen;
    private String profesion;

    public Class_Father(String nombre, String apellido, int edad, char sexo, String lugardeNac, String situacionSen, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.lugardeNac = lugardeNac;
        this.situacionSen = situacionSen;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getLugardeNac() {
        return lugardeNac;
    }

    public void setLugardeNac(String lugardeNac) {
        this.lugardeNac = lugardeNac;
    }

    public String getSituacionSen() {
        return situacionSen;
    }

    public void setSituacionSen(String situacionSen) {
        this.situacionSen = situacionSen;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public void Mostrar(String Datos){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Lugar de Nacimiento: " + lugardeNac);
        System.out.println("Situacion Sentimental: " + situacionSen);
        System.out.println("Profesion: " + profesion);
    }
    
}
