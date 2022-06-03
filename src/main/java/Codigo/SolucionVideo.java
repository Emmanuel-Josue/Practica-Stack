/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigo;

import java.util.Scanner;

public class SolucionVideo {

    public static void main(String[] args) {

        //variables
        String expresion = "";
        char eliminado = '\0';
        char caracter = '\0';
        int largo;
        
        //objetos
        Stack pila = new Stack();
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos la exprsión a evaluar
        System.out.println("DIGILA LA EXPRESIÓN ");
        expresion = entrada.nextLine();
        //obetemos el largo que medira el arreglo para poder crear uno a la perfección
        largo = expresion.toCharArray().length;
        
        char[] arregloChar = new char[largo];
        arregloChar = expresion.toCharArray();
        
        for(int i = 0; i < largo; i++)
        {
            caracter = arregloChar[i];
            //verificamos que sea simbolo de apertura
            if(caracter == '(' || caracter == '{' || caracter == '[')
            {
                //Lo colocamos en el stack
                pila.push(caracter);
            }
            if(caracter == ')' || caracter == '}' || caracter == ']')
            {
                if(pila.vacio())
                {
                    System.out.println("Exeso de simbolos de cierre");
                }
                else
                {
                    //obtenemos el caracter correspondiente y eliminamos de la pila al objeto que lo contiene
                    eliminado = pila.popChar();
                    // verificamos que tenga coincidencia 
                    if(eliminado == '(' && caracter != ')' )
                    {
                        System.out.println("Se esperaba un )");
                    }
                    if(eliminado == '[' && caracter != ']' )
                    {
                        System.out.println("Se esperaba un ]");
                    }
                    if(eliminado == '{' && caracter != '}' )
                    {
                        System.out.println("Se esperaba un }");
                    }
                }
            }// Fin de simbolos de cierre
        }// fin de for
        
        if(pila.vacio() == false)
        {
            System.out.println("Exeso de simbolos de apertura");
        }
        
        
        
        
    }
    
}
