package com.biblioteca.view;

import com.biblioteca.model.SessaoUsuarioModel;
import com.biblioteca.service.LivroService;
import java.awt.Frame;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class FrmTelaPrincipal extends javax.swing.JFrame {

    FrmLocador frmLocador = new FrmLocador();
    FrmLocatario frmLocatario = new FrmLocatario();
    LivroService livroService = new LivroService();

    /**
     * Creates new form frmTela
     */
    public FrmTelaPrincipal() {
        //setUndecorated(true);
        initComponents();
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setarData();
        setarValoresPadrao();
        setarAcesso();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlUsuarioLogado = new javax.swing.JLabel();
        jlDataSistema = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlInstituicao = new javax.swing.JLabel();
        jlNivelUsuario = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlLivro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiEncerrarSistema = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiNovoLivro = new javax.swing.JMenuItem();
        jmiNovoLocador = new javax.swing.JMenuItem();
        jmiNovoLocatario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiConsultaLocador = new javax.swing.JMenuItem();
        jmiConsultaLocatario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiEmprestimo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACERVO  - SISTEMA DE CADASTRO E CONTROLE DE LIVROS");

        jPanel10.setBackground(new java.awt.Color(28, 89, 124));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("INFORMAÇÕES USUÁRIO:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DATA DO SISTEMA:");

        jlUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlUsuarioLogado.setForeground(new java.awt.Color(255, 255, 255));
        jlUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsuarioLogado.setText("$Usuario Logado");

        jlDataSistema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlDataSistema.setForeground(new java.awt.Color(255, 255, 255));
        jlDataSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDataSistema.setText("$DD/MM/YYYY");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("INSTITUIÇÃO:");

        jlInstituicao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlInstituicao.setForeground(new java.awt.Color(255, 255, 255));
        jlInstituicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInstituicao.setText("$Instituição Cadastrada");

        jlNivelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlNivelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlNivelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNivelUsuario.setText("$Nivel Acesso");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/biblioteca/images/book/icons8-refer-to-manual-96.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIVROS");

        jlLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlLivro.setForeground(new java.awt.Color(255, 255, 255));
        jlLivro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLivro.setText("$livros");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlInstituicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlDataSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator4)
            .addComponent(jSeparator6)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jlUsuarioLogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jlNivelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlInstituicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsuarioLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNivelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDataSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        jmiEncerrarSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiEncerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/biblioteca/images/actions/exit.png"))); // NOI18N
        jmiEncerrarSistema.setText("Sair");
        jmiEncerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEncerrarSistemaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEncerrarSistema);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Novo");

        jmiNovoLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiNovoLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/biblioteca/images/actions/book.png"))); // NOI18N
        jmiNovoLivro.setText("Livro");
        jmiNovoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovoLivroActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNovoLivro);

        jmiNovoLocador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiNovoLocador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/biblioteca/images/actions/locador.png"))); // NOI18N
        jmiNovoLocador.setText("Locador");
        jmiNovoLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovoLocadorActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNovoLocador);

        jmiNovoLocatario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiNovoLocatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/biblioteca/images/actions/locatario.png"))); // NOI18N
        jmiNovoLocatario.setText("Locatário");
        jmiNovoLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovoLocatarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNovoLocatario);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultar");

        jmiConsultaLocador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/biblioteca/images/actions/locador.png"))); // NOI18N
        jmiConsultaLocador.setText("Locadores Disponíveis");
        jmiConsultaLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaLocadorActionPerformed(evt);
            }
        });
        jMenu3.add(jmiConsultaLocador);

        jmiConsultaLocatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/biblioteca/images/actions/locatario.png"))); // NOI18N
        jmiConsultaLocatario.setText("Locatários Disponíveis");
        jmiConsultaLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaLocatarioActionPerformed(evt);
            }
        });
        jMenu3.add(jmiConsultaLocatario);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Saída");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jmiEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/biblioteca/images/actions/emprestar.png"))); // NOI18N
        jmiEmprestimo.setText("Empréstimo");
        jmiEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmprestimoActionPerformed(evt);
            }
        });
        jMenu4.add(jmiEmprestimo);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ferramentas");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiConsultaLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaLocatarioActionPerformed
        // new FrmDadosLocatario().setVisible(true);
    }//GEN-LAST:event_jmiConsultaLocatarioActionPerformed

    private void jmiConsultaLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaLocadorActionPerformed
        //    new FrmDadosLocador().setVisible(true);
    }//GEN-LAST:event_jmiConsultaLocadorActionPerformed

    private void jmiNovoLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovoLocatarioActionPerformed
        desktopPane.add(frmLocatario);
        frmLocatario.setVisible(true);
    }//GEN-LAST:event_jmiNovoLocatarioActionPerformed

    private void jmiNovoLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovoLocadorActionPerformed
        desktopPane.add(frmLocador);
        frmLocador.setVisible(true);
    }//GEN-LAST:event_jmiNovoLocadorActionPerformed

    private void jmiNovoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovoLivroActionPerformed
        FrmLivro frmLivro = new FrmLivro();
        desktopPane.add(frmLivro);
        frmLivro.setVisible(true);
    }//GEN-LAST:event_jmiNovoLivroActionPerformed

    private void jmiEncerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEncerrarSistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiEncerrarSistemaActionPerformed

    private void jmiEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmprestimoActionPerformed
        FrmEmprestimo frmEmprestimo = new FrmEmprestimo();
        desktopPane.add(frmEmprestimo);
        frmEmprestimo.setVisible(true);
    }//GEN-LAST:event_jmiEmprestimoActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void setarValoresPadrao() {
        jlInstituicao.setText(SessaoUsuarioModel.instituicao);
        jlUsuarioLogado.setText(SessaoUsuarioModel.codigoUsuario + " - " + SessaoUsuarioModel.nomeUsuario);
        jlNivelUsuario.setText(SessaoUsuarioModel.nivelAcesso);
        jlLivro.setText(String.valueOf(livroService.getQuantidadeLivrosCadastrados().getQtdeLivro()));
    }

    private void setarData() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    LocalDateTime timepoint = LocalDateTime.now();
                    jlDataSistema.setText(timepoint.format(fmt));
                }
            }
        };
        clock.start();
    }
    private void setarAcesso() {
        switch (SessaoUsuarioModel.nivelAcesso) {
            case "ADMINISTRADOR":
                jmiConsultaLocador.setEnabled(true);
                jmiConsultaLocatario.setEnabled(true);
                jmiEmprestimo.setEnabled(true);
                jmiNovoLivro.setEnabled(true);
                jmiNovoLocador.setEnabled(true);
                jmiNovoLocatario.setEnabled(true);
                break;
            default:
                jmiConsultaLocador.setEnabled(false);
                jmiConsultaLocatario.setEnabled(false);
                jmiEmprestimo.setEnabled(false);
                jmiNovoLivro.setEnabled(false);
                jmiNovoLocador.setEnabled(false);
                jmiNovoLocatario.setEnabled(false);
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlDataSistema;
    private javax.swing.JLabel jlInstituicao;
    private javax.swing.JLabel jlLivro;
    private javax.swing.JLabel jlNivelUsuario;
    private javax.swing.JLabel jlUsuarioLogado;
    private javax.swing.JMenuItem jmiConsultaLocador;
    private javax.swing.JMenuItem jmiConsultaLocatario;
    private javax.swing.JMenuItem jmiEmprestimo;
    private javax.swing.JMenuItem jmiEncerrarSistema;
    private javax.swing.JMenuItem jmiNovoLivro;
    private javax.swing.JMenuItem jmiNovoLocador;
    private javax.swing.JMenuItem jmiNovoLocatario;
    // End of variables declaration//GEN-END:variables
}
