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
import pizzaria.model.bo.FornecedorBO;
import pizzaria.model.vo.Fornecedor;
import pizzaria.view.listas.TelaLFornecedor;

/**
 *
 * @author Douglas
 */
public class ControladorListagemFornecedores {
    
    private TelaLFornecedor telaListagem;
    private Fornecedor fornecedor;
    
    public ControladorListagemFornecedores(JFrame parent){
        this.telaListagem = new TelaLFornecedor();
        
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
                novoCadastroFornecedor();
                listarFornecedores();
            }
        });
        
        this.telaListagem.getBtEditar()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                alterarFornecedor();
            }
        });
        
        this.telaListagem.getBtExcluir()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                excluirFornecedor();
            }
        });
    }
    
    public void abrirListagem(){
        this.listarFornecedores();
        this.telaListagem.setVisible(true);
        this.telaListagem.toFront();
    }
    
    private void listarFornecedores(){
        try{
            FornecedorBO bo = new FornecedorBO();
            List<Fornecedor> fornecedores = bo.listar();
            
            DefaultTableModel modelo = (DefaultTableModel)
                this.telaListagem.getjTable1().getModel();
            
            while(modelo.getRowCount() > 0){
                modelo.removeRow(0);
            }
            
            for(Fornecedor f : fornecedores){
                modelo.addRow(new Object[] {f.getCodPessoa(),
                    f.getNome(), f.getTelefoneCom(), f.getEndereco().getRua()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    
    private Fornecedor getFornecedorSelecionado() throws Exception {
        int codigo = 0;
        int row = this.telaListagem.getjTable1().getSelectedRow();
        
        if(row >= 0){
            codigo = (int)this.telaListagem.getjTable1().getValueAt(row, 0);
        }
        
        FornecedorBO bo = new FornecedorBO();
        return bo.buscar(codigo);
    }
    
    private void excluirFornecedor(){
        try {
            Fornecedor fornecedor = this.getFornecedorSelecionado();
            
            if(JOptionPane.showConfirmDialog(this.telaListagem, "Confirma a exclusão do fornecedor cadastrado '" +
                            fornecedor.getNome()) == JOptionPane.YES_OPTION){
                FornecedorBO bo = new FornecedorBO();
            
                bo.excluir(fornecedor, fornecedor.getCodPessoa());

                this.listarFornecedores();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    
   private void alterarFornecedor(){
        try {
            ControladorCadastroFornecedor controlador = new ControladorCadastroFornecedor(this.telaListagem);
            
            if(controlador.editar(this.getFornecedorSelecionado()) == JOptionPane.OK_OPTION){
                this.listarFornecedores();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    private void novoCadastroFornecedor(){
        ControladorCadastroFornecedor controlador = new ControladorCadastroFornecedor(this.telaListagem);
        controlador.abrirNovoFornecedor();
        
    }
    
}
