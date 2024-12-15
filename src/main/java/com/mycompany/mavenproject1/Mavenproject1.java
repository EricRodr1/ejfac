/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Eric Rodriguez
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
    
     System.out.print("Favor ingresar grados en Fahrenheit");
     double Fahrenheit = sc.nextDouble();
     
     double celsius = (Fahrenheit - 32)*5/9;
     
     System.out.println("Los grados en celsius son: "+ celsius);

    }
}
