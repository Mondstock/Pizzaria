package pizzaria.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pizzaria.view.TelaPrincipal;

/**
 *
 * @author Douglas
 */
public class ControladorTelaPrincipal {

    private final TelaPrincipal telaprincipal;

    public ControladorTelaPrincipal() {
        this.telaprincipal = new TelaPrincipal();

        this.telaprincipal.getBtnCliente().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                telaprincipal.getjPBotoesAux().add(telaprincipal.getjPBotoesAuxCliente());
            }
        });
        this.telaprincipal.getBtnFornecedor().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                novoLFornecedor();
            }
        });
        this.telaprincipal.getBtnCardapio().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                novoLCardapio();
            }
        });
        this.telaprincipal.getBtnEstoque().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                novoLProduto();
            }
        });
    }

    public void abrirTela() {
        this.telaprincipal.setVisible(true);
        this.telaprincipal.toFront();
    }

    private void novoLCliente() {
        ControladorListagemClientes controlador = new ControladorListagemClientes(this.telaprincipal);
        controlador.abrirListagem();
    }

    private void novoLFornecedor() {
        ControladorListagemFornecedores controlador = new ControladorListagemFornecedores(this.telaprincipal);
        controlador.abrirListagem();
    }

    private void novoLProduto() {
        ControladorListagemProdutos controlador = new ControladorListagemProdutos(this.telaprincipal);
        controlador.abrirListagem();
    }

    private void novoLCardapio() {
        ControladorListagemCardapios controlador = new ControladorListagemCardapios(this.telaprincipal);
        controlador.abrirListagem();
    }
}
