package Areglopdf;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Fruebel
 */
public class Areglopdf_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tamaño
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(texto)];
 
        //InvocamoS
        rellenarNumAleatorioArray(num, 1, 5);
 
        mostrarArray(num);
    }
 
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
    
    

