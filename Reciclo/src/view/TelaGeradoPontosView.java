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

        lblGerados = new javax.swing.JLabel();
        btnReturnCarteira = new model.projectButton();
        lblObrigado1 = new javax.swing.JLabel();
        lblPontuacaoGeradaSQL = new model.projectTextField();
        btnSair = new model.projectButton();

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

        lblPontos.setText("pontos");
        jPanel1.add(lblPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 700, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator5.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 420, 20));

        lblSucesso.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSucesso.setForeground(new java.awt.Color(160, 205, 96));
        lblSucesso.setText("com sucesso!");

        jPanel1.add(lblSucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        lblGerados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGerados.setForeground(new java.awt.Color(160, 205, 96));
        lblGerados.setText("Foram gerados");
        jPanel1.add(lblGerados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, -1, -1));

        btnReturnCarteira.setBackground(new java.awt.Color(60, 60, 60));
        btnReturnCarteira.setBorder(null);
        btnReturnCarteira.setForeground(new java.awt.Color(206, 240, 157));
        btnReturnCarteira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-retornar-45.png"))); // NOI18N
        btnReturnCarteira.setColor(new java.awt.Color(80, 80, 80));
        btnReturnCarteira.setColorClick(new java.awt.Color(206, 240, 157));
        btnReturnCarteira.setRadius(30);
        btnReturnCarteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnCarteiraActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturnCarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 50, 50));

        lblObrigado1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblObrigado1.setForeground(new java.awt.Color(160, 205, 96));
        lblObrigado1.setText("Obrigado!");
        jPanel1.add(lblObrigado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 240, 70));

        lblPontuacaoGeradaSQL.setEditable(false);
        lblPontuacaoGeradaSQL.setBackground(new java.awt.Color(60, 60, 60));
        lblPontuacaoGeradaSQL.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacaoGeradaSQL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lblPontuacaoGeradaSQL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(lblPontuacaoGeradaSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 160, 70));

        btnSair.setBackground(new java.awt.Color(60, 60, 60));
        btnSair.setBorder(null);
        btnSair.setForeground(new java.awt.Color(206, 240, 157));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-x-45.png"))); // NOI18N
        btnSair.setColor(new java.awt.Color(80, 80, 80));
        btnSair.setColorClick(new java.awt.Color(206, 240, 157));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSair.setRadius(30);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 50));

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


    private void btnReturnCarteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnCarteiraActionPerformed

        // Redireciona para a carteira do aluno
        CarteiraAlunoView carteiraalun = new CarteiraAlunoView();
        this.setVisible(false);
        carteiraalun.setVisible(true);

    }//GEN-LAST:event_btnReturnCarteiraActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        AlunoLoginView alunolog = new AlunoLoginView();
        this.setVisible(false);
        alunolog.setVisible(true);
        // Redireciona para tela de login do aluno
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeradoPontosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private model.projectButton btnReturnCarteira;
    private model.projectButton btnSair;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblGerados;
    private javax.swing.JLabel lblObrigado1;
    private javax.swing.JLabel lblPontos;
    private model.projectTextField lblPontuacaoGeradaSQL;

    private javax.swing.JLabel lblSucesso;
    // End of variables declaration//GEN-END:variables
}
