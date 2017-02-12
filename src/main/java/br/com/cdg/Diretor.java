/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cdg;

import br.com.cdg.Departamento;

/**
 *
 * @author clovisdaniel
 */
public class Diretor extends Funcionario {

    Departamento[] setor;
    
    int contadorDepartamento;
    @Override
    public double getBonus() {

        for (int i = 0; i < setor.length; i++) {
            if (setor[i] != null) {
                contadorDepartamento++;
            }
        }
        salario = (salario * 4) + (contadorDepartamento * 3000);
        return salario;
    }

    public Departamento[] getSetor() {
        return setor;
    }

    public void setSetor(Departamento[] setor) {
        this.setor = setor;
    }
    
    
}
