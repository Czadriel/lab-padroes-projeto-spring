package one.digitalinnovation.gof.model;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private double preco;

    public Long getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String setNome(){
        return nome;
    }
    public void setNome(String nome ){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
