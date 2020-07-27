/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package James;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author james
 */
public class Decodif {
    String SecuenciaADN1;
    String SecuenciaADN2;
    int LongitudADN1;
    int LongitudADN2;
    int ContCadena=-1;
    String Resultado;
    String[] pal=new String[15];
    String SubCadenaADN1;
    String SubCadenaADN2;
    Boolean ADN1;
    Boolean ADN2;
    Scanner entrada=new Scanner(System.in);
    
    public void PedirSecuencia1(){
        System.out.println("Ingrese la secuencia 1 de ADN:");
        SecuenciaADN1=entrada.nextLine();
        PedirSecuencia2();
    }
    
    
    public void PedirSecuencia2(){
        System.out.println("Ingrese la secuencia 2 de ADN:");
        SecuenciaADN2=entrada.nextLine();
        DeterminarLongitudADN();
    }
    
    
    public void DeterminarLongitudADN (){
        LongitudADN1=SecuenciaADN1.length();
        LongitudADN2=SecuenciaADN2.length();
        
            if(LongitudADN1==LongitudADN2){
                DeterminarCadena();
            }
            else{
                System.out.println("La cadena de ADN1 contiene: "+LongitudADN1+" digitos"+"\n"
                +"La cadena de ADN2 contiene: "+LongitudADN2+" digitos"+"\n"
                +"DEBEN DE TENER EL MISMO NUMERO DE DIGITOS");
                PedirSecuencia1();
                System.out.println("|||||||||||||||||");
            }
        
                
    }
    
    public void DeterminarCadena(){
        
        for(int i=0; i<LongitudADN1+1;i++){
            
           for (int j = 0; j >=LongitudADN1; j++){
             
    
            if(SecuenciaADN2.contains(SecuenciaADN1.substring(j, i))&&
                    
                    (SubCadenaADN1.length() < SecuenciaADN1.substring(j, i).length())){
                ContCadena++;
                //pal[ContCadena] = SecuenciaADN1.substring(j, i);
                        
            //System.out.println( SecuenciaADN1.substring(i, j) );
            } else{
                System.out.println("No se encuentran Secuencias");
            } 
           }  
        }
        System.out.println(Arrays.toString(pal));
    }
    
}