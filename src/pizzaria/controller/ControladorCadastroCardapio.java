package pizzaria.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pizzaria.model.bo.CardapioBO;
import pizzaria.model.vo.Cardapio;
import pizzaria.view.TelaCardapio;

/**
 *
 * @author Douglas
 */
public class ControladorCadastroCardapio {
    
    private final TelaCardapio telaCardapio;
    private int retorno;
    private Cardapio cardapio;
    
    public ControladorCadastroCardapio(JFrame parent) {
        this.telaCardapio = new TelaCardapio(parent, true);
        
        this.telaCardapio.getBtOk().addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               criarCardapio();
            }
        });
        this.telaCardapio.getBtCancelar()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });
    }
    
    public void abrirNovoCardapio(){
        this.telaCardapio.setVisible(true);
        this.telaCardapio.toFront();
    }
    
    private void criarCardapio(){
        try{
            Cardapio cardapio = new Cardapio();           
            
            
            cardapio.setNome(this.telaCardapio.getTxtNomePizza().getText());
            cardapio.setDescricao(this.telaCardapio.getTxtDescricao().getText());
            
            
            
            CardapioBO bo = new CardapioBO();
            
            bo.novoCardapio(cardapio);
            
            JOptionPane.showMessageDialog(this.telaCardapio,"Cardapio cadastrado com sucesso.");
            
            this.telaCardapio.dispose();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    this.telaCardapio, ex.getMessage());
        }
    }
    
    private void cancelar() {
        this.telaCardapio.dispose();

        this.retorno = JOptionPane.CANCEL_OPTION;
    }
    
     public int editar(Cardapio cardapio){
        this.cardapio = cardapio;
        
        this.carregaDadosTela();
        
        this.telaCardapio.setVisible(true);
        
        return this.retorno;
    }
    private void carregaDadosTela(){
        this.telaCardapio.getTxtNomePizza().setText(this.cardapio.getNome());
        this.telaCardapio.getTxtDescricao().setText(this.cardapio.getDescricao());
        
    }
    
    private void carregaDadosObjeto(){
        this.cardapio.setNome(this.telaCardapio.getTxtNomePizza().getText());        
        this.cardapio.setDescricao(this.telaCardapio.getTxtDescricao().getText());
        
        
    }
    
}
