/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

// Esta clase se modigica para trabajar con String y char
public class CNodo {
    
    //Datos que guardara el nodo
    private int dato;
    private String palabra;
    private char caracter;
    
    //Esta variable de referencia es utilizada para apuntar al nodo siguiente.
    private CNodo siguiente = null;
    
    //En el video se utilizan propiedades, en java utilizaremos métodos set y get
    public int getDato()
    {
        return dato;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public void setDato(int dato)
    {
        this.dato = dato;
    }
    public CNodo getSiguiente()
    {
        return siguiente;
    }
    public void setSiguiente(CNodo siguiente)
    {
        this.siguiente = siguiente;
    }
    
    //para su facil impreción
    @Override
    public String toString()
    {
        String regresar = String.valueOf(dato);
        return regresar;
    }
    
}
