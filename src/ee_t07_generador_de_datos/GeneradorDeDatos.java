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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class GeneradorDeDatos {

    ArrayList<Persona> per = new ArrayList<>();
    Iterator<Persona> it;
    String arreglo[];
    Persona p;
    String linea;

    public GeneradorDeDatos() {
        leerArchivo("Datos");
            
    }

    public void leerArchivo(String nombre) {
        int contador = 0;
        try {
            FileReader fr = new FileReader(nombre + ".txt");
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();
            while (linea != null) {
                arreglo = linea.split("/");
                p = new Persona(arreglo[0], Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], arreglo[4]);
                per.add(p);
                linea = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void generar(int n) {
        int contador = 0;
        while (contador < n) {
            System.out.println(" Nombre ---"+per.get((int) (Math.random() *199 + 1)).getNombre() +" --- Edad "+ per.get((int) (Math.random() *199 + 1)).getEdad()
                    +" --- Telefono "+ per.get((int) (Math.random() * 199 + 1)).getTelefono() +" --- Direccion " +per.get((int) (Math.random() * 199 + 1)).getDireccion()
                    +" --- Email "+ per.get((int) (Math.random() * 199 + 1)).getEmail());
            contador++;
        }  
    }
    public String generar2(int n){
        int contador = 0;
        String cadena="";
        while (contador < n) {
            cadena+=" Nombre ---"+per.get((int) (Math.random() *199 + 1)).getNombre() +" --- Edad "+ per.get((int) (Math.random() *199 + 1)).getEdad()
                    +" --- Telefono "+ per.get((int) (Math.random() * 199 + 1)).getTelefono() +" --- Direccion " +per.get((int) (Math.random() * 199 + 1)).getDireccion()
                    +" --- Email "+ per.get((int) (Math.random() * 199 + 1)).getEmail()+"\n";
            contador++;
        }  
        return cadena+"\n";
    }
}

