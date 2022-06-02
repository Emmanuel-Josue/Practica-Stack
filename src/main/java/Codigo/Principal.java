/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigo;

import java.util.Scanner;

/**
 *
 * @author user01
 */
public class Principal {

    public static void main(String[] args) {

        Scanner objeto = new Scanner(System.in);
        Stack pila = new Stack();
        String caracteres = objeto.nextLine();
        int largo = caracteres.toCharArray().length;// Se obtiene el largo para crear el arreglo perfecto para este 
        char[] arregloCadena = new char[largo];
        arregloCadena = caracteres.toCharArray();// se asigna una referencia al arreglo
        
        for(int i = 0; i < arregloCadena.length; i++)
        {
            String caracter;
            caracter = String.valueOf(arregloCadena[i]);
            if(caracter.equals("(") || caracter.equals("[") || caracter.equals("{"))
            {
                pila.push(caracter);
            }
            else if(caracter.equals(")") || caracter.equals("]") || caracter.equals("}"))
            {
                if(pila.vacio() == false)
                {
                    pila.pop();
                }
                else
                {
                    System.out.println("La pila esta vacia y se digitaron más caracteres de cierre");
                }
                if(i == arregloCadena.length-1 & pila.vacio() == true)
                {
                    System.out.println("La cadena esta balanceada");
                    i = arregloCadena.length + 2;
                }
            }
            else
            {
                i = arregloCadena.length;
                System.out.println("SE ENCONTRO UN CARANTER QUE NO ES UN CORCHETE");
            }
                            
        }
        // Se verifica si la pila esta vacia 
        if(pila.vacio() == false)
        {
            System.out.println("Se digitaron más caracteres de apertura");
        }

        pila.transversa();
    }
    
}
