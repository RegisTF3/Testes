/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesteste.model;

import java.util.ArrayList;

/**
 *
 * @author 182210131
 */
public class Testemodel {
    private String Nome;
    private String email;
    private int Avaliacao;
    private int Genero;
    private int Sexualidade;

    public Testemodel() {
    }

    public Testemodel(String Nome, String email, int Avaliacao, int Genero, int Sexualidade) {
        this.Nome = Nome;
        this.email = email;
        this.Avaliacao = Avaliacao;
        this.Genero = Genero;
        this.Sexualidade = Sexualidade;
    }

    public Testemodel(String Nome, String email, int Avaliacao) {
        this.Nome = Nome;
        this.email = email;
        this.Avaliacao = Avaliacao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAvaliacao() {
        return Avaliacao;
    }

    public void setAvaliacao(int Avaliacao) {
        this.Avaliacao = Avaliacao;
    }

    public int getGenero() {
        return Genero;
    }

    public void setGenero(int Genero) {
        this.Genero = Genero;
    }

    public int getSexualidade() {
        return Sexualidade;
    }

    public void setSexualidade(int Sexualidade) {
        this.Sexualidade = Sexualidade;
    }
    
    public ArrayList<Testemodel> ListaFormula(){
        ArrayList<Testemodel> ListaFormular = new ArrayList<>();
        Testemodel tester = new Testemodel(Nome , email,Avaliacao);
        return ListaFormular;
    }
    
}
