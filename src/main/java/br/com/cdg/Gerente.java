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
public class Gerente extends Funcionario {

    private String nome;
    
    private Funcionario[] funcionarios;

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getBonus() {

        int contadorFuncionario = 0;
        
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                contadorFuncionario++;
            }
        }
        salario = (salario * 2) + (contadorFuncionario * 100);
        return salario;
    }

}
