/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cibernetic Life
 */
public class Proceso {
    Scanner scan= new Scanner(System.in);
    Scanner scan1= new Scanner (System.in);
    String [] array = new String [10];
    private boolean op= true;
    int escoger;
    
    
    public void menu(){
        do{
        escoger = Integer.parseInt(JOptionPane.showInputDialog("¿que es lo que desea hacer? \n1.ingrese los datos \n2.ordenar los datos \n3.mostrar los datos \n0.salir"));
        
            
            
            switch(escoger){
                 case 0:
                    break;
                         
               
                 
                case 1:
                    
                    op1();
                    System.out.println();
                    break;
                    
                case 2:
                    op2();
                    System.out.println("se ordenaron los datos!!");
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println();
                    System.out.println("los datos ya ordenados son:");
                    op3();
                    System.out.println();
                    break;
               
                default:
                    System.out.println("opcion incorrecta");
            }
        }while (escoger!=0);
    }

    public void op1() {
        System.out.println();
        for (int i = 0; i <array.length; i++) {
            System.out.println("favor ingrese las letras o numero a ordenar "+(i+1+":"));
            array[i]=scan1.nextLine();
        }
    }

    public void op2() {
       String aux;
        for (int i = 0; i <array.length-1; i++) {
            for (int j = 0; j <array.length-1; j++) {
                if(array[j].compareTo(array[j+1])>0){
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
            }
        }
            
            
        }
    }

    public void op3() {
        for (int i = 0; i < array.length-1; i++) {
            System.out.println(array[i]+" ");
            
        }
    }
    
}
