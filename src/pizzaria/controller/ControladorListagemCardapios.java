/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzaria.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pizzaria.model.bo.CardapioBO;
import pizzaria.model.vo.Cardapio;
import pizzaria.view.listas.TelaLCardapio;


/**
 *
 * @author Douglas
 */
public class ControladorListagemCardapios{
    
    private TelaLCardapio telaListagem;
    private Cardapio cardapio;
    
    public ControladorListagemCardapios(JFrame parent){
        this.telaListagem = new TelaLCardapio();
        
        this.telaListagem.getBtSair()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                telaListagem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                telaListagem.dispose();
            }
        });
        
        this.telaListagem.getBtInserir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                novoCadastroCardapio();
            }
        });
        
        this.telaListagem.getBtEditar()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                alterarCardapio();
            }
        });
        
        this.telaListagem.getBtExcluir()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                excluirCardapio();
            }
        });
    }
    
    public void abrirListagem(){
        this.listarCardapios();
        this.telaListagem.setVisible(true);
        this.telaListagem.toFront();
    }
    
    private void listarCardapios(){
        try{
            CardapioBO  bo = new CardapioBO();
            List<Cardapio> cardapios = bo.listar();
            
            DefaultTableModel modelo = (DefaultTableModel)
                this.telaListagem.getTbTable().getModel();
            
            while(modelo.getRowCount() > 0){
                modelo.removeRow(0);
            }
            
            for(Cardapio c : cardapios){
                modelo.addRow(new Object[] {c.getCodCardapio(),
                    c.getNome(), c.getDescricao()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    
    private Cardapio getCardapioSelecionado() throws Exception {
        int codigo = 0;
        int row = this.telaListagem.getTbTable().getSelectedRow();
        
        if(row >= 0){
            codigo = (int)this.telaListagem.getTbTable().getValueAt(row, 0);
        }
        
        CardapioBO bo = new CardapioBO();
        return bo.buscar(codigo);
    }
    
    private void excluirCardapio(){
        try {
            Cardapio cardapio = this.getCardapioSelecionado();
            
            if(JOptionPane.showConfirmDialog(this.telaListagem,"Confirma a exclusão do cardapio cadastrado '" + cardapio.getNome()) == JOptionPane.YES_OPTION){
                CardapioBO bo = new CardapioBO();
            
                bo.excluir(cardapio, cardapio.getCodCardapio());

                this.listarCardapios();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    
   private void alterarCardapio(){
        try {
            ControladorCadastroCardapio controlador = new ControladorCadastroCardapio(this.telaListagem);
            
            if(controlador.editar(this.getCardapioSelecionado()) == JOptionPane.OK_OPTION){
                this.listarCardapios();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    private void novoCadastroCardapio(){
        ControladorCadastroCardapio controlador = new ControladorCadastroCardapio(this.telaListagem);
        controlador.abrirNovoCardapio();
        
    }
   
   
    
}
