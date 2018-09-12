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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Thomas","Castillo", 19, 'M', "El Marañon", "Soltero", "Diseñador Grafico");
        Ingeniero ingeniero = new Ingeniero("Maria", "Lopez", 25, 'F', "San Pedro Sula", "Casada", "Informatica", "100", "Proyecto Factura");
        Ingeniero_Informatico ingenieroInfo = new  Ingeniero_Informatico("Jose", "Lopez", 30, 'M', "Santa Barbara", "Soltero", "Ingenieria en Sistemas", "Programa de Control de Ventas");
        
        persona.Mostrar("Datos de Persona".toUpperCase());
        System.out.println("---------------------------------------------");
        ingeniero.Mostrar("Datos de Ingeniero".toUpperCase());
        System.out.println("---------------------------------------------");
        ingenieroInfo.Mostrar("Datos de Ingeniero Informatico".toUpperCase());
    }
    
}
