/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavajato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55649
 */
public class FilaCarros {
    
    List <Carros> carro = new ArrayList <>();
    
    void insere(Carros A){
        this.carro.add(A);
    }
    
    Carros remove(){
        return this.carro.remove(0);
    }
    
    boolean fila_vazia(){
        return this.carro.isEmpty();
    }
    
    Carros visualizar(int i){
        return this.carro.get(i);
    }
    
    boolean visualizar (List <Carros> carro){
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
