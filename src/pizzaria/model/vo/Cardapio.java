/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria.model.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "Cardapios")
public class Cardapio implements Serializable {

    @Id
    @GeneratedValue
    private int codCardapio;
    private String nome;
    private String descricao;

    public Cardapio() {
    }

    public int getCodCardapio() {
        return codCardapio;
    }

    public void setCodCardapio(int codCardapio) {
        this.codCardapio = codCardapio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    
    

}
