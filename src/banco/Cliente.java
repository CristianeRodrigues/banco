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
public class Cliente {
    
    String nome;
    int ag;
    Conta cc;
    float salario;
    String contaCliente;
    
     public String getNome() {
        return this.nome;
    }
     
     public void setAg() {
         this.ag = cc.getAgencia();
        System.out.println("Agencia");
    }
    public void setSalario(){
        this.contaCliente = cc.getConta();
    }
}
