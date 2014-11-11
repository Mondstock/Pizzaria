package pizzaria.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pizzaria.model.bo.FornecedorBO;
import pizzaria.model.vo.Cliente;
import pizzaria.model.vo.Fornecedor;
import pizzaria.view.TelaFornecedor;

/**
 *
 * @author Douglas
 */
public class ControladorCadastroFornecedor {
    
    private final TelaFornecedor telaNovoFornecedor;
    private Fornecedor fornecedor;
    private int retorno;
    
    public ControladorCadastroFornecedor(JFrame parent) {
        this.telaNovoFornecedor = new TelaFornecedor(parent, true);
        
        this.telaNovoFornecedor.getBtOk().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               criarFornecedor();
            }
        });
        this.telaNovoFornecedor.getBtCancelar()
                .addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });
    }
    public void abrirNovoFornecedor(){
        this.telaNovoFornecedor.setVisible(true);
        this.telaNovoFornecedor.toFront();
    }
    
    private void criarFornecedor(){
        try{
            Fornecedor fornecedor = new Fornecedor();           
            
            
            fornecedor.setCnpj(this.telaNovoFornecedor.getTxtCNPJ().getText());
            fornecedor.setNome(this.telaNovoFornecedor.getTxtNome().getText());
            fornecedor.setRazaoSocial(this.telaNovoFornecedor.getTxtRazaoSocial2().getText());
            fornecedor.getEndereco().setRua(this.telaNovoFornecedor.getTxtRua().getText());
            fornecedor.getEndereco().getBairro().setNome(this.telaNovoFornecedor.getTxtBairro().getText());
            fornecedor.getEndereco().getBairro().getCidade().setNome(this.telaNovoFornecedor.getTxtCidade().getText());
            fornecedor.getEndereco().getBairro().getCidade().getEstado().
                    setNome(this.telaNovoFornecedor.getTxtEstado().getText());
            fornecedor.getEndereco().setComplemento(this.telaNovoFornecedor.getTxtComplemento().getText());
            fornecedor.getEndereco().setCep(this.telaNovoFornecedor.getTxtCEP().getText());
            fornecedor.getEndereco().setNumero(this.telaNovoFornecedor.getTxtNumero().getText());
            fornecedor.setTelefoneRes(this.telaNovoFornecedor.getTxtTelefoneResponsavel().getText());
            fornecedor.setTelefoneCom(this.telaNovoFornecedor.getTxtTelefoneComercial().getText());
            fornecedor.setTelefoneCel(this.telaNovoFornecedor.getTxtTelefoneContato().getText());
            if (this.fornecedor != null) {
                fornecedor.setCodPessoa(this.fornecedor.getCodPessoa());
            }
            
            
            
            FornecedorBO bo = new FornecedorBO();
            
            bo.novoFornecedor(fornecedor);
            JOptionPane.showMessageDialog(this.telaNovoFornecedor," Fornecedor cadastrado com sucesso.");
           
            
            this.telaNovoFornecedor.dispose();
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this.telaNovoFornecedor, ex.getMessage());
    }
    }
    private void cancelar() {
        this.telaNovoFornecedor.dispose();

        this.retorno = JOptionPane.CANCEL_OPTION;
    }
    
     public int editar(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
        
        this.carregaDadosTela();
        
        this.telaNovoFornecedor.setVisible(true);
        
        return this.retorno;
    }
    private void carregaDadosTela(){
        this.telaNovoFornecedor.getTxtNome().setText(this.fornecedor.getNome());
        this.telaNovoFornecedor.getTxtCNPJ().setText(this.fornecedor.getCnpj());
        this.telaNovoFornecedor.getTxtRazaoSocial2().setText(this.fornecedor.getRazaoSocial());
        this.telaNovoFornecedor.getTxtRua().setText(this.fornecedor.getEndereco().getRua());
        this.telaNovoFornecedor.getTxtNumero().setText(this.fornecedor.getEndereco().getNumero());
        this.telaNovoFornecedor.getTxtComplemento().setText(this.fornecedor.getEndereco().getComplemento());
        this.telaNovoFornecedor.getTxtCEP().setText(this.fornecedor.getEndereco().getCep());   
        this.telaNovoFornecedor.getTxtBairro().setText(this.fornecedor.getEndereco().getBairro().getNome());
        this.telaNovoFornecedor.getTxtCidade().setText(this.fornecedor.getEndereco().getBairro().getCidade().getNome());
        this.telaNovoFornecedor.getTxtEstado().setText(this.fornecedor.getEndereco().getBairro().getCidade().getEstado().getNome());
        this.telaNovoFornecedor.getTxtTelefoneResponsavel().setText(this.fornecedor.getTelefoneRes());
        this.telaNovoFornecedor.getTxtTelefoneComercial().setText(this.fornecedor.getTelefoneCom());
        this.telaNovoFornecedor.getTxtTelefoneContato().setText(this.fornecedor.getTelefoneCel());
    }
    
    private void carregaDadosObjeto(){
        this.fornecedor.setNome(this.telaNovoFornecedor.getTxtNome().getText());
        this.fornecedor.setCnpj(this.telaNovoFornecedor.getTxtCNPJ().getText());        
        this.fornecedor.setRazaoSocial(this.telaNovoFornecedor.getTxtRazaoSocial2().getText());
        this.fornecedor.getEndereco().setRua(this.telaNovoFornecedor.getTxtRua().getText());
        this.fornecedor.getEndereco().setNumero(this.telaNovoFornecedor.getTxtNumero().getText());
        this.fornecedor.getEndereco().getBairro().setNome(this.telaNovoFornecedor.getTxtBairro().getText());
        this.fornecedor.getEndereco().getBairro().getCidade().setNome(this.telaNovoFornecedor.getTxtCidade().getText());
        this.fornecedor.getEndereco().getBairro().getCidade().getEstado().setNome(this.telaNovoFornecedor.getTxtEstado().getText());
        this.fornecedor.getEndereco().setComplemento(this.telaNovoFornecedor.getTxtComplemento().getText());
        this.fornecedor.getEndereco().setCep(this.telaNovoFornecedor.getTxtCEP().getText());
        this.fornecedor.setTelefoneRes(this.telaNovoFornecedor.getTxtTelefoneResponsavel().getText());
        this.fornecedor.setTelefoneCom(this.telaNovoFornecedor.getTxtTelefoneComercial().getText());
        this.fornecedor.setTelefoneCel(this.telaNovoFornecedor.getTxtTelefoneContato().getText());
        
    }
    
}
