/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_clases_objetos;

/**
 *
 * @author ruben
 */
public class EVA1_1_CLASES_OBJETOS {
    
    public static void main(String[] args) {
        //INSTANCIAR --> ASIGNAR MEMORIA AL CÓDIGO DE UNA CLASE
        //PARA CREAR UN OBJETO
        //Crear un identificador (variable)
        Persona perso1; //Declaramos pero no creamos.
        //Asignar memoria --> new
        //REFERENCIA: Dirección en memoria.
        perso1 = new Persona();
        perso1.edad = 50;
        perso1.genero = "H";
        perso1.nombre = "Juan Perez";
        //perso1.imprimirDatos();
        System.out.println(perso1);
    }    
}

class Persona{//TIPO DE DATO ABSTRACTOS
    //DATOS - ESTADO - ATRIBUTOS
    String nombre;
    int edad;
    String genero;
    //COMPORTAMIENTO - METODOS
    void imprimirDatos(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
        System.out.println("Género = " + genero);
    }
}


