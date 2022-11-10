package main;

import view.AlunoLoginView;

public class Main {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new AlunoLoginView().setVisible(true);
            }
        });
    }
}