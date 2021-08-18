/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.ModelProduto;
import model.ModelVendedor;

/**
 *
 * @author catarina
 */
public class ControllerAdministrador {
    
    public ArrayList<ModelProduto> listarProdutos(){
        // buscar lista de produtos
        return null;
    }
    
    public ArrayList<ModelVendedor> listarVendedores(){
        // buscar lista de vendedores
        return null;
    }
        
    public Boolean excluirProduto(ModelProduto produto) {
        return false;
    }
        
    public Boolean cadastrarProduto(ModelProduto produto) {
        return false;
    }
    
    public Boolean excluirVendedor(ModelVendedor vendedor) {
        return false;
    }
        
    public Boolean cadastrarVendedor(ModelVendedor vendedor) {
        return false;
    }
}
