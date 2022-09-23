/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservas;

/**
 *
 * @author Futturis-05
 */
public class Ingresso {
    private String nome;
    private String cpf;

    public Ingresso(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Ingresso() {
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void imprimirIngresso(){
        System.out.println("Nome do ingresso" + nome);
    }
}
