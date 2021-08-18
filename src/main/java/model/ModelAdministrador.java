/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author catarina
 */
public class ModelAdministrador extends ModelUsuario {
    private int tipo;

    public ModelAdministrador(String nome, String email, String senha, String cpf, int tipo, String id) {
        super(id, nome, email, senha, cpf);
        this.tipo = tipo;
    }
    
    public int getTipo() {
        return this.tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
