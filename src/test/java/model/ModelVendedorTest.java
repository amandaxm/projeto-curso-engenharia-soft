/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


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
    public void testGetNumCaixa() {
       var vendedor = new ModelVendedor(nome, email,senha ,cpf , numCaixa, id);
       var numCaixaRetornado = vendedor.getNumCaixa();
       assertTrue(numCaixa==numCaixaRetornado);
    }
    
     @Test
    public void testSetNumCaixa() {
       var vendedor = new ModelVendedor(nome, email,senha ,cpf , numCaixa, id);
       vendedor.setNumCaixa(numCaixa);
       var numCaixaRetornado = vendedor.getNumCaixa();
       assertTrue(numCaixa==numCaixaRetornado);
    }
    
    
}
