package view;

public class CarteiraAlunoView extends javax.swing.JFrame {

    public CarteiraAlunoView() {
        initComponents();
        
        lblRAValor.setText("123456"); //TODO Valor do RA no banco de dados
        lblAluno.setText("Nome Aluno"); //TODO Nome do aluno no banco de dados
        lblValorCarteira.setText("12,34");//TODO Valor de quanto o aluno tem pra gastar no banco de dados
        lblPontuacaoSQL.setText("123456");//TODO Pontuacao total do aluno no banco de dados
        lblPontuacaoDescarteSQL.setText("15");//TODO Pontuacao descarte anterior do aluno no banco de dados


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblDescartar = new javax.swing.JLabel();
        lblDescarte = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblPontuacao = new javax.swing.JLabel();
        lblPontuacao2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblRAValor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSair = new model.projectButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCarteira = new javax.swing.JLabel();
        lblReal = new javax.swing.JLabel();
        lblValorCarteira = new javax.swing.JLabel();
        walletSpace = new model.projectTextField();
        lblAluno = new javax.swing.JLabel();
        btnReciclar = new model.projectButton();
        btnHistorico = new model.projectButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPontuacaoSQL = new model.projectTextField();
        jLabel4 = new javax.swing.JLabel();
        lblPontuacaoDescarteSQL = new model.projectTextField();
        txtDescartar = new model.projectTextField();
        jSeparator4 = new javax.swing.JSeparator();
        testReciclagem = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(480, 800));
        setUndecorated(true);
        setResizable(false);

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
        jPanel1.add(lblDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        lblDescarte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescarte.setForeground(new java.awt.Color(160, 205, 96));
        lblDescarte.setText("Descarte Anterior");
        jPanel1.add(lblDescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(160, 205, 96));
        lblTotal.setText("Total");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator3.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 420, 20));

        lblPontuacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacao.setText("Pontuação");
        jPanel1.add(lblPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        lblPontuacao2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacao2.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacao2.setText("Pontuação");
        jPanel1.add(lblPontuacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jPanel4.setBackground(new java.awt.Color(80, 80, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRAValor.setBackground(new java.awt.Color(80, 80, 80));
        lblRAValor.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblRAValor.setForeground(new java.awt.Color(160, 205, 96));
        jPanel4.add(lblRAValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 110, 30));

        jLabel2.setBackground(new java.awt.Color(80, 80, 80));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 205, 96));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Olá,");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 40, 30));

        btnSair.setBackground(new java.awt.Color(80, 80, 80));
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
        jPanel4.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-usuário-28.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 30));

        jLabel3.setBackground(new java.awt.Color(80, 80, 80));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(160, 205, 96));
        jLabel3.setText("RA");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 40, 30));

        lblCarteira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCarteira.setForeground(new java.awt.Color(160, 205, 96));
        lblCarteira.setText("Carteira");
        jPanel4.add(lblCarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 90, 30));

        lblReal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblReal.setForeground(new java.awt.Color(160, 205, 96));
        lblReal.setText("R$");
        jPanel4.add(lblReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 40, 40));

        lblValorCarteira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorCarteira.setForeground(new java.awt.Color(160, 205, 96));
        jPanel4.add(lblValorCarteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 60, 40));

        walletSpace.setEditable(false);
        walletSpace.setBackground(new java.awt.Color(75, 75, 75));
        jPanel4.add(walletSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 150, 100));

        lblAluno.setBackground(new java.awt.Color(80, 80, 80));
        lblAluno.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblAluno.setForeground(new java.awt.Color(160, 205, 96));
        lblAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAluno.setText("Aluno");
        lblAluno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(lblAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 160));

        btnReciclar.setBackground(new java.awt.Color(60, 60, 60));
        btnReciclar.setBorder(null);
        btnReciclar.setForeground(new java.awt.Color(206, 240, 157));
        btnReciclar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-sinal-de-reciclagem-50.png"))); // NOI18N
        btnReciclar.setToolTipText("");
        btnReciclar.setColor(new java.awt.Color(60, 60, 60));
        btnReciclar.setColorClick(new java.awt.Color(206, 240, 157));
        btnReciclar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReciclar.setRadius(40);
        btnReciclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciclarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReciclar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 90, 80));

        btnHistorico.setBackground(new java.awt.Color(60, 60, 60));
        btnHistorico.setBorder(null);
        btnHistorico.setForeground(new java.awt.Color(206, 240, 157));
        btnHistorico.setText("Acessar Histórico");
        btnHistorico.setToolTipText("");
        btnHistorico.setColor(new java.awt.Color(60, 60, 60));
        btnHistorico.setColorClick(new java.awt.Color(206, 240, 157));
        btnHistorico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHistorico.setRadius(40);
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 230, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(160, 205, 96));
        jLabel1.setText("gr");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(160, 205, 96));
        jLabel5.setText("pts");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 30, 30));

        lblPontuacaoSQL.setEditable(false);
        lblPontuacaoSQL.setBackground(new java.awt.Color(60, 60, 60));
        lblPontuacaoSQL.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacaoSQL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lblPontuacaoSQL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(lblPontuacaoSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(160, 205, 96));
        jLabel4.setText("pts");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 30, 30));

        lblPontuacaoDescarteSQL.setEditable(false);
        lblPontuacaoDescarteSQL.setBackground(new java.awt.Color(60, 60, 60));
        lblPontuacaoDescarteSQL.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacaoDescarteSQL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lblPontuacaoDescarteSQL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(lblPontuacaoDescarteSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 170, 70));

        txtDescartar.setBackground(new java.awt.Color(60, 60, 60));
        txtDescartar.setForeground(new java.awt.Color(160, 205, 96));
        txtDescartar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescartar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescartarActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 170, 80));

        jSeparator4.setBackground(new java.awt.Color(60, 60, 60));
        jSeparator4.setForeground(new java.awt.Color(70, 70, 70));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 480, 10));

        testReciclagem.setBackground(new java.awt.Color(60, 60, 60));
        testReciclagem.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        testReciclagem.setForeground(new java.awt.Color(150, 150, 150));
        testReciclagem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        testReciclagem.setToolTipText("");
        testReciclagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(testReciclagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 470, 30));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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


    private void btnReciclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciclarActionPerformed
                
        AlunoLoginView.infotela = "";

        testReciclagem.setText("");

        float valor = Integer.parseInt(txtDescartar.getText());
        
        if(valor > 0) {
            TelaLoadingReciclando loadingreciclando = new TelaLoadingReciclando();
            this.setVisible(false);
            loadingreciclando.setVisible(true);
            //TODO Criar um insert no banco dados, preenchendo a quantidade (gramas) com o txt get text
            
        } else {
            testReciclagem.setText("Não há produto para reciclar");
        }
    }//GEN-LAST:event_btnReciclarActionPerformed

    private void txtDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescartarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescartarActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarteiraAlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.projectButton btnHistorico;
    private model.projectButton btnReciclar;
    private model.projectButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblCarteira;
    private javax.swing.JLabel lblDescartar;
    private javax.swing.JLabel lblDescarte;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblPontuacao2;
    private model.projectTextField lblPontuacaoDescarteSQL;
    private model.projectTextField lblPontuacaoSQL;
    private javax.swing.JLabel lblRAValor;
    private javax.swing.JLabel lblReal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValorCarteira;
    private javax.swing.JLabel testReciclagem;
    private model.projectTextField txtDescartar;
    private model.projectTextField walletSpace;
    // End of variables declaration//GEN-END:variables
}
