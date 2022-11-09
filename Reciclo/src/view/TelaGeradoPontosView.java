package view;

public class TelaGeradoPontosView extends javax.swing.JFrame {

    public TelaGeradoPontosView() {
        initComponents();
        lblPontuacaoGeradaSQL.setText("55");//TODO quantidade de pontos gerados do aluno no banco de dados
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblSucesso = new javax.swing.JLabel();
        lblObrigado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPontuacaoGeradaSQL = new javax.swing.JLabel();
        lblHistorico3 = new javax.swing.JLabel();
        lblGerados = new javax.swing.JLabel();
        btnReturnCarteira1 = new view.projectButton();
        btnLoginAluno1 = new view.projectButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecicloLogo_User.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        lblPontos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontos.setForeground(new java.awt.Color(160, 205, 96));
        lblPontos.setText("pontos.");
        jPanel1.add(lblPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator5.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 420, 20));

        lblSucesso.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSucesso.setForeground(new java.awt.Color(160, 205, 96));
        lblSucesso.setText("com sucesso!");
        jPanel1.add(lblSucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        lblObrigado.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblObrigado.setForeground(new java.awt.Color(160, 205, 96));
        lblObrigado.setText("Obrigado!");
        jPanel1.add(lblObrigado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jPanel4.setBackground(new java.awt.Color(211, 211, 211));

        lblPontuacaoGeradaSQL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacaoGeradaSQL.setText("000000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblPontuacaoGeradaSQL)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPontuacaoGeradaSQL)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 150, 40));

        lblHistorico3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHistorico3.setForeground(new java.awt.Color(160, 205, 96));
        lblHistorico3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-sinal-de-reciclagem-50.png"))); // NOI18N
        jPanel1.add(lblHistorico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 50, 60));

        lblGerados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGerados.setForeground(new java.awt.Color(160, 205, 96));
        lblGerados.setText("Foram gerados:");
        jPanel1.add(lblGerados, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, -1, -1));

        btnReturnCarteira1.setBackground(new java.awt.Color(60, 60, 60));
        btnReturnCarteira1.setBorder(null);
        btnReturnCarteira1.setForeground(new java.awt.Color(206, 240, 157));
        btnReturnCarteira1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-retornar-45.png"))); // NOI18N
        btnReturnCarteira1.setColor(new java.awt.Color(60, 60, 60));
        btnReturnCarteira1.setColorClick(new java.awt.Color(206, 240, 157));
        btnReturnCarteira1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReturnCarteira1.setRadius(30);
        btnReturnCarteira1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnCarteira1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturnCarteira1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 50, 50));

        btnLoginAluno1.setBackground(new java.awt.Color(60, 60, 60));
        btnLoginAluno1.setBorder(null);
        btnLoginAluno1.setForeground(new java.awt.Color(206, 240, 157));
        btnLoginAluno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-excluir-50.png"))); // NOI18N
        btnLoginAluno1.setColor(new java.awt.Color(60, 60, 60));
        btnLoginAluno1.setColorClick(new java.awt.Color(206, 240, 157));
        btnLoginAluno1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLoginAluno1.setRadius(30);
        btnLoginAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAluno1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoginAluno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 50, 50));

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

        setSize(new java.awt.Dimension(480, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnCarteira1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnCarteira1ActionPerformed

        // Redireciona para a carteira do aluno
        CarteiraAlunoView carteiraalun = new CarteiraAlunoView();
        this.setVisible(false);
        carteiraalun.setVisible(true);
    }//GEN-LAST:event_btnReturnCarteira1ActionPerformed

    private void btnLoginAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAluno1ActionPerformed
        AlunoLoginView alunologg = new AlunoLoginView();
        this.setVisible(false);
        alunologg.setVisible(true);
        // Redireciona para tela de login do aluno
    }//GEN-LAST:event_btnLoginAluno1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeradoPontosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.projectButton btnLoginAluno1;
    private view.projectButton btnReturnCarteira1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblGerados;
    private javax.swing.JLabel lblHistorico3;
    private javax.swing.JLabel lblObrigado;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblPontuacaoGeradaSQL;
    private javax.swing.JLabel lblSucesso;
    // End of variables declaration//GEN-END:variables
}
