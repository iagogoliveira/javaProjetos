package projeto.a3;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author iagol
 */
public class ListagemRequi extends javax.swing.JFrame {

    /**
     * Creates new form ListagemRequi
     */
    public ListagemRequi() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableRequi.getModel();
        jTableRequi.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableRequi.getModel();
        modelo.setNumRows(0);
        RequisitosDao requiDao = new RequisitosDao();

        for (Requisitos requi : requiDao.read()) {

            modelo.addRow(new Object[]{
                requi.getId(),
                requi.getProjeto(),
                requi.getNome(),
                requi.getModulo(),
                requi.getFuncoes(),
                requi.getDataCriacao(),
                requi.getAutor(),
                requi.getAutorUltAlt(),
                requi.getDataUltMod(),
                requi.getVersao(),
                requi.getPrior(),
                requi.getComplex(),
                requi.getEsfHoras(),
                requi.getEstado(),
                requi.getFase(),
                requi.getDescricao()
                
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTableRequi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de requisitos");

        jTableRequi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Projeto", "Nome", "Módulo", "Funções", "Data de criação", "Autor", "Autor da última alteração", "Data da última modificação", "Versão", "Prioridade", "Complexidade", "Esforço em horas", "Estado", "Fase", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRequi.getTableHeader().setReorderingAllowed(false);
        jTableRequi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRequiMouseClicked(evt);
            }
        });
        jTableRequi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableRequiKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTableRequi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1251, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableRequiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRequiMouseClicked
        // TODO add your handling code here:
        if (jTableRequi.getSelectedRow() != -1) {
//            projetoString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 1).toString());
//            nomeString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 2).toString());
//            moduloString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 3).toString());
//            funcString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 4).toString());
//            dataString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 5).toString());
//            autorString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 6).toString());
//            autUltAlt.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 7).toString());
//            dataUltMod.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 8).toString());
//            versaoString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 9).toString());
//            priorString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 10).toString());
//            complexString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 11).toString());
//            esfHorasString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 12).toString());
//            estadoString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 13).toString());
//            faseString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 14).toString());
//            descString.setText(jTableRequi.getValueAt(jTableRequi.getSelectedRow(), 15).toString());

        }
    }//GEN-LAST:event_jTableRequiMouseClicked

    private void jTableRequiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableRequiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableRequiKeyReleased

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
            java.util.logging.Logger.getLogger(ListagemRequi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemRequi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemRequi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemRequi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemRequi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableRequi;
    // End of variables declaration//GEN-END:variables
}
