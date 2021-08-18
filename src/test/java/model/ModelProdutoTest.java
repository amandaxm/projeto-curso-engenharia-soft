/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author java
 */
public class ModelProdutoTest {
    private int id = 1;
    private float peso = (float)3.12;
    private int quantidade=14;
    private String nome ="Paçoca";
    private float valor = (float) 0.25;
    private String descricao= "paçoca";
    
    public ModelProdutoTest() {
    }
    
    public ModelProduto obterProduto(){
        return new  ModelProduto(peso,quantidade,nome,valor,descricao);
    }
   
    @Test
    public void testGetId() {
        var produto = obterProduto();
        produto.setId(id);
        var idRetornado = produto.getId();
        assertTrue(id== idRetornado);
    }

    @Test
    public void testGetPeso() {
        var produto = obterProduto();
        produto.setPeso(peso);
        var pesoRetornado = produto.getPeso();
        assertTrue(peso== pesoRetornado);
    }

    @Test
    public void testGetQuantidade() {
        var produto = obterProduto();
        produto.setQuantidade(quantidade);
        var qtdRetornada = produto.getQuantidade();
        assertTrue(quantidade== qtdRetornada);
    }

    @Test
    public void testGetNome() {
         var produto = obterProduto();
        produto.setNome(nome);
        var nomeRetornado = produto.getNome();
        assertTrue(nome== nomeRetornado);
    }

    @Test
    public void testGetValor() {
         var produto = obterProduto();
        produto.setValor(valor);
        var valorRetornado = produto.getValor();
        assertTrue(valor== valorRetornado);
    }

    @Test
    public void testGetDescricao() {
        var produto = obterProduto();
        produto.setDescricao(descricao);
        var descricaoRetornada = produto.getDescricao();
        assertTrue(descricao== descricaoRetornada);
    }
}
