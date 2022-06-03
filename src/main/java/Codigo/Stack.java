/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

// A este codigo le realizamos cambios para poder trabajar con datos de tipo String y char

public class Stack {
 
    //Hacemos una implementación basada en la lista ligada 
    
    //Ancla o encabezado del Stack
    private CNodo ancla;
    
    // Esta variable de referencia nos ayudara a trabajar con el stack
    private CNodo trabajo;
    
    public Stack()
    {
        // instanciamos el ancla
        ancla = new CNodo();
        
        // como es un stack vacio su siguiente es null
        ancla.setSiguiente(null);
    }
    
    // Push
    public void push(int dato)
    {
        // creamos un nodo temporal
        CNodo temp = new CNodo();
        temp.setDato(dato);
        
        // conectamos el tem a la lista 
        temp.setSiguiente(ancla.getSiguiente());
        
        // conectamos el ancla a temporal 
        ancla.setSiguiente(temp);
        
    }
    
    public void push(String dato)
    {
        // creamos un nodo temporal
        CNodo temp = new CNodo();
        temp.setPalabra(dato);
        
        // conectamos el tem a la lista 
        temp.setSiguiente(ancla.getSiguiente());
        
        // conectamos el ancla a temporal 
        ancla.setSiguiente(temp);
        
    }
    
    public int pop()
    {
        //Esta version no contiene codigo de seguridad 
        //colocar una excepcion cuando se intente hacer un pop a un stack vacio 
        
        int valor = 0;
        
        //llevamos a cabo el trabajo solo si hay elementos en el stack 
        if(ancla.getSiguiente() != null )
        {
            //obtenemos el dato correspondiente 
            trabajo = ancla.getSiguiente();
            valor = trabajo.getDato();
            
            //Lo sacamos del stack 
            ancla.setSiguiente(trabajo.getSiguiente());
            trabajo.setSiguiente(null);
            
        }
        else if(ancla.getSiguiente() == null)
        {
            System.out.println("La pila esta vacia ");
            valor = -1;
        }
        return valor;
    }
    public char popChar()
    {
        //Esta version no contiene codigo de seguridad 
        //colocar una excepcion cuando se intente hacer un pop a un stack vacio 
        
        char valor = '\0';
        
        //llevamos a cabo el trabajo solo si hay elementos en el stack 
        if(ancla.getSiguiente() != null )
        {
            //obtenemos el dato correspondiente 
            trabajo = ancla.getSiguiente();
            valor = trabajo.getCaracter();
            
            //Lo sacamos del stack 
            ancla.setSiguiente(trabajo.getSiguiente());
            trabajo.setSiguiente(null);
            
        }
        else if(ancla.getSiguiente() == null)
        {
            System.out.println("La pila esta vacia ");
            valor = '\0';
        }
        return valor;
    }
    
    // Peek
    // Nos da el elemento que se encuentra en lo superior de la pila 
    public int peek()
    {
        //Esta verción no contiene codigo de seguridad 
        //Colocar una excepción cuando se intente hacer un pop a un stack vacio
        
        int valor = 0;
        
        // LLevamos acabo el trabajo solo si hay elementos en el stack
        if(ancla.getSiguiente() != null)
        {
             //Obtenemos el dato correspondiente 
            trabajo = ancla.getSiguiente();
            valor = trabajo.getDato();
        }
        
        return valor;
    }
    
    //Este método no es parte de esta estructura de datos, pero se utilizara por 
    //motivos educativos y ver como se va desarrollando el algoritmo. 
    public void transversa()
    {
        //trabajo al inicio 
        trabajo = ancla;
        
        //recorre hasta encontrar el final 
        while( trabajo.getSiguiente() != null)
        {
            //avanzamos travajo
            trabajo = trabajo.getSiguiente();
            
            //objtenemos el dato y lo mostramos
            String d = trabajo.getPalabra();
            
            System.out.println("El dato objetenido es " + d);
        }
        //Bajamos la linea 
        System.out.println("");
    }
    
    public boolean vacio()
    {
        boolean vacio = true;
        if(ancla.getSiguiente() != null)
        {
            vacio = false;
        }
        return vacio;
    }
}
