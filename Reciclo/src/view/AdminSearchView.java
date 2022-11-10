/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Alessandro Lemos Jr
 * @since Release 2
 */

public class AdminSearchView extends javax.swing.JFrame {

    public AdminSearchView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfChangeRA = new model.projectTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfSearchIdReciclo = new model.projectTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnExit = new model.projectButton();
        btnReturn = new model.projectButton();
        tfData = new model.projectTextField();
        tfPeso = new model.projectTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPontuacao = new model.projectTextField();
        jLabel8 = new javax.swing.JLabel();
        tfConversao = new model.projectTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        testUpdate = new javax.swing.JLabel();
        btnSearch = new model.projectButton();
        btnDelete = new model.projectButton();
        btnUpdate = new model.projectButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(480, 800));
        setMinimumSize(new java.awt.Dimension(480, 800));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfChangeRA.setBackground(new java.awt.Color(60, 60, 60));
        tfChangeRA.setForeground(new java.awt.Color(160, 205, 96));
        tfChangeRA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfChangeRA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(tfChangeRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 190, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(160, 205, 96));
        jLabel6.setText("RA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(160, 205, 96));
        jLabel5.setText("Data");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator1.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 440, 20));

        tfSearchIdReciclo.setBackground(new java.awt.Color(60, 60, 60));
        tfSearchIdReciclo.setForeground(new java.awt.Color(160, 205, 96));
        tfSearchIdReciclo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSearchIdReciclo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(tfSearchIdReciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(160, 205, 96));
        jLabel4.setText("ID ReCiclo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jPanel2.setBackground(new java.awt.Color(80, 80, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(80, 80, 80));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 205, 96));
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        jLabel3.setBackground(new java.awt.Color(80, 80, 80));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(160, 205, 96));
        jLabel3.setText("Busca por");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 30));

        btnExit.setBackground(new java.awt.Color(80, 80, 80));
        btnExit.setBorder(null);
        btnExit.setForeground(new java.awt.Color(206, 240, 157));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-x-45.png"))); // NOI18N
        btnExit.setColor(new java.awt.Color(80, 80, 80));
        btnExit.setColorClick(new java.awt.Color(206, 240, 157));
        btnExit.setRadius(30);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 50));

        btnReturn.setBackground(new java.awt.Color(80, 80, 80));
        btnReturn.setBorder(null);
        btnReturn.setForeground(new java.awt.Color(206, 240, 157));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-retornar-45.png"))); // NOI18N
        btnReturn.setColor(new java.awt.Color(80, 80, 80));
        btnReturn.setColorClick(new java.awt.Color(206, 240, 157));
        btnReturn.setRadius(30);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel2.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 160));

        tfData.setEditable(false);
        tfData.setBackground(new java.awt.Color(60, 60, 60));
        tfData.setBorder(null);
        tfData.setForeground(new java.awt.Color(160, 205, 96));
        tfData.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tfData, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 110, 50));

        tfPeso.setEditable(false);
        tfPeso.setBackground(new java.awt.Color(60, 60, 60));
        tfPeso.setBorder(null);
        tfPeso.setForeground(new java.awt.Color(160, 205, 96));
        tfPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 60, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(160, 205, 96));
        jLabel7.setText("gr");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, 40));

        tfPontuacao.setEditable(false);
        tfPontuacao.setBackground(new java.awt.Color(60, 60, 60));
        tfPontuacao.setBorder(null);
        tfPontuacao.setForeground(new java.awt.Color(160, 205, 96));
        tfPontuacao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfPontuacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tfPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 70, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(160, 205, 96));
        jLabel8.setText("pts");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 30, 40));

        tfConversao.setEditable(false);
        tfConversao.setBackground(new java.awt.Color(60, 60, 60));
        tfConversao.setBorder(null);
        tfConversao.setForeground(new java.awt.Color(160, 205, 96));
        tfConversao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfConversao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tfConversao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 130, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(160, 205, 96));
        jLabel9.setText("R$");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(160, 205, 96));
        jLabel10.setText("Conversão de pontos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(160, 205, 96));
        jLabel11.setText("Peso");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(160, 205, 96));
        jLabel12.setText("Pontuação");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 90, -1));

        jSeparator2.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator2.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 440, 20));

        jSeparator3.setBackground(new java.awt.Color(60, 60, 60));
        jSeparator3.setForeground(new java.awt.Color(70, 70, 70));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 480, 10));

        testUpdate.setBackground(new java.awt.Color(60, 60, 60));
        testUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        testUpdate.setForeground(new java.awt.Color(150, 150, 150));
        testUpdate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        testUpdate.setToolTipText("");
        testUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(testUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 470, 30));

        btnSearch.setBorder(null);
        btnSearch.setForeground(new java.awt.Color(206, 240, 157));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-pesquisar-45.png"))); // NOI18N
        btnSearch.setColor(new java.awt.Color(60, 60, 60));
        btnSearch.setColorClick(new java.awt.Color(206, 240, 157));
        btnSearch.setRadius(30);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 220, 50, 50));

        btnDelete.setBorder(null);
        btnDelete.setForeground(new java.awt.Color(206, 240, 157));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-excluir-38.png"))); // NOI18N
        btnDelete.setColor(new java.awt.Color(60, 60, 60));
        btnDelete.setColorClick(new java.awt.Color(206, 240, 157));
        btnDelete.setRadius(30);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 140, 70));

        btnUpdate.setBorder(null);
        btnUpdate.setForeground(new java.awt.Color(206, 240, 157));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-atualizar-arquivo-45.png"))); // NOI18N
        btnUpdate.setColor(new java.awt.Color(60, 60, 60));
        btnUpdate.setColorClick(new java.awt.Color(206, 240, 157));
        btnUpdate.setRadius(30);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 140, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        
        AdminHistoryView homeAdmin = new AdminHistoryView();
        
        this.setVisible(false);
        homeAdmin.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        // Botão exit
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO
        
        testUpdate.setText("");
        
        String id= "8";
        String search = tfSearchIdReciclo.getText();
        
        if(search.equals(id)) {
            tfChangeRA.setText("000000");
            tfData.setText("01/01/0001");
            tfPeso.setText("10");
            tfPontuacao.setText("5");
            tfConversao.setText("0,06");
        } else {
            testUpdate.setText("ID não encontrado");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO
        
        String change = tfChangeRA.getText();
        String test = "000001";

        if(! change.equals(test)) {
            testUpdate.setText("RA igual ao atual ou não encontrado");
            
        } else {
            testUpdate.setText("Alteração concluída");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO
        
        tfSearchIdReciclo.setText("");
        tfChangeRA.setText("");
        tfData.setText("");
        tfPeso.setText("");
        tfPontuacao.setText("");
        tfConversao.setText("");

    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSearchView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.projectButton btnDelete;
    private model.projectButton btnExit;
    private model.projectButton btnReturn;
    private model.projectButton btnSearch;
    private model.projectButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel testUpdate;
    private model.projectTextField tfChangeRA;
    private model.projectTextField tfConversao;
    private model.projectTextField tfData;
    private model.projectTextField tfPeso;
    private model.projectTextField tfPontuacao;
    private model.projectTextField tfSearchIdReciclo;
    // End of variables declaration//GEN-END:variables
}
