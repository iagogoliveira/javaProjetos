/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.a3;

/**
 *
 * @author iagol
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        alteracaoUserMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        GerenciamentoProjMenu = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        gerenciamentoReq = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        projRelaMenu = new javax.swing.JMenuItem();
        reqRelaMenu = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Soluções para projetos");
        setBackground(new java.awt.Color(153, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/saojudas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(255, 204, 102));

        jMenu1.setBackground(new java.awt.Color(153, 153, 153));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/user.png"))); // NOI18N
        jMenu1.setText("Gerenciamento de usuários");

        alteracaoUserMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/user_edit.png"))); // NOI18N
        alteracaoUserMenu.setText("Alteração e consulta");
        alteracaoUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteracaoUserMenuActionPerformed(evt);
            }
        });
        jMenu1.add(alteracaoUserMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/page.png"))); // NOI18N
        jMenu2.setText("Gerenciamento de projetos");

        GerenciamentoProjMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/page_edit.png"))); // NOI18N
        GerenciamentoProjMenu.setText("Ateração e consulta");
        GerenciamentoProjMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciamentoProjMenuActionPerformed(evt);
            }
        });
        jMenu2.add(GerenciamentoProjMenu);

        jMenuBar1.add(jMenu2);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/book.png"))); // NOI18N
        jMenu8.setText("Gerenciamenteo de requisitos");

        gerenciamentoReq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/book_edit.png"))); // NOI18N
        gerenciamentoReq.setText("Alteração e consulta");
        gerenciamentoReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciamentoReqActionPerformed(evt);
            }
        });
        jMenu8.add(gerenciamentoReq);

        jMenuBar1.add(jMenu8);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/report.png"))); // NOI18N
        jMenu5.setText("Geração de relatórios");

        projRelaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/report.png"))); // NOI18N
        projRelaMenu.setText("Listagem de projetos");
        projRelaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projRelaMenuActionPerformed(evt);
            }
        });
        jMenu5.add(projRelaMenu);

        reqRelaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/a3/report.png"))); // NOI18N
        reqRelaMenu.setText("Listagem de requisitos");
        reqRelaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqRelaMenuActionPerformed(evt);
            }
        });
        jMenu5.add(reqRelaMenu);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GerenciamentoProjMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciamentoProjMenuActionPerformed
        new TelaModificarProjetos().setVisible(true);
    }//GEN-LAST:event_GerenciamentoProjMenuActionPerformed

    private void alteracaoUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteracaoUserMenuActionPerformed
        new TelaModificarUsuario().setVisible(true);
  
    }//GEN-LAST:event_alteracaoUserMenuActionPerformed

    private void gerenciamentoReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciamentoReqActionPerformed
        new TelaModificarRequisitos().setVisible(true);
    }//GEN-LAST:event_gerenciamentoReqActionPerformed

    private void reqRelaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqRelaMenuActionPerformed
        new ListagemRequi().setVisible(true);
    }//GEN-LAST:event_reqRelaMenuActionPerformed

    private void projRelaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projRelaMenuActionPerformed
        new ListagemProj().setVisible(true);
    }//GEN-LAST:event_projRelaMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GerenciamentoProjMenu;
    private javax.swing.JMenuItem alteracaoUserMenu;
    private javax.swing.JMenuItem gerenciamentoReq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem projRelaMenu;
    private javax.swing.JMenuItem reqRelaMenu;
    // End of variables declaration//GEN-END:variables
}
