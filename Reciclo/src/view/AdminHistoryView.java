
package view;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alessandro Lemos Jr
 * @since Release 2
 */

public class AdminHistoryView extends javax.swing.JFrame {

    public AdminHistoryView() {
        
        initComponents();
        tabelaAdmin.fixTable(jScrollPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new model.projectButton();
        btnExit = new model.projectButton();
        btnBuscaView = new model.projectButton();
        jLabel3 = new javax.swing.JLabel();
        tfSearchRA = new model.projectTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAdmin = new model.projectTable();
        btnDelete = new model.projectButton();
        btnSearch = new model.projectButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(80, 80, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(80, 80, 80));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(160, 205, 96));
        jLabel1.setText("Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 30));

        jLabel2.setBackground(new java.awt.Color(80, 80, 80));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 205, 96));
        jLabel2.setText("Bem vindo,");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 30));

        btnRegister.setBackground(new java.awt.Color(80, 80, 80));
        btnRegister.setBorder(null);
        btnRegister.setForeground(new java.awt.Color(206, 240, 157));
        btnRegister.setText("Cadastrar Admin");
        btnRegister.setColor(new java.awt.Color(80, 80, 80));
        btnRegister.setColorClick(new java.awt.Color(206, 240, 157));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegister.setRadius(30);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 160, 50));

        btnExit.setBackground(new java.awt.Color(80, 80, 80));
        btnExit.setBorder(null);
        btnExit.setForeground(new java.awt.Color(206, 240, 157));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-x-45.png"))); // NOI18N
        btnExit.setColor(new java.awt.Color(80, 80, 80));
        btnExit.setColorClick(new java.awt.Color(206, 240, 157));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnExit.setRadius(30);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 50));

        btnBuscaView.setBackground(new java.awt.Color(80, 80, 80));
        btnBuscaView.setBorder(null);
        btnBuscaView.setForeground(new java.awt.Color(206, 240, 157));
        btnBuscaView.setText("Busca por ID");
        btnBuscaView.setColor(new java.awt.Color(80, 80, 80));
        btnBuscaView.setColorClick(new java.awt.Color(206, 240, 157));
        btnBuscaView.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBuscaView.setRadius(30);
        btnBuscaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaViewActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscaView, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 160, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 160));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(160, 205, 96));
        jLabel3.setText("RA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        tfSearchRA.setBackground(new java.awt.Color(60, 60, 60));
        tfSearchRA.setForeground(new java.awt.Color(160, 205, 96));
        tfSearchRA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSearchRA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(tfSearchRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 50));

        jSeparator1.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator1.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 440, 20));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(480, 460));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(480, 460));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(480, 460));

        tabelaAdmin.setBackground(new java.awt.Color(70, 70, 70));
        tabelaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Reciclagem", "Quantidade", "Pontuação", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAdmin.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaAdmin);
        if (tabelaAdmin.getColumnModel().getColumnCount() > 0) {
            tabelaAdmin.getColumnModel().getColumn(0).setResizable(false);
            tabelaAdmin.getColumnModel().getColumn(1).setResizable(false);
            tabelaAdmin.getColumnModel().getColumn(2).setResizable(false);
            tabelaAdmin.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 480, 460));

        btnDelete.setBackground(new java.awt.Color(60, 60, 60));
        btnDelete.setBorder(null);
        btnDelete.setForeground(new java.awt.Color(206, 240, 157));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-excluir-38.png"))); // NOI18N
        btnDelete.setColor(new java.awt.Color(60, 60, 60));
        btnDelete.setColorClick(new java.awt.Color(206, 240, 157));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDelete.setRadius(30);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 50, 50));

        btnSearch.setBackground(new java.awt.Color(60, 60, 60));
        btnSearch.setBorder(null);
        btnSearch.setForeground(new java.awt.Color(206, 240, 157));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-pesquisar-45.png"))); // NOI18N
        btnSearch.setColor(new java.awt.Color(60, 60, 60));
        btnSearch.setColorClick(new java.awt.Color(206, 240, 157));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSearch.setRadius(30);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaViewActionPerformed
        
        AdminSearchView searchView = new AdminSearchView();
        
        this.setVisible(false);
        searchView.setVisible(true);
    }//GEN-LAST:event_btnBuscaViewActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        AdminRegisterView registerView = new AdminRegisterView();
        
        this.setVisible(false);
        registerView.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        // Botão exit
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO
        
        String test = "000000";
        
        if(tfSearchRA.getText().equals(test)) {
            
            DefaultTableModel mode = (DefaultTableModel) tabelaAdmin.getModel();
            for(int i = 1; i <= 20; i++) {
                mode.addRow(new Object[]{i, "10gr", 20, "01/01/0001"});
            }
        } 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO
        
        DefaultTableModel mode = (DefaultTableModel) tabelaAdmin.getModel();
        mode.setRowCount(0);
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHistoryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.projectButton btnBuscaView;
    private model.projectButton btnDelete;
    private model.projectButton btnExit;
    private model.projectButton btnRegister;
    private model.projectButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private model.projectTable tabelaAdmin;
    private model.projectTextField tfSearchRA;
    // End of variables declaration//GEN-END:variables
}
