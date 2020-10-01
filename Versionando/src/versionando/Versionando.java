/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package versionando;

/**
 *
 * @author daguaman
 */
public class Versionando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("demo");
        for (int i=0; i<=10; i++){
            System.out.println("Valores "+ i);
        }
        System.out.println("Sumatoria" + Suma(2,6));
        System.out.println("Multiplica" + Multi(2,6));
        System.out.println("Divide" + Division(2,6));
    }
    
    //Método de Suma
    public static double Suma(int intA, int intB){
        double Sumatoria = intA + intB;
        return Sumatoria;
    }
    
    public static double Multi(int intA, int intB){
        double Multi = intA * intB;
        return Multi;
    }
    
    public static double Division(int intA, int intB){
        double Divide = intA/intB;
        return Divide;
    }
    
    public static double Resta (int A, int B){
        double resta = Math.abs(A-B);
        return resta;
    }
}
