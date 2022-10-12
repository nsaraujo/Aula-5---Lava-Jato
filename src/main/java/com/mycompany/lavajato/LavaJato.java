/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lavajato;
import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class LavaJato {

    public static void main(String[] args) {
        
        FilaCarros carros1 = new FilaCarros();
        FilaCarros carros2 = new FilaCarros();
        
        int lavador = 0;
        
        Carros A = new Carros();
        
        Carros carro = new Carros();
        
        for (int i = 1; i<16; i++){
            
            Carros entrada = new Carros();
            
            entrada.Modelo = JOptionPane.showInputDialog("Digite o modelo do veículo:  ");
            entrada.Cor = JOptionPane.showInputDialog("Digite a cor do veículo:  ");
            entrada.Ordem_chegada = Integer.parseInt(JOptionPane.showInputDialog("Digite a ordem de chegada do veículo:  "));
            
            
            System.out.println("Sequência da fila para lavar:  \n");
            carros1.insere(entrada);
            
            System.out.println("--------------------------");
            System.out.println("MODELO:  "+entrada.Modelo);
            System.out.println("COR DO VEÍCULO:  "+entrada.Cor);
            System.out.println("ORDEM DE CHEGADA DO VEÍCULO:  "+entrada.Ordem_chegada);
            
            if ( i % 3 == 0){
                if(carros1.fila_vazia()){
                    System.out.println("A fila está vazia!");
                    
                    
                }else{
                    System.out.println("Veículo lavado - Indo para a fila dos lavados: \n "  );
                    carro = carros1.remove();
                    
                    A = (Carros) carro;
                    
                    carros2.insere(A);
                    
                    System.out.println("--------------------------");
                    System.out.println("MODELO:  "+entrada.Modelo);
                    System.out.println("COR DO VEÍCULO:  "+entrada.Cor);
                    System.out.println("ORDEM DE CHEGADA DO VEÍCULO:  "+entrada.Ordem_chegada);
                    
                    lavador ++;
                }
            }
        }
       
        System.out.println("Carros já lavados:  ");
        for (int j = 0; j < lavador; j++){
            
            
            carro = carros2.visualizar(j);
            A = (Carros) carro;
            System.out.println("--------------------------");
            System.out.println("MODELO:  "+A.Modelo);
            System.out.println("COR DO VEÍCULO:  "+A.Cor);
            System.out.println("ORDEM DE CHEGADA DO VEÍCULO:  "+A.Ordem_chegada);
            
            
        }
        
        
        
        
        
        
    }
}
                
            

        
      