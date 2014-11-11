/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzaria.model.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import pizzaria.controller.Coluna;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "Fornecedores")
public class Fornecedor extends Pessoa implements Serializable{
    
    private String cnpj;
    private String razaoSocial;
    
    

    public Fornecedor() {
    }
    
    @Coluna(nome = "Cnpj", posicao = 2)
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Coluna(nome = "Razão Social", posicao = 3)
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }  
    

    
    
    
}
