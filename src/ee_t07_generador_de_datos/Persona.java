/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t07_generador_de_datos;

/**
 *
 * @author angel
 */
public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String email;

    public Persona(String nombre, int edad, String telefono, String direccion, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public Persona(){
        
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return "Nombre "+nombre+" Edad "+edad+" Telefono "+direccion+" Direccion "+telefono+" Email "+email;
    }
    
    
}
