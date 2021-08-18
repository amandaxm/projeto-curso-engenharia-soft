/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ModelVendedorTest {
    private String id = "1";
    private String nome = "Joao";
    private String email = "joao@gmail.com";
    private String senha = "senha";
    private String cpf = "1450114343";
    private String numCaixa = "1313";    
   
    @Test
    public void testGetEmail() {
       var vendedor = new ModelVendedor(nome, email,senha ,cpf , numCaixa, id);
       var emailRetornado = vendedor.getEmail();
       assertTrue(emailRetornado==email);
    }
     @Test
    public void testGetNome() {
       var vendedor = new ModelVendedor(nome, email,senha ,cpf , numCaixa, id);
       var nomeRetornado = vendedor.getNome();
       assertTrue(nomeRetornado==nome);
    }


   
    @Test
    public void testGetCPF() {
       var vendedor = new ModelVendedor(nome, email,senha ,cpf , numCaixa, id);
       var cpfRetornado = vendedor.getCPF();
       assertTrue(cpf==cpfRetornado);
       
    }

  
    @Test
    public void testGetId() {
       var vendedor = new ModelVendedor(nome, email,senha ,cpf , numCaixa, id);
       var idRetornado = vendedor.getId();
       assertTrue(id==idRetornado);
    }
    
     @Test
    public void testGetSenha() {
       var vendedor = new ModelVendedor(nome, email,senha ,cpf , numCaixa, id);
       var senhaRetornada = vendedor.getSenha();
       assertTrue(senha==senhaRetornada);
    }
    
     @Test
    public void testGetNumCaixa() {
       var vendedor = new ModelVendedor(nome, email,senha ,cpf , numCaixa, id);
       var numCaixaRetornado = vendedor.getNumCaixa();
       assertTrue(numCaixa==numCaixaRetornado);
    }
    
}
