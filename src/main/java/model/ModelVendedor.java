/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author matheus
 */
public class ModelVendedor extends ModelUsuario {
    private String numCaixa;

    public ModelVendedor(String nome, String email, String senha, String cpf, String numCaixa, String id) {
        super(id, nome, email, senha, cpf);
        this.numCaixa = numCaixa;
    }
    
    public String getNumCaixa() {
        return this.numCaixa;
    }
    
    public void setNumCaixa(String numCaixa) {
        this.numCaixa = numCaixa;
    }
    public String getNumCaixa() {
        return this.numCaixa;
    }
}
