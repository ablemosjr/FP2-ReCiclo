package view;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.TelaGeradoPontosView;

public class TelaLoadingReciclando extends javax.swing.JFrame {

    public TelaLoadingReciclando() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaLoadingReciclando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaLoadingReciclando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaLoadingReciclando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaLoadingReciclando.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        TelaGeradoPontosView pontos = new TelaGeradoPontosView();
        TelaRecicladoNaoAluno reciclado = new TelaRecicladoNaoAluno();
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
        new Thread(){
            public void run (){
                if (AlunoLoginView.infotela == "NaoAluno")
                {
                     try {
                    for(int i=0; i<101; i++){
                    Thread.sleep(60);
                    ProgressBar.setValue(i);
                    if(ProgressBar.getValue() <=25){
                        lblStatus.setText("Reciclando...");
                    
                    }
                    else if (ProgressBar.getValue()<=50){
                        lblStatus.setText("Aguarde...");
                    }
                        }
                    dispose();
                    reciclado.setVisible(true);
                    }catch(InterruptedException ex){
               
                    }
                }
                else
                {
                try {
                    for(int i=0; i<101; i++){
                    Thread.sleep(60);
                    ProgressBar.setValue(i);
                    if(ProgressBar.getValue() <=25){
                        lblStatus.setText("Reciclando...");
                    
                    }
                    else if (ProgressBar.getValue()<=50){
                        lblStatus.setText("Gerando seus pontos, aguarde...");
                    }
                        }
                    dispose();
                    pontos.setVisible(true);
                    }catch(InterruptedException ex){
               
                    }
                }
        }
    }.start();
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecicloLogo_User.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        ProgressBar.setBackground(new java.awt.Color(160, 205, 96));
        ProgressBar.setForeground(new java.awt.Color(160, 205, 96));
        ProgressBar.setStringPainted(true);
        jPanel1.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, 30));

        lblStatus.setBackground(new java.awt.Color(160, 205, 96));
        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeradoPontosView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
