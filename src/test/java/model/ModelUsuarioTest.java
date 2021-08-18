/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author java
 */
public class ModelUsuarioTest {
    
     private String id = "1";
    private String nome = "Joao";
    private String email = "joao@gmail.com";
    private String senha = "senha";
    private String cpf = "1450114343";
    private String numCaixa = "1313";    
   
       @Test
    public void testGetEmail() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       var emailRetornado = usuario.getEmail();
       assertTrue(emailRetornado==email);
    }
     @Test
    public void testSetEmail() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       usuario.setEmail(email);
       var emailRetornado = usuario.getEmail();
       assertTrue(emailRetornado==email);
    }
     @Test
    public void testGetNome() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       var nomeRetornado = usuario.getNome();
       assertTrue(nomeRetornado==nome);
    }
     @Test
    public void testSetNome() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       usuario.setNome(nome);
       var nomeRetornado = usuario.getNome();
       assertTrue(nomeRetornado==nome);
    }

    @Test
    public void testGetCPF() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       var cpfRetornado = usuario.getCPF();
       assertTrue(cpf==cpfRetornado);
    }
     @Test
    public void testSetCPF() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       usuario.setCPF(cpf);
       var cpfRetornado = usuario.getCPF();
       assertTrue(cpf==cpfRetornado);
    }

    @Test
    public void testGetId() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       var idRetornado = usuario.getId();
       assertTrue(id==idRetornado);
    }
     @Test
    public void testSetId() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       usuario.setId(id);
       var idRetornado = usuario.getId();
       assertTrue(id==idRetornado);
    }
    
     @Test
    public void testGetSenha() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       var senhaRetornada = usuario.getSenha();
       assertTrue(senha == senhaRetornada);
    }
     @Test
    public void testSetSenha() {
       var usuario = new ModelUsuario(id, nome, email, senha, cpf);
       usuario.setSenha(senha);
       var senhaRetornada = usuario.getSenha();
       assertTrue(senha == senhaRetornada);
    }
    
}
