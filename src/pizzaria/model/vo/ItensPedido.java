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

/**
 *
 * @author Douglas
 */
@Entity
public class ItensPedido implements Serializable {
    
    @Id
    @GeneratedValue
    private int codItenspedido;
    private int qtde;
    private float valorTotal;
    private String status;

    public ItensPedido() {
    }

    public int getCodItenspedido() {
        return codItenspedido;
    }

    public void setCodItenspedido(int codItenspedido) {
        this.codItenspedido = codItenspedido;
    }
    

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
