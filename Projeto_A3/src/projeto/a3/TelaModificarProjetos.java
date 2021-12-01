/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.a3;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TelaModificarProjetos extends javax.swing.JFrame {

    /**
     * Creates new form TelaModificarProjetos
     */
    public TelaModificarProjetos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableProjs.getModel();
        jTableProjs.setRowSorter(new TableRowSorter(modelo));
        readJTable();
        this.setResizable(false);
    }
    
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableProjs.getModel();
        modelo.setNumRows(0);
        ProjetosDAO projsDAO = new ProjetosDAO();

        for (Projetos projs : projsDAO.read()) {

            modelo.addRow(new Object[]{
                projs.getId(),
                projs.getNome(),
                projs.getDescricao(),
                projs.getUserProp(),
            });
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nomeString = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userPropString = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        atualizarBotao = new javax.swing.JButton();
        removerBotao = new javax.swing.JButton();
        cadastrarBotao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descProjetoString = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProjs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de projetos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nomeString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeStringActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Descrição do projeto");

        userPropString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPropStringActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuário proprietário");

        atualizarBotao.setBackground(new java.awt.Color(255, 255, 255));
        atualizarBotao.setText("Atualizar");
        atualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBotaoActionPerformed(evt);
            }
        });

        removerBotao.setBackground(new java.awt.Color(255, 255, 255));
        removerBotao.setText("Remover");
        removerBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBotaoActionPerformed(evt);
            }
        });

        cadastrarBotao.setBackground(new java.awt.Color(255, 255, 255));
        cadastrarBotao.setText("Cadastrar");
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });

        descProjetoString.setColumns(20);
        descProjetoString.setRows(5);
        jScrollPane1.setViewportView(descProjetoString);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atualizarBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(removerBotao)
                .addGap(46, 46, 46)
                .addComponent(cadastrarBotao)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(userPropString, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeString, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userPropString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarBotao)
                    .addComponent(cadastrarBotao)
                    .addComponent(removerBotao))
                .addGap(77, 77, 77))
        );

        jTableProjs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do projeto", "Descrição", "Usuário proprietário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProjs.getTableHeader().setReorderingAllowed(false);
        jTableProjs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProjsMouseClicked(evt);
            }
        });
        jTableProjs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableProjsKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTableProjs);
        if (jTableProjs.getColumnModel().getColumnCount() > 0) {
            jTableProjs.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProjsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProjsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableProjsKeyReleased

    private void jTableProjsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProjsMouseClicked
        // TODO add your handling code here:
        if (jTableProjs.getSelectedRow() != -1) {
            nomeString.setText(jTableProjs.getValueAt(jTableProjs.getSelectedRow(), 1).toString());
            descProjetoString.setText(jTableProjs.getValueAt(jTableProjs.getSelectedRow(), 2).toString());
            userPropString.setText(jTableProjs.getValueAt(jTableProjs.getSelectedRow(), 3).toString());

        }
    }//GEN-LAST:event_jTableProjsMouseClicked

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        // TODO add your handling code here:
        Projetos projs = new Projetos();
        ProjetosDAO projsDAO = new ProjetosDAO();
        projs.setNome(nomeString.getText());
        projs.setDescricao(descProjetoString.getText());
        projs.setUserProp(userPropString.getText());
        projsDAO.inserir(projs);

        nomeString.setText("");
        descProjetoString.setText("");
        userPropString.setText("");

        readJTable();

        //        DefaultTableModel jTableUser = (DefaultTableModel) jTableUsers.getModel();
        //        Object[] dados = {nomeString.getText(), loginString.getText(), emailString.getText(), senhaString.getText(), telefoneString.getText()};
        //        jTableUser.addRow(dados);
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void removerBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBotaoActionPerformed
        // TODO add your handling code here:
        if (jTableProjs.getSelectedRow() != -1) {
            Projetos projs = new Projetos();
            ProjetosDAO ProjsDAO = new ProjetosDAO();

            projs.setId((int) jTableProjs.getValueAt(jTableProjs.getSelectedRow(), 0));
            ProjsDAO.deletar(projs);

            nomeString.setText("");
            descProjetoString.setText("");
            userPropString.setText("");

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um projeto para exclusão");
        }
    }//GEN-LAST:event_removerBotaoActionPerformed

    private void atualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBotaoActionPerformed
        // TODO add your handling code here:

        if (jTableProjs.getSelectedRow() != -1) {
            Projetos projs = new Projetos();
            ProjetosDAO projsDAO = new ProjetosDAO();
            projs.setNome(nomeString.getText());
            projs.setDescricao(descProjetoString.getText());
            projs.setUserProp(userPropString.getText());
            projs.setId((int) jTableProjs.getValueAt(jTableProjs.getSelectedRow(), 0));
            projsDAO.atualizar(projs);

            nomeString.setText("");
            descProjetoString.setText("");
            userPropString.setText("");

            readJTable();

            //            Usuario user = new Usuario();
            //            UsuarioMet uMet = new UsuarioMet();
            //
            //            user.setNome(nomeString.getText());
            //            user.setNomeUser(loginString.getText());
            //            user.setEmail(emailString.getText());
            //            user.setSenha(senhaString.getText());
            //            user.setTelefone(telefoneString.getText());
            //            user.setNomeUser(jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 1).toString());
            //            uMet.atualizar(user);
            //
            //
            //            nomeString.setText("");
            //            loginString.setText("");
            //            emailString.setText("");
            //            senhaString.setText("");
            //            telefoneString.setText("");
            //
            //            readJTable();
            //

        }
    }//GEN-LAST:event_atualizarBotaoActionPerformed

    private void userPropStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPropStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPropStringActionPerformed

    private void nomeStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeStringActionPerformed

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
            java.util.logging.Logger.getLogger(TelaModificarProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaModificarProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaModificarProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaModificarProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaModificarProjetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JTextArea descProjetoString;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableProjs;
    private javax.swing.JTextField nomeString;
    private javax.swing.JButton removerBotao;
    private javax.swing.JTextField userPropString;
    // End of variables declaration//GEN-END:variables
}