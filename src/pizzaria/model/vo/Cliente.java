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
@Table(name = "Clientes")
public class Cliente extends Pessoa implements Serializable{

    private String rg;
    private String cpf;
    
    @Coluna(nome = "Rg", posicao = 2)
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    @Coluna(nome = "Cpf", posicao = 3)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
