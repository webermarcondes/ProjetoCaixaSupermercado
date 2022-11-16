package Entidades;

public class Cliente {

    private String Nome;
    private String Email;

    public Cliente(){

    }

    public Cliente(String nome, String email) {
        Nome = nome;
        Email = email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString(){
        return "Cliente: " + Nome + " ,Email: " + Email;
    }
}