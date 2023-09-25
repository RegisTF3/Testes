/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesteste.controler;
import atividadesteste.model.Testemodel;
import java.util.ArrayList;

/**
 *
 * @author 182210131
 */
public class TesteControler {
    private String Nome;
    private String email;
    private int Avaliacao;
    private int Genero;
    private int Sexualidade;

    public TesteControler() {
    }

    public TesteControler(String Nome, String email, int Avaliacao, int Genero, int Sexualidade) {
        this.Nome = Nome;
        this.email = email;
        this.Avaliacao = Avaliacao;
        this.Genero = Genero;
        this.Sexualidade = Sexualidade;
    }

    public TesteControler(String Nome, String email, int Avaliacao) {
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
    
    public ArrayList <Testemodel>  criarFormulario (String Nome, String email , int Avaliacao){
        ArrayList <Testemodel> ListaFormu = new ArrayList<>();
        Testemodel teste = new Testemodel(Nome,email,Avaliacao);
        ListaFormu.add(teste);
        teste.ListaFormula();
        return ListaFormu;
        
    }
    
            
}
