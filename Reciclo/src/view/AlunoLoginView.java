package view;

public class AlunoLoginView extends javax.swing.JFrame {

    public AlunoLoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfAdminLogin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        testConnectionFail = new javax.swing.JLabel();
        testConnection = new javax.swing.JLabel();
        btnLogin1 = new view.projectButton();
        btnAdminLog = new view.projectButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusable(false);
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(160, 205, 96));
        jLabel1.setText("RA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        tfAdminLogin.setBackground(new java.awt.Color(60, 60, 60));
        tfAdminLogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfAdminLogin.setForeground(new java.awt.Color(160, 205, 96));
        tfAdminLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfAdminLogin.setBorder(null);
        tfAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAdminLoginActionPerformed(evt);
            }
        });
        jPanel1.add(tfAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 240, 50));

        jSeparator2.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator2.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 280, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-usuário-28.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecicloLogo_User.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        testConnectionFail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        testConnectionFail.setForeground(new java.awt.Color(255, 51, 51));
        testConnectionFail.setToolTipText("");
        testConnectionFail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(testConnectionFail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, 280, 40));

        testConnection.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        testConnection.setForeground(new java.awt.Color(160, 205, 96));
        testConnection.setToolTipText("");
        testConnection.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(testConnection, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, 280, 40));

        btnLogin1.setBackground(new java.awt.Color(60, 60, 60));
        btnLogin1.setBorder(null);
        btnLogin1.setForeground(new java.awt.Color(206, 240, 157));
        btnLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-seta-longa-à-direita-64.png"))); // NOI18N
        btnLogin1.setColor(new java.awt.Color(60, 60, 60));
        btnLogin1.setColorClick(new java.awt.Color(206, 240, 157));
        btnLogin1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogin1.setRadius(30);
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 60, 60));

        btnAdminLog.setBackground(new java.awt.Color(60, 60, 60));
        btnAdminLog.setBorder(null);
        btnAdminLog.setForeground(new java.awt.Color(206, 240, 157));
        btnAdminLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-privado-50.png"))); // NOI18N
        btnAdminLog.setBorderColor(new java.awt.Color(60, 60, 60));
        btnAdminLog.setColor(new java.awt.Color(60, 60, 60));
        btnAdminLog.setColorClick(new java.awt.Color(206, 240, 157));
        btnAdminLog.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdminLog.setRadius(30);
        btnAdminLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLogActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdminLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 60, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(496, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAdminLoginActionPerformed

    }//GEN-LAST:event_tfAdminLoginActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        //TODO
        // Login com RA
        String user = "000000";
        TelaLoading loading = new TelaLoading();

        try {
            // Fazer abrir conexao com bd aqui e processos

            String username = tfAdminLogin.getText();

            if(username.equals(user)) {
                testConnectionFail.setText("");
                testConnection.setText("CONNECT");
                this.setVisible(false);
                loading.setVisible(true);

            } else {
                testConnection.setText("");
                testConnectionFail.setText("Invalid login!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnAdminLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLogActionPerformed
AdminLoginView adminlog = new AdminLoginView();
        this.setVisible(false);              
        adminlog.setVisible(true);
        // Redireciona para tela de admin

    }//GEN-LAST:event_btnAdminLogActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoLoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.projectButton btnAdminLog;
    private view.projectButton btnLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel testConnection;
    private javax.swing.JLabel testConnectionFail;
    private javax.swing.JTextField tfAdminLogin;
    // End of variables declaration//GEN-END:variables
}
