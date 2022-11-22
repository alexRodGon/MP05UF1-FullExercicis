/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mp05;

import java.util.Scanner;


    public class FullExercicis2 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        
        
    
    int opcio;
        do{
            System.out.println("OPCIONS QUE POTS TRIAR");
            System.out.println("1. Convertir € a lliures");
            System.out.println("2. Convertir lliures a €");
            System.out.println("3. Sortir");
            
            System.out.println("\n Tria una opció: ");
            
            opcio = teclat.nextInt();
            
            switch (opcio){
            
                case 1:
                
                    System.out.println("Introdueix en €");
                    int valor_euros = teclat.nextInt();
                
                    double tipus_de_canvi = 0.87d;
                    System.out.println(valor_euros + " euros (€) actualmentt equivalen a " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
                   
                    System.out.println("Prem RETURN");
                    teclat.nextLine();
                    teclat.nextLine();
                    break;
                    
                case 2:
        
                    System.out.println("Introdueix en lliures");
                    int valor_lliures = teclat.nextInt();
                
                    double tipus_de_canvi2 = 1.15d;
                    System.out.println(valor_lliures + " lliures esterlines (£) actualmentt equivalen a " + (valor_lliures * tipus_de_canvi2) + " euros (€)");
                    
                    System.out.println("Prem RETURN");
                    teclat.nextLine();
                    teclat.nextLine();
                    break;
                    
                case 3:
                    System.out.println("Adeu, fins un altra...");
                    break;
                default:
                    System.out.println("Opció INCORRECTA!");
            }
            
            
        } while(opcio !=3);
    
    
    
    
    
    
    
    
    }
}
