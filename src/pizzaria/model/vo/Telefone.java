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
 * @author Douglas
 */
@Entity
@Table(name="Telefones")
public class Telefone implements Serializable{
    @Id
    @GeneratedValue
    private int codTelefone;
    private String telefone;

    public Telefone() {
        this.setCodTelefone(0);
        this.setTelefone(telefone);
    }

    public int getCodTelefone() {
        return codTelefone;
    }

    public void setCodTelefone(int codTelefone) {
        this.codTelefone = codTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    
    
}
