/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Cristiane
 */
public class Funcionario {
    int codigo;
    String função;
    Endereco end;
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void cadastarEndereco(Endereco end){
        this.end = end;
    }
    
     public void addNovoEndereco(Endereco endereco){
        this.end = endereco;
    }
}
