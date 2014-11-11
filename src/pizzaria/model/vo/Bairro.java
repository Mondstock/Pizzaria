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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "Bairros")
public class Bairro implements Serializable {
    @Id
    @GeneratedValue
    private int codBairro;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "codCidade")
    private Cidade cidade;

    public Bairro() {
        this.setCodBairro(0);
        this.setNome("");
        this.setCidade(new Cidade());
    }

    public Bairro(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getCodBairro() {
        return codBairro;
    }

    public void setCodBairro(int codBairro) {
        this.codBairro = codBairro;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    

    
    
    
}
