
import br.com.cdg.Analista;
import br.com.cdg.AuxiliarDeLimpeza;
import br.com.cdg.Departamento;
import br.com.cdg.Diretor;
import br.com.cdg.Funcionario;
import br.com.cdg.Gerente;
import br.com.cdg.Programador;
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clovisdaniel
 */
public class FuncionarioTest {
 
    
    @Test
    public void testGetBonus(){
        
        testGetBonusGerente();
        
        testGetBonusDiretor();
        
        testGetBonusAnalista();
        
        testGetBonusProgramador();
        
        testGetBonusAuxiliarDeLimpeza();
    }

    private void testGetBonusDiretor() {
        Departamento departamentos[] = new Departamento[10];
        departamentos[0] = new Departamento();
        departamentos[1] = new Departamento();
        
        departamentos[0].setNome("Setor Contabilidade");
        departamentos[0].setSigla("S-CONT");
        departamentos[0].setTelefone("4654-46545");

        Diretor d = new Diretor();
        d.setSetor(departamentos);
        
        Assert.assertEquals(d.getBonus(), (double)10000);
    }

    private void testGetBonusGerente() {
        Gerente gerente1 = new Gerente();
        
        Funcionario[] funcionariosGerente = new Funcionario[10];
        funcionariosGerente[0] = new Analista();
        funcionariosGerente[1] = new AuxiliarDeLimpeza();
        funcionariosGerente[2] = new Programador();
        
        gerente1.setFuncionarios(funcionariosGerente);
        gerente1.setNome("Clovis");
        
        Assert.assertEquals(gerente1.getBonus(), (double)2300);
    }

    private void testGetBonusAnalista() {
        Analista analista1 = new Analista();
        Assert.assertEquals(analista1.getBonus(), (double)1000);
    }

    private void testGetBonusProgramador() {
        Programador programador1 = new Programador();
        Assert.assertEquals(programador1.getBonus(), (double)800);
    }

    /**
     * Comentario adicionado somente para testes
     */
    private void testGetBonusAuxiliarDeLimpeza() {
        AuxiliarDeLimpeza auxLimpeza1 = new AuxiliarDeLimpeza();
        Assert.assertEquals(auxLimpeza1.getBonus(), (double)500);
    }
    
    
}
