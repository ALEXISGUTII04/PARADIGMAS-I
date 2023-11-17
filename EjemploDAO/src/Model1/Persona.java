/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model1;

import java.io.Serializable;

/**
 *
 * @author Usuario 1
 */
public class Persona implements Serializable{

    private int id;
    private String nombre;
    private int edad;
    private String sexo;
     
   public Persona(){
        
    }
   
   
    public Persona(int id, String nombre,String sexo, int edad) {
        this.id = id;
        this.nombre = nombre; 
        this.sexo = sexo;
        this.edad = edad;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona: " + "ID: " + id + ", Nombre: " + nombre + ", Sexo: " + sexo + ", Edad: " + edad;
    }
    
    

}
