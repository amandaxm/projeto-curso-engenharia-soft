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
public class ModelProdutoTest {
    private int id = 1;
    private double peso = 3.12;
    private int quantidade=14;
    private String nome ="Paçoca";
    private float valor = (float) 0.25;
    private String descricao= "paçoca";
    
    public ModelProdutoTest() {
    }
  
   

    @Test
    public void testGetId() {
        var produto = new ModelProduto();
        produto.setId(id);
        var idRetornado = produto.getId();
        assertTrue(id== idRetornado);
    }

    @Test
    public void testGetPeso() {
        var produto = new ModelProduto();
        produto.setPeso((float) peso);
        var pesoRetornado = produto.getPeso();
        assertTrue(peso== pesoRetornado);
    }

    @Test
    public void testGetQuantidade() {
        var produto = new ModelProduto();
        produto.setQuantidade(quantidade);
        var qtdRetornada = produto.getQuantidade();
        assertTrue(quantidade== qtdRetornada);
    }

    @Test
    public void testGetNome() {
         var produto = new ModelProduto();
        produto.setNome(nome);
        var nomeRetornado = produto.getNome();
        assertTrue(nome== nomeRetornado);
    }

    @Test
    public void testGetValor() {
         var produto = new ModelProduto();
        produto.setValor(valor);
        var valorRetornado = produto.getValor();
        assertTrue(valor== valorRetornado);
    }

    @Test
    public void testGetDescricao() {
        var produto = new ModelProduto();
        produto.setDescricao(descricao);
        var descricaoRetornada = produto.getDescricao();
        assertTrue(descricao== descricaoRetornada);
    }

   
}
