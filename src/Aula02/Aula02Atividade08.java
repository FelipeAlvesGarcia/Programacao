/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Scanner;

public class Aula02Atividade08 {
    public static void main(String[] args){
        float tempf, tempc;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma temperatura em Fahrenheit: ");
        tempf = ler.nextFloat();
        
        tempc = (5*(tempf-32)/9);
        System.out.println("\nTemperatura em Celsus = "+tempc+"°C");
    }
}
