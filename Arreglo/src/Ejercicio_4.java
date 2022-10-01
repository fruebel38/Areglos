/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Fruebel
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

//Pedimos una longitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt();//introducido por usuario

//creo un array con esa longitud
int numeros[]=new int[longitud];//creamos la variable int para numeros enteros

//recorro el arreglo y uso la funcion para crear un aleatorio
for(int i=0;i<numeros.length;i++){//creamos la variable if
numeros[i]=generaNumeroAleatorio(0,10);
System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]);
}

}

//Crea un numero aleatorio, entre un minimo y un maximo
public static int generaNumeroAleatorio(int minimo, int maximo){

return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

}
    }
    

