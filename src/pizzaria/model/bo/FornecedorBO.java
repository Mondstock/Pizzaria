/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzaria.model.bo;
import java.sql.SQLException;
import java.util.List;
import pizzaria.model.dao.DinamicDao;
import pizzaria.model.vo.Fornecedor;

/**
 *
 * @author Douglas
 */
public class FornecedorBO{
    
    public List<Fornecedor> listar()
            throws Exception {
        DinamicDao dao = new DinamicDao();
        
        return dao.buscar(Fornecedor.class);
    }
    
    public void novoFornecedor(Fornecedor fornecedor) throws Exception {
        if (fornecedor.getNome().isEmpty()) {
            throw new Exception("Informe o Nome Fantasia.");
        }
        if (fornecedor.getRazaoSocial().isEmpty()) {
            throw new Exception("Informe a Razao Social.");
        }
        if (fornecedor.getCnpj().isEmpty()) {
            throw new Exception("Informe o CNPJ.");
        }
        if (fornecedor.getEndereco().getRua().isEmpty()) {
            throw new Exception("Informe a Rua.");
        }
        if (fornecedor.getEndereco().getNumero().isEmpty()) {
            throw new Exception("Informe o Numero.");
        }
        if (fornecedor.getEndereco().getComplemento().isEmpty()) {
            throw new Exception("Informe o Complemento.");
        }
        if (fornecedor.getEndereco().getBairro().getNome().isEmpty()) {
            throw new Exception("Informe o Bairro.");
        }
        if (fornecedor.getEndereco().getBairro().getCidade().getNome().isEmpty()) {
            throw new Exception("Informe a Cidade.");
        }
        if (fornecedor.getEndereco().getBairro().getCidade().getEstado().getNome().isEmpty()) {
            throw new Exception("Informe o Estado.");
        }
        if (fornecedor.getTelefoneRes().isEmpty()){
            throw new Exception("Informe Telefone do Responsavel.");
        }
        if (fornecedor.getTelefoneCom().isEmpty()) {
            throw new Exception("Informe Telefone Comercial.");
        }
        if (fornecedor.getTelefoneCel().isEmpty()) {
            throw new Exception("Informe Telefone para Contato.");
        }
        
        DinamicDao dao = new DinamicDao();
        dao.inserir(fornecedor);
        
    }
    public Fornecedor buscar(int codigo) throws Exception {
        DinamicDao dao = new DinamicDao();
        Fornecedor f = (Fornecedor) dao.buscar(Fornecedor.class, codigo);
        
        if(f == null){
            throw new Exception("Registro não encontrado.");
        }else{
            return f;
        }
    }
    
     public void excluir(Fornecedor fornecedor, int codigo) throws SQLException{
        DinamicDao dao = new DinamicDao();
        
        dao.excluir(fornecedor, codigo);
    }
    
}
