package br.com.cdg;

import br.com.cdg.Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clovisdaniel
 */
public class AuxiliarDeLimpeza extends Funcionario{
    
    public String nome;
    
    @Override
    public double getBonus() {
       salario = (salario * 0.5);
       return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
   
}
