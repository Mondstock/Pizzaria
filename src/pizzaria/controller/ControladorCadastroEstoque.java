package pizzaria.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pizzaria.model.bo.EstoqueBO;
import pizzaria.model.vo.Estoque;
import pizzaria.view.TelaProduto;

/**
 *
 * @author Douglas
 */
public class ControladorCadastroEstoque {
    
    private final TelaProduto telaProduto;
    private int retorno;
    private Estoque estoque;
    
    public ControladorCadastroEstoque(JFrame parent) {
        this.telaProduto = new TelaProduto(parent, true);
        
        this.telaProduto.getBtOk().addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               criarProduto();
            }
        });
        this.telaProduto.getBtCancelar()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });
    }
    
    public void abrirNovoProduto(){
        this.telaProduto.setVisible(true);
        this.telaProduto.toFront();
    }
    
    private void criarProduto(){
        try{
            Estoque estoque = new Estoque();           
            
            
            estoque.getProduto().setNome(this.telaProduto.getTxtNomeprod().getText());
            estoque.getProduto().setDescricao(this.telaProduto.getTxtDescricao().getText());
            estoque.getProduto().setUnidade(this.telaProduto.getTxtUnidade().getText());
            estoque.setQuantidade(Integer.valueOf(this.telaProduto.getTxtQtde().getText()));
            
            
            EstoqueBO bo = new EstoqueBO();
            
            bo.novoItem(estoque);            
            JOptionPane.showMessageDialog(this.telaProduto,"Produto cadastrado com sucesso.");
            
            this.telaProduto.dispose();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    this.telaProduto, ex.getMessage());
        }
    }
    private void cancelar() {
        this.telaProduto.dispose();

        this.retorno = JOptionPane.CANCEL_OPTION;
    }
    
     public int editar(Estoque estoque){
        this.estoque = estoque;
        
        this.carregaDadosTela();
        
        this.telaProduto.setVisible(true);
        
        return this.retorno;
    }
    private void carregaDadosTela(){
        this.telaProduto.getTxtNomeprod().setText(this.estoque.getProduto().getNome());
        this.telaProduto.getTxtDescricao().setText(this.estoque.getProduto().getDescricao());
        this.telaProduto.getTxtUnidade().setText(this.estoque.getProduto().getUnidade());
        this.telaProduto.getTxtQtde().setText((String.valueOf(this.estoque.getQuantidade())));
        
    }
    
    private void carregaDadosObjeto(){
        this.estoque.getProduto().setNome(this.telaProduto.getTxtNomeprod().getText());
        this.estoque.getProduto().setDescricao(this.telaProduto.getTxtDescricao().getText());
        this.estoque.getProduto().setUnidade(this.telaProduto.getTxtUnidade().getText());
        this.estoque.setQuantidade(Integer.valueOf(this.telaProduto.getTxtQtde().getText()));
        
        
    }
    
}
