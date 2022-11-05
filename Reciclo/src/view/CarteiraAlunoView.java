package view;


public class CarteiraAlunoView extends javax.swing.JFrame {

    public CarteiraAlunoView() {
        initComponents();
        lblRAValor.setText("RA 000000"); //TODO Valor do RA no banco de dados
        lblAluno.setText("Aluno"); //TODO Nome do aluno no banco de dados
        lblValorCarteira.setText("00,00");//TODO Valor de quanto o aluno tem pra gastar no banco de dados
        lblPontuacaoSQL.setText("00000");//TODO Pontuacao total do aluno no banco de dados
        lblPontuacaoDescarteSQL.setText("00000");//TODO Pontuacao descarte anterior do aluno no banco de dados

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblDescartar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSair = new view.projectButton();
        btnReciclar = new view.projectButton();
        lblReal = new javax.swing.JLabel();
        lblDescarte = new javax.swing.JLabel();
        lblValorCarteira = new javax.swing.JLabel();
        lblGR = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtDescartar = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblRAValor = new javax.swing.JLabel();
        btnHistorico = new view.projectButton();
        jLabel4 = new javax.swing.JLabel();
        lblOla = new javax.swing.JLabel();
        lblAluno = new javax.swing.JLabel();
        lblCarteira = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPontuacaoSQL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPontuacaoDescarteSQL = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();
        lblPontuacao2 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusable(false);
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescartar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescartar.setForeground(new java.awt.Color(160, 205, 96));
        lblDescartar.setText("Descartar");
        jPanel1.add(lblDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-usuário-28.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 30, 30));

        btnSair.setBackground(new java.awt.Color(60, 60, 60));
        btnSair.setBorder(null);
        btnSair.setForeground(new java.awt.Color(206, 240, 157));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-excluir-50.png"))); // NOI18N
        btnSair.setColor(new java.awt.Color(60, 60, 60));
        btnSair.setColorClick(new java.awt.Color(206, 240, 157));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSair.setRadius(30);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 50, 50));

        btnReciclar.setBackground(new java.awt.Color(60, 60, 60));
        btnReciclar.setBorder(null);
        btnReciclar.setForeground(new java.awt.Color(206, 240, 157));
        btnReciclar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-sinal-de-reciclagem-50.png"))); // NOI18N
        btnReciclar.setColor(new java.awt.Color(60, 60, 60));
        btnReciclar.setColorClick(new java.awt.Color(206, 240, 157));
        btnReciclar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReciclar.setRadius(30);
        btnReciclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciclarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReciclar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 70, 70));

        lblReal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblReal.setForeground(new java.awt.Color(160, 205, 96));
        lblReal.setText("R$");
        jPanel1.add(lblReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        lblDescarte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescarte.setForeground(new java.awt.Color(160, 205, 96));
        lblDescarte.setText("Descarte Anterior");
        jPanel1.add(lblDescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        lblValorCarteira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorCarteira.setForeground(new java.awt.Color(160, 205, 96));
        lblValorCarteira.setText("00,00");
        jPanel1.add(lblValorCarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        lblGR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGR.setForeground(new java.awt.Color(160, 205, 96));
        lblGR.setText("gr");
        jPanel1.add(lblGR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, -1));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(160, 205, 96));
        lblTotal.setText("Total");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator3.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 420, 20));

        txtDescartar.setBackground(new java.awt.Color(211, 211, 211));
        txtDescartar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescartarActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 100, 40));

        jSeparator4.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator4.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 420, 20));

        lblRAValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRAValor.setForeground(new java.awt.Color(160, 205, 96));
        lblRAValor.setText("RA 000000");
        jPanel1.add(lblRAValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btnHistorico.setBackground(new java.awt.Color(60, 60, 60));
        btnHistorico.setBorder(null);
        btnHistorico.setForeground(new java.awt.Color(206, 240, 157));
        btnHistorico.setText("Acessar Histórico");
        btnHistorico.setColor(new java.awt.Color(60, 60, 60));
        btnHistorico.setColorClick(new java.awt.Color(206, 240, 157));
        btnHistorico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHistorico.setRadius(30);
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 210, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecicloLogo_User.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, 430, 120));

        lblOla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOla.setForeground(new java.awt.Color(160, 205, 96));
        lblOla.setText("Olá,");
        jPanel1.add(lblOla, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        lblAluno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAluno.setForeground(new java.awt.Color(160, 205, 96));
        lblAluno.setText("Aluno");
        jPanel1.add(lblAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        lblCarteira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCarteira.setForeground(new java.awt.Color(160, 205, 96));
        lblCarteira.setText("Carteira");
        jPanel1.add(lblCarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(211, 211, 211));

        lblPontuacaoSQL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacaoSQL.setText("000000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblPontuacaoSQL)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPontuacaoSQL)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 140, 50));

        jPanel3.setBackground(new java.awt.Color(211, 211, 211));

        lblPontuacaoDescarteSQL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacaoDescarteSQL.setText("000000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblPontuacaoDescarteSQL)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPontuacaoDescarteSQL)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        lblPontuacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacao.setText("Pontuação");
        jPanel1.add(lblPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        lblPontuacao2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacao2.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacao2.setText("Pontuação");
        jPanel1.add(lblPontuacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

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

        setSize(new java.awt.Dimension(492, 820));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReciclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciclarActionPerformed
        TelaLoadingReciclando loadingreciclando = new TelaLoadingReciclando();
        this.setVisible(false);
        loadingreciclando.setVisible(true);
        //TODO Criar um insert no banco dados, preenchendo a quantidade (gramas) com o txt get text
       
    }//GEN-LAST:event_btnReciclarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        AlunoLoginView alunolog = new AlunoLoginView();
        this.setVisible(false);
        alunolog.setVisible(true);
        // Redireciona para tela de login do aluno
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        HistoricoAlunoView alunohist = new HistoricoAlunoView();
        this.setVisible(false);
        alunohist.setVisible(true);
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void txtDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescartarActionPerformed

    }//GEN-LAST:event_txtDescartarActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarteiraAlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.projectButton btnHistorico;
    private view.projectButton btnReciclar;
    private view.projectButton btnSair;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblCarteira;
    private javax.swing.JLabel lblDescartar;
    private javax.swing.JLabel lblDescarte;
    private javax.swing.JLabel lblGR;
    private javax.swing.JLabel lblOla;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblPontuacao2;
    private javax.swing.JLabel lblPontuacaoDescarteSQL;
    private javax.swing.JLabel lblPontuacaoSQL;
    private javax.swing.JLabel lblRAValor;
    private javax.swing.JLabel lblReal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValorCarteira;
    private javax.swing.JTextField txtDescartar;
    // End of variables declaration//GEN-END:variables
}
