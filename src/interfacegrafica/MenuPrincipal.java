/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import modelos.Atm;
import modelos.Usuario;

/**
 *
 * @author Lorena
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Atm atm;
    Usuario usuarioLogado;
    
    public MenuPrincipal(Atm atm, Usuario usuarioLogado) {
        initComponents();
        this.atm = atm;
        this.usuarioLogado = usuarioLogado;
        mostraSaldo.setText(usuarioLogado.getConta().getSaldoString());
        nomeUsuario.setText(usuarioLogado.getNome());


        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        TelaPrincipal = new javax.swing.JPanel();
        botaoDeposito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        botaoSaldo = new javax.swing.JButton();
        botaoExtrato = new javax.swing.JButton();
        botaoSaque = new javax.swing.JButton();
        botaoPagamentos = new javax.swing.JButton();
        botaoTransferencias = new javax.swing.JButton();
        botaoInvestimentos = new javax.swing.JButton();
        botaoCheques = new javax.swing.JButton();
        botaoLogout = new javax.swing.JButton();
        TelaSaldo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mostraSaldo = new javax.swing.JLabel();
        botaoVoltarSaldo = new javax.swing.JButton();
        TelaExtrato = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        TelaSaque = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mostraSaldo1 = new javax.swing.JLabel();
        TelaDeposito = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mostraSaldo2 = new javax.swing.JLabel();
        TelaPagamentos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        mostraSaldo3 = new javax.swing.JLabel();
        TelaTransferencia = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM - ES II - Bem vindo!");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(400, 305));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        botaoDeposito.setText("Depósito");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Bem-Vindo");

        nomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nomeUsuario.setText("...");

        botaoSaldo.setText("Saldo");
        botaoSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSaldoActionPerformed(evt);
            }
        });

        botaoExtrato.setText("Extrato");
        botaoExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExtratoActionPerformed(evt);
            }
        });

        botaoSaque.setText("Saque");

        botaoPagamentos.setText("Pagamentos");

        botaoTransferencias.setText("Transferência");
        botaoTransferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTransferenciasActionPerformed(evt);
            }
        });

        botaoInvestimentos.setText("Investimento");

        botaoCheques.setText("Cheques");

        botaoLogout.setText("Logout");
        botaoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaPrincipalLayout = new javax.swing.GroupLayout(TelaPrincipal);
        TelaPrincipal.setLayout(TelaPrincipalLayout);
        TelaPrincipalLayout.setHorizontalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoSaldo)
                    .addComponent(botaoExtrato)
                    .addComponent(botaoSaque)
                    .addComponent(botaoDeposito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaPrincipalLayout.createSequentialGroup()
                        .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoTransferencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoPagamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoInvestimentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCheques, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaPrincipalLayout.createSequentialGroup()
                        .addComponent(botaoLogout)
                        .addContainerGap())))
        );
        TelaPrincipalLayout.setVerticalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoLogout))
                .addGap(30, 30, 30)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSaldo)
                    .addComponent(botaoPagamentos))
                .addGap(31, 31, 31)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExtrato)
                    .addComponent(botaoTransferencias))
                .addGap(28, 28, 28)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSaque)
                    .addComponent(botaoInvestimentos))
                .addGap(27, 27, 27)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDeposito)
                    .addComponent(botaoCheques))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(TelaPrincipal, "card2");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seu saldo é:");

        mostraSaldo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mostraSaldo.setText("...");

        botaoVoltarSaldo.setText("Voltar");
        botaoVoltarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaSaldoLayout = new javax.swing.GroupLayout(TelaSaldo);
        TelaSaldo.setLayout(TelaSaldoLayout);
        TelaSaldoLayout.setHorizontalGroup(
            TelaSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaSaldoLayout.createSequentialGroup()
                .addGroup(TelaSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaSaldoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TelaSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mostraSaldo)
                            .addComponent(jLabel2)))
                    .addGroup(TelaSaldoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(botaoVoltarSaldo)))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        TelaSaldoLayout.setVerticalGroup(
            TelaSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaSaldoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(mostraSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(botaoVoltarSaldo)
                .addGap(21, 21, 21))
        );

        getContentPane().add(TelaSaldo, "card3");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Extrato completo");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton10.setText("Voltar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaExtratoLayout = new javax.swing.GroupLayout(TelaExtrato);
        TelaExtrato.setLayout(TelaExtratoLayout);
        TelaExtratoLayout.setHorizontalGroup(
            TelaExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaExtratoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(TelaExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        TelaExtratoLayout.setVerticalGroup(
            TelaExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaExtratoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(TelaExtrato, "card3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Seu saldo é:");

        mostraSaldo1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mostraSaldo1.setText("...");

        javax.swing.GroupLayout TelaSaqueLayout = new javax.swing.GroupLayout(TelaSaque);
        TelaSaque.setLayout(TelaSaqueLayout);
        TelaSaqueLayout.setHorizontalGroup(
            TelaSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaSaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostraSaldo1)
                    .addComponent(jLabel4))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        TelaSaqueLayout.setVerticalGroup(
            TelaSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaSaqueLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(mostraSaldo1)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        getContentPane().add(TelaSaque, "card3");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Seu saldo é:");

        mostraSaldo2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mostraSaldo2.setText("...");

        javax.swing.GroupLayout TelaDepositoLayout = new javax.swing.GroupLayout(TelaDeposito);
        TelaDeposito.setLayout(TelaDepositoLayout);
        TelaDepositoLayout.setHorizontalGroup(
            TelaDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaDepositoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostraSaldo2)
                    .addComponent(jLabel5))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        TelaDepositoLayout.setVerticalGroup(
            TelaDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaDepositoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addComponent(mostraSaldo2)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        getContentPane().add(TelaDeposito, "card3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Seu saldo é:");

        mostraSaldo3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mostraSaldo3.setText("...");

        javax.swing.GroupLayout TelaPagamentosLayout = new javax.swing.GroupLayout(TelaPagamentos);
        TelaPagamentos.setLayout(TelaPagamentosLayout);
        TelaPagamentosLayout.setHorizontalGroup(
            TelaPagamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPagamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaPagamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostraSaldo3)
                    .addComponent(jLabel6))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        TelaPagamentosLayout.setVerticalGroup(
            TelaPagamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPagamentosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(48, 48, 48)
                .addComponent(mostraSaldo3)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        getContentPane().add(TelaPagamentos, "card3");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Seu saldo é:");

        javax.swing.GroupLayout TelaTransferenciaLayout = new javax.swing.GroupLayout(TelaTransferencia);
        TelaTransferencia.setLayout(TelaTransferenciaLayout);
        TelaTransferenciaLayout.setHorizontalGroup(
            TelaTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaTransferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        TelaTransferenciaLayout.setVerticalGroup(
            TelaTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaTransferenciaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        getContentPane().add(TelaTransferencia, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarSaldoActionPerformed
        TelaSaldo.setVisible(false);
        TelaPrincipal.setVisible(true);
    }//GEN-LAST:event_botaoVoltarSaldoActionPerformed

    private void botaoSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSaldoActionPerformed
        TelaSaldo.setVisible(true);
        TelaPrincipal.setVisible(false);

    }//GEN-LAST:event_botaoSaldoActionPerformed

    private void botaoExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExtratoActionPerformed
        TelaPrincipal.setVisible(false);
        TelaExtrato.setVisible(true);
    }//GEN-LAST:event_botaoExtratoActionPerformed

    private void botaoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogoutActionPerformed
        TelaPrincipal.setVisible(false);
        usuarioLogado = null;
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoLogoutActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        TelaExtrato.setVisible(false);
        TelaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void botaoTransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTransferenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoTransferenciasActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaDeposito;
    private javax.swing.JPanel TelaExtrato;
    private javax.swing.JPanel TelaPagamentos;
    private javax.swing.JPanel TelaPrincipal;
    private javax.swing.JPanel TelaSaldo;
    private javax.swing.JPanel TelaSaque;
    private javax.swing.JPanel TelaTransferencia;
    private javax.swing.JButton botaoCheques;
    private javax.swing.JButton botaoDeposito;
    private javax.swing.JButton botaoExtrato;
    private javax.swing.JButton botaoInvestimentos;
    private javax.swing.JButton botaoLogout;
    private javax.swing.JButton botaoPagamentos;
    private javax.swing.JButton botaoSaldo;
    private javax.swing.JButton botaoSaque;
    private javax.swing.JButton botaoTransferencias;
    private javax.swing.JButton botaoVoltarSaldo;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel mostraSaldo;
    private javax.swing.JLabel mostraSaldo1;
    private javax.swing.JLabel mostraSaldo2;
    private javax.swing.JLabel mostraSaldo3;
    private javax.swing.JLabel nomeUsuario;
    // End of variables declaration//GEN-END:variables
}
