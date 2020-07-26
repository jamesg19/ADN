/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package James;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class Decodif {
    String SecuenciaADN1;
    String SecuenciaADN2;
    Scanner entrada=new Scanner(System.in);
    
    public void PedirSecuencia1(){
        System.out.println("Ingrese la secuencia 1 de ADN:");
        SecuenciaADN1=entrada.nextLine();
        PedirSecuencia2();
    }
    
    
    public void PedirSecuencia2(){
        System.out.println("Ingrese la secuencia 2 de ADN:");
        SecuenciaADN2=entrada.nextLine();
    }
    
    
}
