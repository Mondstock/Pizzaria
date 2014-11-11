/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzaria.model.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "Funcionarios")
public class Funcionario extends Pessoa implements Serializable{
    
    public enum TipoFuncionario{
        GERENTE,
        ATENDENTE,
        ADMINISTRADOR,
        ENTREGADOR
    };
    
    private String senha;
    private float salario;
    @Enumerated(EnumType.STRING)
    private TipoFuncionario tipo;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }
    
    
    
}
