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
public class Areglopdf_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final int TAMANIO=15;
 
        int num[]=new int[TAMANIO];
 
        
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
    
    

