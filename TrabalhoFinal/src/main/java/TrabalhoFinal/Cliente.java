/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;


/**
 *
 * @author Rafael
 */
public class Cliente{

    String nome;
    String sobreNome;
    String rg;
    String cpf;
    String endereco;

    public Cliente() {
    }

    
    public Cliente(String nome, String sobreNome, String rg, String cpf, String endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    //verificar esse aqui - ni
    Cliente(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    
    

   /* void incluir(){       
    }

    void atualizar(){
    }

    void excluir(){
    }

    void listar(){
    }*/
}
        