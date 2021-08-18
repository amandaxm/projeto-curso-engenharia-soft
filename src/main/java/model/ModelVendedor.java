/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author veste
 */
public class ModelVendedor {
    private String id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String numCaixa;

    public ModelVendedor(String nome, String email, String senha, String cpf, String numCaixa, String id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.numCaixa = numCaixa;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
    public String getId() {
        return this.id;
    }
    public String getNumCaixa() {
        return this.numCaixa;
    }
}
