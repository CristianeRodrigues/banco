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
public class Conta {

    int agencia;
    String conta;

    public int getAgencia() {
        System.out.println("agencia");
        return this.agencia;
    }

    public String getConta() {
        return this.conta;
    }
}
