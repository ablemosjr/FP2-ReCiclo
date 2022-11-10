
package view;

import java.awt.Color;

/**
 *
 * @author Alessandro Lemos Jr
 * @since Release 2
 */

public class AdminRegisterView extends javax.swing.JFrame {

    public AdminRegisterView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReturn = new model.projectButton();
        btnExit = new model.projectButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfNameRegister = new model.projectTextField();
        tfEmailRegister = new model.projectTextField();
        tfUserRegister = new model.projectTextField();
        tfConfirmPassRegister = new javax.swing.JPasswordField();
        tfConfirmPassRegister_NOUSE = new model.projectTextField();
        tfPassRegister = new javax.swing.JPasswordField();
        tfPassRegister_NOUSE = new model.projectTextField();
        testRegister = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnClear = new model.projectButton();
        btnRegister = new model.projectButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(480, 800));
        setMinimumSize(new java.awt.Dimension(480, 800));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(80, 80, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(80, 80, 80));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 205, 96));
        jLabel2.setText("Administrador");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        jLabel3.setBackground(new java.awt.Color(80, 80, 80));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(160, 205, 96));
        jLabel3.setText("Registrar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 30));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 160));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(160, 205, 96));
        jLabel5.setText("Nome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(160, 205, 96));
        jLabel6.setText("E-mail");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(160, 205, 96));
        jLabel4.setText("Usuário");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(160, 205, 96));
        jLabel7.setText("Senha");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(160, 205, 96));
        jLabel8.setText("Confirmar senha");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator1.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 440, 20));

        tfNameRegister.setForeground(new java.awt.Color(160, 205, 96));
        tfNameRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(tfNameRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 420, 50));

        tfEmailRegister.setForeground(new java.awt.Color(160, 205, 96));
        tfEmailRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(tfEmailRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 420, 50));

        tfUserRegister.setForeground(new java.awt.Color(160, 205, 96));
        tfUserRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(tfUserRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 420, 50));

        tfConfirmPassRegister.setBackground(new java.awt.Color(60, 60, 60));
        tfConfirmPassRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfConfirmPassRegister.setForeground(new java.awt.Color(160, 205, 96));
        tfConfirmPassRegister.setBorder(null);
        tfConfirmPassRegister.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        tfConfirmPassRegister.setSelectionColor(new java.awt.Color(160, 205, 96));
        jPanel1.add(tfConfirmPassRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 170, 30));

        tfConfirmPassRegister_NOUSE.setForeground(new java.awt.Color(160, 205, 96));
        tfConfirmPassRegister_NOUSE.setEnabled(false);
        tfConfirmPassRegister_NOUSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(tfConfirmPassRegister_NOUSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 190, 50));

        tfPassRegister.setBackground(new java.awt.Color(60, 60, 60));
        tfPassRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPassRegister.setForeground(new java.awt.Color(160, 205, 96));
        tfPassRegister.setBorder(null);
        tfPassRegister.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        tfPassRegister.setSelectionColor(new java.awt.Color(160, 205, 96));
        jPanel1.add(tfPassRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 170, 30));

        tfPassRegister_NOUSE.setForeground(new java.awt.Color(160, 205, 96));
        tfPassRegister_NOUSE.setEnabled(false);
        tfPassRegister_NOUSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(tfPassRegister_NOUSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 190, 50));

        testRegister.setBackground(new java.awt.Color(60, 60, 60));
        testRegister.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        testRegister.setForeground(new java.awt.Color(150, 150, 150));
        testRegister.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        testRegister.setToolTipText("");
        testRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(testRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 470, 30));

        jSeparator3.setBackground(new java.awt.Color(60, 60, 60));
        jSeparator3.setForeground(new java.awt.Color(70, 70, 70));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 480, 10));

        btnClear.setBackground(new java.awt.Color(60, 60, 60));
        btnClear.setBorder(null);
        btnClear.setForeground(new java.awt.Color(206, 240, 157));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-vassoura-45.png"))); // NOI18N
        btnClear.setColor(new java.awt.Color(60, 60, 60));
        btnClear.setColorClick(new java.awt.Color(206, 240, 157));
        btnClear.setRadius(30);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 140, 70));

        btnRegister.setBackground(new java.awt.Color(60, 60, 60));
        btnRegister.setForeground(new java.awt.Color(206, 240, 157));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-adicionar-usuário-55.png"))); // NOI18N
        btnRegister.setColor(new java.awt.Color(60, 60, 60));
        btnRegister.setColorClick(new java.awt.Color(206, 240, 157));
        btnRegister.setRadius(30);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 140, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        tfNameRegister.setText("");
        tfEmailRegister.setText("");
        tfUserRegister.setText("");
        tfPassRegister.setText("");
        tfConfirmPassRegister.setText("");
        testRegister.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO
        
        // Teste de cadastro
        String name = tfNameRegister.getText();
        String email = tfEmailRegister.getText();
        String user = tfUserRegister.getText();
        String pass = tfPassRegister.getText();
        String passConfirm = tfConfirmPassRegister.getText();
        
        if(name.equals("Fulano")) {
            testRegister.setText("Nome já registrado");
            
        }else if(email.equals("test@test.com")) {
            testRegister.setText("E-mail já registrado");
            
        }else if(user.equals("admin")) { 
            testRegister.setText("Usuário já registrado");

        }else if(!(pass.equals(passConfirm))) {
            testRegister.setText("Senhas diferentes, insira novamente");
            
        } else {
            testRegister.setForeground(Color.GREEN);
            testRegister.setText("Registrado");
            
            tfNameRegister.setText("");
            tfEmailRegister.setText("");
            tfUserRegister.setText("");
            tfPassRegister.setText("");
            tfConfirmPassRegister.setText("");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        
        AdminHistoryView homeAdmin = new AdminHistoryView();
        
        this.setVisible(false);
        homeAdmin.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        // Botão exit
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.projectButton btnClear;
    private model.projectButton btnExit;
    private model.projectButton btnRegister;
    private model.projectButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel testRegister;
    private javax.swing.JPasswordField tfConfirmPassRegister;
    private model.projectTextField tfConfirmPassRegister_NOUSE;
    private model.projectTextField tfEmailRegister;
    private model.projectTextField tfNameRegister;
    private javax.swing.JPasswordField tfPassRegister;
    private model.projectTextField tfPassRegister_NOUSE;
    private model.projectTextField tfUserRegister;
    // End of variables declaration//GEN-END:variables
}
