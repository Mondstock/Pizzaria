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
import pizzaria.model.bo.ClienteBO;
import pizzaria.model.vo.Cliente;
import pizzaria.view.listas.TelaLCliente;

/**
 *
 * @author Douglas
 */
public class ControladorListagemClientes{
    
    private TelaLCliente telaListagem;
    private Cliente cliente;
    ClienteBO bo = new ClienteBO();
    
    public ControladorListagemClientes(JFrame parent){
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
                novoCadastroCliente();
                listarClientes();
            }
        });
        
        this.telaListagem.getBtEditar()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                alterarCliente();
            }
        });
        
        this.telaListagem.getBtExcluir()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                excluirCliente();
            }
        });
    }
    
    public void abrirListagem(){
        this.listarClientes();
        this.telaListagem.setVisible(true);
        this.telaListagem.toFront();
    }
    
    private void listarClientes(){
        try{
            ClienteBO bo = new ClienteBO();
            List<Cliente> clientes = bo.listar();
            
            DefaultTableModel modelo = (DefaultTableModel)
                this.telaListagem.getjTable1().getModel();
            while(modelo.getRowCount() > 0){
                modelo.removeRow(0);
            }
            
            for(Cliente c : clientes){
                modelo.addRow(new Object[] {c.getCodPessoa(),
                    c.getNome(), c.getTelefoneRes(), c.getEndereco().getRua()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this.telaListagem,ex.getMessage());
        }
    }
    
    private Cliente getClienteSelecionado() throws Exception {
        int codigo = 0;
        int row = this.telaListagem.getjTable1().getSelectedRow();
        
        if(row >= 0){
            codigo = (int)this.telaListagem.getjTable1().getValueAt(row, 0);
        }
        
        
        return bo.buscar(codigo);
    }
    
    private void excluirCliente(){
        try {
            Cliente c = this.getClienteSelecionado();
            
            if(JOptionPane.showConfirmDialog(this.telaListagem, 
                    "Confirma a exclusão do cliente cadastrado '" + c.getNome()) == JOptionPane.YES_OPTION){
                ClienteBO bo = new ClienteBO();
            
                bo.excluir(c, c.getCodPessoa());

                this.listarClientes();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    
   private void alterarCliente(){
        try {
            ControladorCadastroCliente controlador = new ControladorCadastroCliente(this.telaListagem);
            
            if(controlador.editar(this.getClienteSelecionado()) == JOptionPane.OK_OPTION){
                this.listarClientes();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.telaListagem, 
                    ex.getMessage());
        }
    }
    private void novoCadastroCliente(){
        ControladorCadastroCliente controlador = new ControladorCadastroCliente(this.telaListagem);
        controlador.abrirNovoCliente();
        
    }
}
