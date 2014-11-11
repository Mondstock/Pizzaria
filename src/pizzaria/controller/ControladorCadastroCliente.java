package pizzaria.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pizzaria.model.bo.ClienteBO;
import pizzaria.model.vo.Cliente;
import pizzaria.view.TelaCliente;

/**
 *
 * @author Douglas
 */
public class ControladorCadastroCliente {

    private final TelaCliente telaNovoCliente;
    private Cliente cliente;
    private int retorno;

    public ControladorCadastroCliente(JFrame parent) {
        this.telaNovoCliente = new TelaCliente(parent, true);
        this.telaNovoCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.telaNovoCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.telaNovoCliente.getBtOk().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarCliente();
            }
        });
        this.telaNovoCliente.getBtCancelar()
                .addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cancelar();
                    }
                });
    }

    public void abrirNovoCliente() {
        this.telaNovoCliente.setVisible(true);
        this.telaNovoCliente.toFront();
    }

    private void criarCliente() {
        try {
            Cliente cliente = new Cliente();

            cliente.setCpf(this.telaNovoCliente.getTxtCPF().getText());
            cliente.setNome(this.telaNovoCliente.getTxtNome().getText());
            cliente.setRg(this.telaNovoCliente.getTxtRG().getText());

            cliente.getEndereco().setRua(this.telaNovoCliente.getTxtRua().getText());
            cliente.getEndereco().getBairro().setNome(this.telaNovoCliente.getTxtBairro().getText());
            cliente.getEndereco().getBairro().getCidade().setNome(this.telaNovoCliente.getTxtCidade().getText());
            cliente.getEndereco().getBairro().getCidade().getEstado().
                    setNome(this.telaNovoCliente.getTxtEstado().getText());
            cliente.getEndereco().setComplemento(this.telaNovoCliente.getTxtComplemento().getText());
            cliente.getEndereco().setCep(this.telaNovoCliente.getTxtCEP().getText());
            cliente.getEndereco().setNumero(this.telaNovoCliente.getTxtNumero().getText());

            cliente.setTelefoneRes(this.telaNovoCliente.getTxtTelefoneResidencial().getText());
            cliente.setTelefoneCom(this.telaNovoCliente.getTxtTelefoneComercial().getText());
            cliente.setTelefoneCel(this.telaNovoCliente.getTxtTelefoneCelular().getText());
            if (this.cliente != null) {
                cliente.setCodPessoa(this.cliente.getCodPessoa());
            }

            ClienteBO bo = new ClienteBO();

            bo.novoCliente(cliente);
            JOptionPane.showMessageDialog(this.telaNovoCliente, " Cliente Cadastrado com sucesso.");

            this.telaNovoCliente.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this.telaNovoCliente, ex.getMessage());
        }

    }

    private void cancelar() {
        this.telaNovoCliente.dispose();

        this.retorno = JOptionPane.CANCEL_OPTION;
    }

    public int editar(Cliente cliente) {
        this.cliente = cliente;

        this.carregaDadosTela();

        this.telaNovoCliente.setVisible(true);

        cliente.setCpf(this.telaNovoCliente.getTxtCPF().getText());
        cliente.setNome(this.telaNovoCliente.getTxtNome().getText());
        cliente.setRg(this.telaNovoCliente.getTxtRG().getText());

        cliente.getEndereco().setRua(this.telaNovoCliente.getTxtRua().getText());
        cliente.getEndereco().getBairro().setNome(this.telaNovoCliente.getTxtBairro().getText());
        cliente.getEndereco().getBairro().getCidade().setNome(this.telaNovoCliente.getTxtCidade().getText());
        cliente.getEndereco().getBairro().getCidade().getEstado().
                setNome(this.telaNovoCliente.getTxtEstado().getText());
        cliente.getEndereco().setComplemento(this.telaNovoCliente.getTxtComplemento().getText());
        cliente.getEndereco().setCep(this.telaNovoCliente.getTxtCEP().getText());
        cliente.getEndereco().setNumero(this.telaNovoCliente.getTxtNumero().getText());

        cliente.setTelefoneRes(this.telaNovoCliente.getTxtTelefoneResidencial().getText());
        cliente.setTelefoneCom(this.telaNovoCliente.getTxtTelefoneComercial().getText());
        cliente.setTelefoneCel(this.telaNovoCliente.getTxtTelefoneCelular().getText());
        return this.retorno;
    }

    private void carregaDadosTela() {
        this.telaNovoCliente.getTxtNome().setText(this.cliente.getNome());
        this.telaNovoCliente.getTxtCPF().setText(this.cliente.getCpf());
        this.telaNovoCliente.getTxtRG().setText(this.cliente.getRg());
        this.telaNovoCliente.getTxtRua().setText(this.cliente.getEndereco().getRua());
        this.telaNovoCliente.getTxtNumero().setText(this.cliente.getEndereco().getNumero());
        this.telaNovoCliente.getTxtComplemento().setText(this.cliente.getEndereco().getComplemento());
        this.telaNovoCliente.getTxtCEP().setText(this.cliente.getEndereco().getCep());
        this.telaNovoCliente.getTxtBairro().setText(this.cliente.getEndereco().getBairro().getNome());
        this.telaNovoCliente.getTxtCidade().setText(this.cliente.getEndereco().getBairro().getCidade().getNome());
        this.telaNovoCliente.getTxtEstado().setText(this.cliente.getEndereco().getBairro().getCidade().getEstado().getNome());
        this.telaNovoCliente.getTxtTelefoneResidencial().setText(this.cliente.getTelefoneRes());
        this.telaNovoCliente.getTxtTelefoneComercial().setText(this.cliente.getTelefoneCom());
        this.telaNovoCliente.getTxtTelefoneCelular().setText(this.cliente.getTelefoneCel());
    }

    private void carregaDadosObjeto() {
        this.cliente.setCpf(this.telaNovoCliente.getTxtCEP().getText());
        this.cliente.setCpf(this.telaNovoCliente.getTxtCPF().getText());
        this.cliente.setNome(this.telaNovoCliente.getTxtNome().getText());
        this.cliente.setRg(this.telaNovoCliente.getTxtRG().getText());
        this.cliente.getEndereco().setRua(this.telaNovoCliente.getTxtRua().getText());
        this.cliente.getEndereco().getBairro().setNome(this.telaNovoCliente.getTxtBairro().getText());
        this.cliente.getEndereco().getBairro().getCidade().setNome(this.telaNovoCliente.getTxtCidade().getText());
        this.cliente.getEndereco().getBairro().getCidade().getEstado().setNome(this.telaNovoCliente.getTxtEstado().getText());
        this.cliente.getEndereco().setComplemento(this.telaNovoCliente.getTxtComplemento().getText());
        this.cliente.getEndereco().setCep(this.telaNovoCliente.getTxtCEP().getText());
        this.cliente.setTelefoneRes(this.telaNovoCliente.getTxtTelefoneResidencial().getText());
        this.cliente.setTelefoneCom(this.telaNovoCliente.getTxtTelefoneComercial().getText());
        this.cliente.setTelefoneCel(this.telaNovoCliente.getTxtTelefoneCelular().getText());

    }
}
