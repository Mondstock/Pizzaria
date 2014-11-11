package pizzaria.model.bo;

import java.sql.SQLException;
import java.util.List;
import pizzaria.model.dao.DinamicDao;
import pizzaria.model.vo.Cliente;

/**
 *
 * @author Douglas
 */
public class ClienteBO {
    
    public List<Cliente> listar() throws Exception {
        DinamicDao dao = new DinamicDao();
        
        return dao.buscar(Cliente.class);
    }
    
    public void novoCliente(Cliente cliente) throws Exception {
        DinamicDao dao = new DinamicDao();
        if (cliente.getNome().isEmpty()) {
            throw new Exception("Informe o nome.");
        }
        if (cliente.getCpf().isEmpty()) {
            throw new Exception("Informe o CPF.");
        }
        if (cliente.getRg().isEmpty()) {
            throw new Exception("Informe o RG.");
        }
        if (cliente.getEndereco().getBairro().getCidade().getNome().isEmpty()) {
            throw new Exception("Informe a Cidade.");
        }
        if (cliente.getEndereco().getBairro().getCidade().getEstado().getNome().isEmpty()) {
            throw new Exception("Informe o Estado.");
        }
        if (cliente.getTelefoneRes().isEmpty()){
            throw new Exception("Informe Telefone Residencial.");
        }       
        
        if(cliente.getCodPessoa() == 0){
            dao.inserir(cliente);
        }else{
            dao.alterar(cliente);
        }
        
    }
    
    public Cliente buscar(int codigo) throws Exception {
        DinamicDao dao = new DinamicDao();
        Cliente c = (Cliente) dao.buscar(Cliente.class, codigo);
        
        if(c == null){
            throw new Exception("Registro não encontrado.");
        }else{
            return c;
        }
    }
    
     public void excluir(Cliente cliente, int codigo) throws SQLException{
        DinamicDao dao = new DinamicDao();
        
        dao.excluir(cliente, codigo);
    }
     
     
    
}
