/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import raven.toast.Notifications;

/**
 *
 * @author Dilshan Shanaka
 */
public class SpalshWindow extends javax.swing.JFrame {

    private static SpalshWindow spalshWindow;

    public SpalshWindow() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        loading();
        Notifications.getInstance().setJFrame(null);
    }

    private void loading() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    jProgressBar1.setValue(i);

                    switch (i) {
                        case 10 -> {
                            String MG = "Please Waiting.";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 11 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 12 -> {
                            String MG = "Please Waiting...";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 13 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 14 -> {
                            String MG = "Please Waiting.";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 15 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 16 -> {
                            String MG = "Please Waiting...";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 20 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                                noS(MG);
                        }
                        case 25 -> {
                            String MG = "Please Waiting.";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 30 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 35 -> {
                            String MG = "Please Waiting...";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 40 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 45 -> {
                            String MG = "Please Waiting.";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 50 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 55 -> {
                            String MG = "Please Waiting...";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 60 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 65 -> {
                            String MG = "Please Waiting.";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 70 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 75 -> {
                            String MG = "Please Waiting...";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 80 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 85 -> {
                            String MG = "Please Waiting.";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 90 -> {
                            String MG = "Please Waiting..";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        case 95 -> {
                            String MG = "Done........";
                            loadingText.setText(MG);
//                        noS(MG);
                        }
                        default -> {
                        }
                    }
                    
                    
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
                
                spalshWindow.dispose();
                new LogIn().setVisible(true);
                
            }
        });
        t.start();
    }

    private void noS(String mg) {
        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_RIGHT, 1000, mg);
    }

    private void noW(String mg) {
        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_RIGHT, 1000, mg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        loadingText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resorce/Image/GIF/VwCJ-ezgif.com-resize.gif"))); // NOI18N

        jProgressBar1.setForeground(new java.awt.Color(0, 51, 255));

        loadingText.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        loadingText.setText("Loading......................");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addComponent(loadingText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingText)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                spalshWindow = new SpalshWindow();
                spalshWindow.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel loadingText;
    // End of variables declaration//GEN-END:variables
}
