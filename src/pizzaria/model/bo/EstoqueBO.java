/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzaria.model.bo;

import java.sql.SQLException;
import java.util.List;
import pizzaria.model.dao.DinamicDao;
import pizzaria.model.vo.Estoque;

/**
 *
 * @author Douglas
 */
public class EstoqueBO {
    
    public List<Estoque> listar()
            throws Exception {
        DinamicDao dao = new DinamicDao();
        
        return dao.buscar(Estoque.class);
    }
    
    
    public void novoItem(Estoque estoque) throws Exception {
        if (estoque.getProduto().getNome().isEmpty()){
            throw new Exception("Informe o nome.");
        }
        if (estoque.getProduto().getDescricao().isEmpty()){
            throw new Exception("Informe a Descrição.");
        }
        if (estoque.getProduto().getUnidade().isEmpty()){
            throw new Exception("Informe a Unidade.");
        }
        if (estoque.getQuantidade() <= 0){
            throw new Exception("Informe a Quantidade em estoque.");
        }
        
        DinamicDao dao = new DinamicDao();
        dao.inserir(estoque);
    }
    
    public Estoque buscar(int codigo) throws Exception {
        DinamicDao dao = new DinamicDao();
        Estoque card = (Estoque) dao.buscar(Estoque.class, codigo);
        
        if(card == null){
            throw new Exception("Registro não encontrado.");
        }else{
            return card;
        }
    }
    
     public void excluir(Estoque estoque, int codigo) throws SQLException{
        DinamicDao dao = new DinamicDao();
        
        dao.excluir(estoque, codigo);
    }
    
}
