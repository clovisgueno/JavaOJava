/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cdg;

/**
 *
 * @author clovisdaniel
 */
public class Programador extends Funcionario{
    
    private String nome;
    
    @Override
    public double getBonus() {
       salario = (salario * 0.8);
       return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
