package pizzaria.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBotoesAuxCliente = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPPrincipal = new javax.swing.JPanel();
        jPSuperior = new javax.swing.JPanel();
        jPBotoesPrincipal = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnCardapio = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnFuncionario = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jlAvatar = new javax.swing.JLabel();
        jlNomeUsuario = new javax.swing.JLabel();
        jlCargoUsuario = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPInferior = new javax.swing.JPanel();
        jPBotoesAux = new javax.swing.JPanel();
        jPPesquisar = new javax.swing.JPanel();
        jtPesquisar = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jPTela = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmEditar = new javax.swing.JMenu();
        jmExibir = new javax.swing.JMenu();
        jmAjuda = new javax.swing.JMenu();

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar Cliente");

        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Buscar Cliente");

        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Editar Cliente");

        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("Excluir Cliente");

        jButton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton5.setText("Historico do Cliente");

        jButton11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton11.setText("Voltar");

        javax.swing.GroupLayout jPBotoesAuxClienteLayout = new javax.swing.GroupLayout(jPBotoesAuxCliente);
        jPBotoesAuxCliente.setLayout(jPBotoesAuxClienteLayout);
        jPBotoesAuxClienteLayout.setHorizontalGroup(
            jPBotoesAuxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
        );
        jPBotoesAuxClienteLayout.setVerticalGroup(
            jPBotoesAuxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesAuxClienteLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pizza System");
        setName("Pizza System"); // NOI18N

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPPrincipal.setForeground(new java.awt.Color(204, 204, 204));
        jPPrincipal.setName("Pizza System"); // NOI18N
        jPPrincipal.setLayout(new java.awt.BorderLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnPedido.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPedido.setText("Pedido");
        btnPedido.setMargin(new java.awt.Insets(2, 1, 2, 1));

        btnEstoque.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEstoque.setText("Estoque");
        btnEstoque.setMargin(new java.awt.Insets(2, 1, 2, 1));

        btnCardapio.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCardapio.setText("Cardapio");
        btnCardapio.setMargin(new java.awt.Insets(2, 1, 2, 1));

        btnFornecedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnFornecedor.setText("Fornecedor");
        btnFornecedor.setMargin(new java.awt.Insets(2, 1, 2, 1));

        btnFuncionario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnFuncionario.setText("Funcionário");
        btnFuncionario.setMargin(new java.awt.Insets(2, 1, 2, 1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/1415316325_online_support.png"))); // NOI18N
        jlAvatar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNomeUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlCargoUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlCargoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/pizzaSystem.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPBotoesPrincipalLayout = new javax.swing.GroupLayout(jPBotoesPrincipal);
        jPBotoesPrincipal.setLayout(jPBotoesPrincipalLayout);
        jPBotoesPrincipalLayout.setHorizontalGroup(
            jPBotoesPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPBotoesPrincipalLayout.setVerticalGroup(
            jPBotoesPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPSuperiorLayout = new javax.swing.GroupLayout(jPSuperior);
        jPSuperior.setLayout(jPSuperiorLayout);
        jPSuperiorLayout.setHorizontalGroup(
            jPSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBotoesPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPSuperiorLayout.setVerticalGroup(
            jPSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPBotoesPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPPrincipal.add(jPSuperior, java.awt.BorderLayout.PAGE_START);

        jPBotoesAux.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPPesquisar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtPesquisar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtPesquisar.setText("Pesquisar");

        jbPesquisar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/1415314388_google_web_search.png"))); // NOI18N

        javax.swing.GroupLayout jPPesquisarLayout = new javax.swing.GroupLayout(jPPesquisar);
        jPPesquisar.setLayout(jPPesquisarLayout);
        jPPesquisarLayout.setHorizontalGroup(
            jPPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPesquisarLayout.createSequentialGroup()
                .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPPesquisarLayout.setVerticalGroup(
            jPPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPesquisarLayout.createSequentialGroup()
                .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPTela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPTelaLayout = new javax.swing.GroupLayout(jPTela);
        jPTela.setLayout(jPTelaLayout);
        jPTelaLayout.setHorizontalGroup(
            jPTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPTelaLayout.setVerticalGroup(
            jPTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPInferiorLayout = new javax.swing.GroupLayout(jPInferior);
        jPInferior.setLayout(jPInferiorLayout);
        jPInferiorLayout.setHorizontalGroup(
            jPInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBotoesAux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPInferiorLayout.setVerticalGroup(
            jPInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPBotoesAux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPInferiorLayout.createSequentialGroup()
                        .addComponent(jPPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPPrincipal.add(jPInferior, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPPrincipal, java.awt.BorderLayout.CENTER);
        jPPrincipal.getAccessibleContext().setAccessibleName("");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jmArquivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmArquivo.setText("Arquivo");
        jMenuBar1.add(jmArquivo);

        jmEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmEditar.setText("Editar");
        jMenuBar1.add(jmEditar);

        jmExibir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmExibir.setText("Exibir");
        jMenuBar1.add(jmExibir);

        jmAjuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmAjuda.setText("Ajuda");
        jMenuBar1.add(jmAjuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:        
        System.out.println("TelaFuncionando");
    }//GEN-LAST:event_btnClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCardapio;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPBotoesAux;
    private javax.swing.JPanel jPBotoesAuxCliente;
    private javax.swing.JPanel jPBotoesPrincipal;
    private javax.swing.JPanel jPInferior;
    private javax.swing.JPanel jPPesquisar;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPSuperior;
    private javax.swing.JPanel jPTela;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JLabel jlAvatar;
    private javax.swing.JLabel jlCargoUsuario;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JMenu jmExibir;
    private javax.swing.JTextField jtPesquisar;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnCardapio() {
        return btnCardapio;
    }

    public void setBtnCardapio(JButton btnCardapio) {
        this.btnCardapio = btnCardapio;
    }

    public JButton getBtnCliente() {
        return btnCliente;
    }

    public void setBtnCliente(JButton btnCliente) {
        this.btnCliente = btnCliente;
    }

    public JButton getBtnEstoque() {
        return btnEstoque;
    }

    public void setBtnEstoque(JButton btnEstoque) {
        this.btnEstoque = btnEstoque;
    }

    public JButton getBtnFornecedor() {
        return btnFornecedor;
    }

    public void setBtnFornecedor(JButton btnFornecedor) {
        this.btnFornecedor = btnFornecedor;
    }

    public JButton getBtnFuncionario() {
        return btnFuncionario;
    }

    public void setBtnFuncionario(JButton btnFuncionario) {
        this.btnFuncionario = btnFuncionario;
    }

    public JButton getBtnPedido() {
        return btnPedido;
    }

    public void setBtnPedido(JButton btnPedido) {
        this.btnPedido = btnPedido;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton11() {
        return jButton11;
    }

    public void setjButton11(JButton jButton11) {
        this.jButton11 = jButton11;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JPanel getjPBotoesAux() {
        return jPBotoesAux;
    }

    public void setjPBotoesAux(JPanel jPBotoesAux) {
        this.jPBotoesAux = jPBotoesAux;
    }

    public JPanel getjPBotoesAuxCliente() {
        return jPBotoesAuxCliente;
    }

    public void setjPBotoesAuxCliente(JPanel jPBotoesAuxCliente) {
        this.jPBotoesAuxCliente = jPBotoesAuxCliente;
    }

    public JPanel getjPBotoesPrincipal() {
        return jPBotoesPrincipal;
    }

    public void setjPBotoesPrincipal(JPanel jPBotoesPrincipal) {
        this.jPBotoesPrincipal = jPBotoesPrincipal;
    }

    public JPanel getjPInferior() {
        return jPInferior;
    }

    public void setjPInferior(JPanel jPInferior) {
        this.jPInferior = jPInferior;
    }

    public JPanel getjPPesquisar() {
        return jPPesquisar;
    }

    public void setjPPesquisar(JPanel jPPesquisar) {
        this.jPPesquisar = jPPesquisar;
    }

    public JPanel getjPPrincipal() {
        return jPPrincipal;
    }

    public void setjPPrincipal(JPanel jPPrincipal) {
        this.jPPrincipal = jPPrincipal;
    }

    public JPanel getjPSuperior() {
        return jPSuperior;
    }

    public void setjPSuperior(JPanel jPSuperior) {
        this.jPSuperior = jPSuperior;
    }

    public JPanel getjPTela() {
        return jPTela;
    }

    public void setjPTela(JPanel jPTela) {
        this.jPTela = jPTela;
    }

    public JPanel getjPanel10() {
        return jPanel10;
    }

    public void setjPanel10(JPanel jPanel10) {
        this.jPanel10 = jPanel10;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JButton getJbPesquisar() {
        return jbPesquisar;
    }

    public void setJbPesquisar(JButton jbPesquisar) {
        this.jbPesquisar = jbPesquisar;
    }

    public JLabel getJlAvatar() {
        return jlAvatar;
    }

    public void setJlAvatar(JLabel jlAvatar) {
        this.jlAvatar = jlAvatar;
    }

    public JLabel getJlCargoUsuario() {
        return jlCargoUsuario;
    }

    public void setJlCargoUsuario(JLabel jlCargoUsuario) {
        this.jlCargoUsuario = jlCargoUsuario;
    }

    public JLabel getJlNomeUsuario() {
        return jlNomeUsuario;
    }

    public void setJlNomeUsuario(JLabel jlNomeUsuario) {
        this.jlNomeUsuario = jlNomeUsuario;
    }

    public JMenu getJmAjuda() {
        return jmAjuda;
    }

    public void setJmAjuda(JMenu jmAjuda) {
        this.jmAjuda = jmAjuda;
    }

    public JMenu getJmArquivo() {
        return jmArquivo;
    }

    public void setJmArquivo(JMenu jmArquivo) {
        this.jmArquivo = jmArquivo;
    }

    public JMenu getJmEditar() {
        return jmEditar;
    }

    public void setJmEditar(JMenu jmEditar) {
        this.jmEditar = jmEditar;
    }

    public JMenu getJmExibir() {
        return jmExibir;
    }

    public void setJmExibir(JMenu jmExibir) {
        this.jmExibir = jmExibir;
    }

    public JTextField getJtPesquisar() {
        return jtPesquisar;
    }

    public void setJtPesquisar(JTextField jtPesquisar) {
        this.jtPesquisar = jtPesquisar;
    }
    
}
