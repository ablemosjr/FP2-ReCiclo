package view;

import javax.swing.table.DefaultTableModel;

public class HistoricoAlunoView extends javax.swing.JFrame {

    public HistoricoAlunoView() {
        initComponents();
        
        tabela.fixTable(jScrollPane1);
        
        lblAlunoHistorico.setText("Nome Aluno");//TODO nome do aluno no banco de dados
        lblRAValorHistorico.setText("123456");//TODO numero do RA do aluno no banco de dados 
        lblPontuacaoTotalSQL.setText("123456");//TODO numero de pontos total do aluno no banco de dados
        lblPontuacaoConvertidaSQL.setText("123789");//TODO numero de pontos total convertidos do aluno no banco de dados
     
        DefaultTableModel mode = (DefaultTableModel) tabela.getModel();
        for(int i = 1; i <= 20; i++) {
            mode.addRow(new Object[]{"01/01/0001", "10", "20", "0,30"});
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        lblDescartar = new javax.swing.JLabel();

        jSeparator4 = new javax.swing.JSeparator();
        lblPontuacao1 = new javax.swing.JLabel();
        lblDescartar1 = new javax.swing.JLabel();
        lblPontuacao2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblHistorico = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAlunoHistorico = new javax.swing.JLabel();
        lblRAValorHistorico = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        btnReturnHistorico = new model.projectButton();
        btnSair = new model.projectButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new model.projectTable();
        jLabel5 = new javax.swing.JLabel();
        lblPontuacaoConvertidaSQL = new model.projectTextField();
        jLabel7 = new javax.swing.JLabel();
        lblPontuacaoTotalSQL = new model.projectTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
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
        lblDescartar.setText("convertidos");

        jPanel1.add(lblDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator4.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 420, 20));

        lblPontuacao1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacao1.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacao1.setText("Sua pontuação");
        jPanel1.add(lblPontuacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, -1));

        lblDescartar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescartar1.setForeground(new java.awt.Color(160, 205, 96));
        lblDescartar1.setText("total");
        jPanel1.add(lblDescartar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, -1, -1));

        lblPontuacao2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPontuacao2.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacao2.setText("Pontos");
        jPanel1.add(lblPontuacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, -1, -1));

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHistorico.setForeground(new java.awt.Color(160, 205, 96));
        lblHistorico.setText("Histórico de Reciclagem");

        jPanel5.add(lblHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-usuário-28.png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 30, 30));

        lblAlunoHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAlunoHistorico.setForeground(new java.awt.Color(160, 205, 96));
        jPanel5.add(lblAlunoHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 180, 30));

        lblRAValorHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRAValorHistorico.setForeground(new java.awt.Color(160, 205, 96));
        jPanel5.add(lblRAValorHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 120, 30));

        txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt.setForeground(new java.awt.Color(160, 205, 96));
        txt.setText("RA");
        jPanel5.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 30, 30));

        btnReturnHistorico.setBorder(null);
        btnReturnHistorico.setForeground(new java.awt.Color(206, 240, 157));
        btnReturnHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-retornar-45.png"))); // NOI18N
        btnReturnHistorico.setColor(new java.awt.Color(80, 80, 80));
        btnReturnHistorico.setColorClick(new java.awt.Color(206, 240, 157));

        btnReturnHistorico.setRadius(30);
        btnReturnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnHistoricoActionPerformed(evt);
            }
        });

        jPanel5.add(btnReturnHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 50, 50));

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
        jPanel5.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 160));

        tabela.setBackground(new java.awt.Color(70, 70, 70));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Quantidade", "Pontuação", "Valor (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 480, 420));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(160, 205, 96));
        jLabel5.setText("pts");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 710, 30, 30));

        lblPontuacaoConvertidaSQL.setEditable(false);
        lblPontuacaoConvertidaSQL.setBackground(new java.awt.Color(60, 60, 60));
        lblPontuacaoConvertidaSQL.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacaoConvertidaSQL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lblPontuacaoConvertidaSQL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(lblPontuacaoConvertidaSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 690, 170, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(160, 205, 96));
        jLabel7.setText("pts");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 30, 30));

        lblPontuacaoTotalSQL.setEditable(false);
        lblPontuacaoTotalSQL.setBackground(new java.awt.Color(60, 60, 60));
        lblPontuacaoTotalSQL.setForeground(new java.awt.Color(160, 205, 96));
        lblPontuacaoTotalSQL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lblPontuacaoTotalSQL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(lblPontuacaoTotalSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 170, 70));

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

    private void btnReturnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnHistoricoActionPerformed

        // Redireciona para a carteira do aluno
        CarteiraAlunoView carteiraaluno = new CarteiraAlunoView();
        this.setVisible(false);
        carteiraaluno.setVisible(true);
    }//GEN-LAST:event_btnReturnHistoricoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        AlunoLoginView alunolog = new AlunoLoginView();
        this.setVisible(false);
        alunolog.setVisible(true);
        // Redireciona para tela de login do aluno
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoAlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private model.projectButton btnReturnHistorico;
    private model.projectButton btnSair;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAlunoHistorico;
    private javax.swing.JLabel lblDescartar;
    private javax.swing.JLabel lblDescartar1;
    private javax.swing.JLabel lblHistorico;
    private javax.swing.JLabel lblPontuacao1;
    private javax.swing.JLabel lblPontuacao2;
    private model.projectTextField lblPontuacaoConvertidaSQL;
    private model.projectTextField lblPontuacaoTotalSQL;
    private javax.swing.JLabel lblRAValorHistorico;
    private model.projectTable tabela;
    private javax.swing.JLabel txt;

    // End of variables declaration//GEN-END:variables
}
