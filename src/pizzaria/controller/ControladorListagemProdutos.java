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
import pizzaria.model.bo.EstoqueBO;
import pizzaria.model.vo.Estoque;
import pizzaria.view.listas.TelaLCliente;

/**
 *
 * @author newton
 */
public class ControladorListagemProdutos {
    
    private TelaLCliente telaListagem;
    private Estoque produto;
    
    public ControladorListagemProdutos(JFrame parent){
        this.telaListagem = new TelaLCliente();
        
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
                novoCadastroEstoque();
            }
        });
        
        this.telaListagem.getBtEditar()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                alterarProduto();
            }
        });
        
        this.telaListagem.getBtExcluir()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                excluirProduto();
            }
        });
    }
    
    public void abrirListagem(){
        this.listarProdutos();
        this.telaListagem.setVisible(true);
        this.telaListagem.toFront();
    }
    
    private void listarProdutos(){
        try{
            EstoqueBO bo = new EstoqueBO();
            List<Estoque> produtos = bo.listar();
            
            DefaultTableModel modelo = (DefaultTableModel)
                this.telaListagem.getjTable1().getModel();
            
            while(modelo.getRowCount() > 0){
                modelo.removeRow(0);
            }
            
            for(Estoque e : produtos){
                modelo.addRow(new Object[] {e.getCodEstoque(),
                    e.getProduto().getNome(), e.getProduto().getDescricao(), e.getQuantidade()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    
    private Estoque getProdutoSelecionado() throws Exception {
        int codigo = 0;
        int row = this.telaListagem.getjTable1().getSelectedRow();
        
        if(row >= 0){
            codigo = (int)this.telaListagem.getjTable1().getValueAt(row, 0);
        }
        
        EstoqueBO bo = new EstoqueBO();
        return bo.buscar(codigo);
    }
    
    private void excluirProduto(){
        try {
            Estoque estoque= this.getProdutoSelecionado();
            
            if(JOptionPane.showConfirmDialog(this.telaListagem, 
                    "Confirma a exclusão do produto cadastrado '" + produto.getProduto().getNome()) == JOptionPane.YES_OPTION){
                EstoqueBO bo = new EstoqueBO();
            
                bo.excluir(estoque, estoque.getCodEstoque());

                this.listarProdutos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    
   private void alterarProduto(){
        try {
            ControladorCadastroEstoque controlador = new ControladorCadastroEstoque(this.telaListagem);
            
            if(controlador.editar(this.getProdutoSelecionado()) == JOptionPane.OK_OPTION){
                this.listarProdutos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    private void novoCadastroEstoque(){
        ControladorCadastroEstoque controlador = new ControladorCadastroEstoque(this.telaListagem);
        controlador.abrirNovoProduto();
        
    }
    
   
    
}
