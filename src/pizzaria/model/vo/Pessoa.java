package pizzaria.model.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import pizzaria.controller.Coluna;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "Pessoas")
public abstract class Pessoa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codPessoa;
    private String nome;
    private String telefoneRes;
    private String telefoneCom;
    private String telefoneCel;
    @ManyToOne
    @JoinColumn(name = "codEndereco")
    private Endereco endereco;

    
    
    

    public Pessoa() {
        endereco = new Endereco();
        this.setTelefoneRes("");
        this.setTelefoneCom("");
        this.setTelefoneCel("");
    }

    public String getTelefoneRes() {
        return telefoneRes;
    }
    @Coluna(nome = "Telefone Residencial", posicao = 5)
    public void setTelefoneRes(String telefoneRes) {
        this.telefoneRes = telefoneRes;
    }

    public String getTelefoneCom() {
        return telefoneCom;
    }

    public void setTelefoneCom(String telefoneCom) {
        this.telefoneCom = telefoneCom;
    }

    public String getTelefoneCel() {
        return telefoneCel;
    }

    public void setTelefoneCel(String telefoneCel) {
        this.telefoneCel = telefoneCel;
    }
    
    @Coluna(nome = "Código", posicao = 0)
    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }
    
    @Coluna(nome = "Endereço", posicao = 4)
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco enderecos) {
        this.endereco = enderecos;
    }
    
    @Coluna(nome = "Nome", posicao = 1)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
