/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author guilherme
 */
public class ModelProduto {
    private int id;
    private double peso;
    private int quantidade;
    private String nome;
    private float valor;
    private String descricao;
    
    public int getId(){
        return this.id;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
