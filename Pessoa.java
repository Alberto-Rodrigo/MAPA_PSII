package moder.entities;
public abstract class Pessoa {
    private String CPF;
    private String nome;


    public Pessoa(){}
    public Pessoa(String CPF, String nome){
        this.CPF = CPF;
        this.nome = nome;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getnome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
