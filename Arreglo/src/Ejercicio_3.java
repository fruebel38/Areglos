/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fruebel
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros=new int[100];
//Declaro las variables necesarias
int suma=0;
double media;
//Recorro el arreglo, asigno números y sumo
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;
suma+=numeros[i];
}
//Calculo la media y muestro la suma y la meda
System.out.println("La suma es "+suma);
media=(double)suma/numeros.length;
System.out.println("La media es "+media);
}
    }
    

