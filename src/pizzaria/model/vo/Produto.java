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
import pizzaria.controller.Coluna;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "Produtos")
public class Produto implements Serializable{

    @Id
    @GeneratedValue
    private int codProduto;
    private String descricao;
    private String nome;
    private String unidade;

    public Produto() {
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    @Coluna(nome = "Código", posicao = 0)
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    
    @Coluna(nome = "Descrição", posicao = 2)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Coluna(nome = "Nome", posicao = 1)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

}
