package view;


public class HistoricoAlunoView extends javax.swing.JFrame {

    public HistoricoAlunoView() {
        initComponents();
        lblAlunoHistorico.setText("Aluno");//TODO nome do aluno no banco de dados
        lblRAValorHistorico.setText("000000");//TODO numero do RA do aluno no banco de dados 
        lblPontuacaoTotalSQL.setText("000000");//TODO numero de pontos total do aluno no banco de dados
        lblPontuacaoConvertidaSQL.setText("000000");//TODO numero de pontos total convertidos do aluno no banco de dados
        lblData1.setText("01/01/2022");//TODO data de troca (exemplo 1) de reciclagem do aluno no banco de dados
        lblData2.setText("02/02/2022");//TODO data de troca (exemplo 2) de reciclagem do aluno no banco de dados
        lblData3.setText("03/03/2022");//TODO data de troca (exemplo 3) de reciclagem do aluno no banco de dados
        lblMaterial1.setText("Plástico");//TODO material trocado (exemplo 1 "plastico") do aluno no banco de dados
        lblMaterial2.setText("Plástico");//TODO material trocado (exemplo 2 "plastico") do aluno no banco de dados
        lblMaterial3.setText("Plástico");//TODO material trocado (exemplo 3 "plastico") do aluno no banco de dados
        lblQuantidade1.setText("200");//TODO quantidade de plastico em gramas trocado (exemplo 1) do aluno no banco de dados
        lblQuantidade2.setText("150");//TODO quantidade de plastico em gramas trocado (exemplo 2) do aluno no banco de dados
        lblQuantidade3.setText("178");//TODO quantidade de plastico em gramas trocado (exemplo 3) do aluno no banco de dados
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        lblDescartar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSairHistorico = new view.projectButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblRAValorHistorico = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHistorico = new javax.swing.JLabel();
        lblAlunoHistorico = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblData1 = new javax.swing.JLabel();
        lblQuantidade1 = new javax.swing.JLabel();
        lblMaterial1 = new javax.swing.JLabel();
        lblGR1 = new javax.swing.JLabel();
        lblData2 = new javax.swing.JLabel();
        lblMaterial2 = new javax.swing.JLabel();
        lblQuantidade2 = new javax.swing.JLabel();
        lblGR2 = new javax.swing.JLabel();
        lblData3 = new javax.swing.JLabel();
        lblMaterial3 = new javax.swing.JLabel();
        lblQuantidade3 = new javax.swing.JLabel();
        lblGR3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPontuacaoConvertidaSQL = new javax.swing.JLabel();
        btnReturnHistorico = new view.projectButton();
        lblPontuacao1 = new javax.swing.JLabel();
        lblDescartar1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPontuacaoTotalSQL = new javax.swing.JLabel();
        lblPontuacao2 = new javax.swing.JLabel();

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
        lblDescartar.setText("convertidos");
        jPanel1.add(lblDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-usuário-28.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 30, 30));

        btnSairHistorico.setBackground(new java.awt.Color(60, 60, 60));
        btnSairHistorico.setBorder(null);
        btnSairHistorico.setForeground(new java.awt.Color(206, 240, 157));
        btnSairHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-x-45.png"))); // NOI18N
        btnSairHistorico.setColor(new java.awt.Color(60, 60, 60));
        btnSairHistorico.setColorClick(new java.awt.Color(206, 240, 157));
        btnSairHistorico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSairHistorico.setRadius(30);
        btnSairHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairHistoricoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSairHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 50));

        jSeparator3.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator3.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 420, 20));

        jSeparator4.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator4.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 420, 20));

        lblRAValorHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRAValorHistorico.setForeground(new java.awt.Color(160, 205, 96));
        lblRAValorHistorico.setText("RA 000000");
        jPanel1.add(lblRAValorHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecicloLogo_User.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, 430, 120));

        lblHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHistorico.setForeground(new java.awt.Color(160, 205, 96));
        lblHistorico.setText("Histórico de Reciclagem");
        jPanel1.add(lblHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblAlunoHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAlunoHistorico.setForeground(new java.awt.Color(160, 205, 96));
        lblAlunoHistorico.setText("Aluno");
        jPanel1.add(lblAlunoHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(211, 211, 211));

        lblData1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblData1.setText("Data");

        lblQuantidade1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantidade1.setText("Quantidade");

        lblMaterial1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMaterial1.setText("Material");

        lblGR1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGR1.setText("gr");

        lblData2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblData2.setText("Data");

        lblMaterial2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMaterial2.setText("Material");

        lblQuantidade2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantidade2.setText("Quantidade");

        lblGR2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGR2.setText("gr");

        lblData3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblData3.setText("Data");

        lblMaterial3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMaterial3.setText("Material");

        lblQuantidade3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantidade3.setText("Quantidade");

        lblGR3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGR3.setText("gr");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblData3)
                        .addGap(35, 35, 35)
                        .addComponent(lblMaterial3)
                        .addGap(42, 42, 42)
                        .addComponent(lblQuantidade3)
                        .addGap(18, 18, 18)
                        .addComponent(lblGR3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblData2)
                        .addGap(35, 35, 35)
                        .addComponent(lblMaterial2)
                        .addGap(42, 42, 42)
                        .addComponent(lblQuantidade2)
                        .addGap(18, 18, 18)
                        .addComponent(lblGR2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblData1)
                        .addGap(35, 35, 35)
                        .addComponent(lblMaterial1)
                        .addGap(42, 42, 42)
                        .addComponent(lblQuantidade1)
                        .addGap(18, 18, 18)
                        .addComponent(lblGR1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData1)
                    .addComponent(lblMaterial1)
                    .addComponent(lblQuantidade1)
                    .addComponent(lblGR1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData2)
                    .addComponent(lblMaterial2)
                    .addComponent(lblQuantidade2)
                    .addComponent(lblGR2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData3)
                    .addComponent(lblMaterial3)
                    .addComponent(lblQuantidade3)
                    .addComponent(lblGR3))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 400, 300));

        jPanel3.setBackground(new java.awt.Color(211, 211, 211));

        lblPontuacaoConvertidaSQL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacaoConvertidaSQL.setText("000000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblPontuacaoConvertidaSQL)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPontuacaoConvertidaSQL)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 700, -1, -1));

        btnReturnHistorico.setBackground(new java.awt.Color(60, 60, 60));
        btnReturnHistorico.setBorder(null);
        btnReturnHistorico.setForeground(new java.awt.Color(206, 240, 157));
        btnReturnHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-retornar-45.png"))); // NOI18N
        btnReturnHistorico.setColor(new java.awt.Color(60, 60, 60));
        btnReturnHistorico.setColorClick(new java.awt.Color(206, 240, 157));
        btnReturnHistorico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReturnHistorico.setRadius(30);
        btnReturnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnHistoricoActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturnHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 50, 50));

        lblPontuacao1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacao1.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacao1.setText("Sua pontuação");
        jPanel1.add(lblPontuacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, -1));

        lblDescartar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescartar1.setForeground(new java.awt.Color(160, 205, 96));
        lblDescartar1.setText("total");
        jPanel1.add(lblDescartar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, -1, -1));

        jPanel4.setBackground(new java.awt.Color(211, 211, 211));

        lblPontuacaoTotalSQL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacaoTotalSQL.setText("000000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblPontuacaoTotalSQL)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPontuacaoTotalSQL)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, -1, -1));

        lblPontuacao2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacao2.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacao2.setText("Pontos");
        jPanel1.add(lblPontuacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, -1, -1));

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

    private void btnSairHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairHistoricoActionPerformed
        AlunoLoginView alunolog = new AlunoLoginView();
        this.setVisible(false);
        alunolog.setVisible(true);
        // Redireciona para tela de login do aluno
    }//GEN-LAST:event_btnSairHistoricoActionPerformed

    private void btnReturnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnHistoricoActionPerformed

        // Redireciona para a carteira do aluno
        CarteiraAlunoView carteiraaluno = new CarteiraAlunoView();
        this.setVisible(false);
        carteiraaluno.setVisible(true);
    }//GEN-LAST:event_btnReturnHistoricoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoAlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.projectButton btnReturnHistorico;
    private view.projectButton btnSairHistorico;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAlunoHistorico;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblData3;
    private javax.swing.JLabel lblDescartar;
    private javax.swing.JLabel lblDescartar1;
    private javax.swing.JLabel lblGR1;
    private javax.swing.JLabel lblGR2;
    private javax.swing.JLabel lblGR3;
    private javax.swing.JLabel lblHistorico;
    private javax.swing.JLabel lblMaterial1;
    private javax.swing.JLabel lblMaterial2;
    private javax.swing.JLabel lblMaterial3;
    private javax.swing.JLabel lblPontuacao1;
    private javax.swing.JLabel lblPontuacao2;
    private javax.swing.JLabel lblPontuacaoConvertidaSQL;
    private javax.swing.JLabel lblPontuacaoTotalSQL;
    private javax.swing.JLabel lblQuantidade1;
    private javax.swing.JLabel lblQuantidade2;
    private javax.swing.JLabel lblQuantidade3;
    private javax.swing.JLabel lblRAValorHistorico;
    // End of variables declaration//GEN-END:variables
}
