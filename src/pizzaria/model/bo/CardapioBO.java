/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria.model.bo;

import java.sql.SQLException;
import java.util.List;
import pizzaria.model.dao.DinamicDao;
import pizzaria.model.vo.Cardapio;

/**
 *
 * @author Douglas
 */
public class CardapioBO {
    
    public List<Cardapio> listar()
            throws Exception {
        DinamicDao dao = new DinamicDao();
        
        return dao.buscar(Cardapio.class);
    }

    public void novoCardapio(Cardapio cardapio) throws Exception {
        if (cardapio.getNome().isEmpty()) {
            throw new Exception("Informe o nome.");
        }
        if (cardapio.getDescricao().isEmpty()) {
            throw new Exception("Informe a Descricao.");
        }
        
        DinamicDao dao = new DinamicDao();
        dao.inserir(cardapio);
    }
    
    public Cardapio buscar(int codigo) throws Exception {
        DinamicDao dao = new DinamicDao();
        Cardapio card = (Cardapio) dao.buscar(Cardapio.class, codigo);
        
        if(card == null){
            throw new Exception("Registro não encontrado.");
        }else{
            return card;
        }
    }
    
     public void excluir(Cardapio cardapio, int codigo) throws SQLException{
        DinamicDao dao = new DinamicDao();
        
        dao.excluir(cardapio, codigo);
    }

}
