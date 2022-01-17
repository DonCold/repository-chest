/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.start;

import java.awt.Color;
import com.game.Game;

/**
 *
 * @author luis1
 */
public class PlayerUI extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
    public PlayerUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_users = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        player_1 = new javax.swing.JPanel();
        input_player1 = new javax.swing.JTextField();
        label_player1 = new javax.swing.JLabel();
        imageBg = new javax.swing.JLabel();
        player_2 = new javax.swing.JPanel();
        input_player2 = new javax.swing.JTextField();
        label_player2 = new javax.swing.JLabel();
        imageBg1 = new javax.swing.JLabel();
        player_3 = new javax.swing.JPanel();
        input_player3 = new javax.swing.JTextField();
        label_player3 = new javax.swing.JLabel();
        imageBg2 = new javax.swing.JLabel();
        player_4 = new javax.swing.JPanel();
        input_player4 = new javax.swing.JTextField();
        label_player4 = new javax.swing.JLabel();
        imageBg3 = new javax.swing.JLabel();
        start_btn = new javax.swing.JPanel();
        start_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        BG_users.setBackground(new java.awt.Color(255, 255, 255));
        BG_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        title.setText("Carrera de Caballos");
        BG_users.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 230, 50));

        player_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_player1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        input_player1.setText("Usuario 1");
        input_player1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_player1FocusGained(evt);
            }
        });
        input_player1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input_player1MousePressed(evt);
            }
        });
        player_1.add(input_player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 40));

        label_player1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        label_player1.setForeground(new java.awt.Color(255, 255, 255));
        label_player1.setText("Jugador 1");
        player_1.add(label_player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 60));

        imageBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/img_player.jpg"))); // NOI18N
        imageBg.setText("jLabel1");
        player_1.add(imageBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 90));

        BG_users.add(player_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, -1));

        player_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_player2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        input_player2.setText("Usuario 2");
        input_player2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input_player2MousePressed(evt);
            }
        });
        player_2.add(input_player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 40));

        label_player2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        label_player2.setForeground(new java.awt.Color(255, 255, 255));
        label_player2.setText("Jugador 2");
        player_2.add(label_player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 60));

        imageBg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/img_player.jpg"))); // NOI18N
        imageBg1.setText("jLabel1");
        player_2.add(imageBg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 90));

        BG_users.add(player_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 230, 100));

        player_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_player3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        input_player3.setText("Usuario 3");
        input_player3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input_player3MousePressed(evt);
            }
        });
        player_3.add(input_player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 40));

        label_player3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        label_player3.setForeground(new java.awt.Color(255, 255, 255));
        label_player3.setText("Jugador 3");
        player_3.add(label_player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 60));

        imageBg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/img_player.jpg"))); // NOI18N
        imageBg2.setText("jLabel1");
        player_3.add(imageBg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 90));

        BG_users.add(player_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, 100));

        player_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_player4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        input_player4.setText("Usuario 4");
        input_player4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input_player4MousePressed(evt);
            }
        });
        player_4.add(input_player4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 40));

        label_player4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        label_player4.setForeground(new java.awt.Color(255, 255, 255));
        label_player4.setText("Jugador 4");
        player_4.add(label_player4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 60));

        imageBg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/img_player.jpg"))); // NOI18N
        imageBg3.setText("jLabel1");
        player_4.add(imageBg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 90));

        BG_users.add(player_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 230, -1));

        start_btn.setBackground(new java.awt.Color(153, 153, 255));
        start_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                start_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                start_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                start_btnMouseExited(evt);
            }
        });

        start_txt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        start_txt.setForeground(new java.awt.Color(255, 255, 255));
        start_txt.setText("Empezar");

        javax.swing.GroupLayout start_btnLayout = new javax.swing.GroupLayout(start_btn);
        start_btn.setLayout(start_btnLayout);
        start_btnLayout.setHorizontalGroup(
            start_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, start_btnLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(start_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        start_btnLayout.setVerticalGroup(
            start_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        BG_users.add(start_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_users, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_users, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseEntered
        start_btn.setBackground(new Color(140,140,255));
    }//GEN-LAST:event_start_btnMouseEntered

    private void start_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseExited
        start_btn.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_start_btnMouseExited

    private void start_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseClicked
        if("".equals(input_player1.getText()) || "".equals(input_player2.getText()) || "".equals(input_player3.getText()) || "".equals(input_player4.getText())) {
            javax.swing.JOptionPane.showMessageDialog(this, "Faltan Ingresar algunos Nombres!", "Horse Rase | Carrera de Caballos", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            String player1 = input_player1.getText();
            String player2 = input_player2.getText();
            String player3 = input_player3.getText();
            String player4 = input_player4.getText();

            if(player1.equals(player2) || player1.equals(player3) || player1.equals(player4)){
                javax.swing.JOptionPane.showMessageDialog(this, "El Jugador 1 Tiene un nombre repetido!", "Horse Rase | Carrera de Caballos", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (player2.equals(player3) || player2.equals(player4)) {
                javax.swing.JOptionPane.showMessageDialog(this, "El Jugador 2 Tiene un nombre repetido!", "Horse Rase | Carrera de Caballos", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (player3.equals(player4)) {
                javax.swing.JOptionPane.showMessageDialog(this, "El Jugador 3 Tiene un nombre repetido!", "Horse Rase | Carrera de Caballos", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                Game game1 = new Game(player1, player2, player3, player4);
                game1.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_start_btnMouseClicked

    private void input_player1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_player1MousePressed
        if(input_player1.getText().equals("Usuario 1")) {
            input_player1.setText("");
        }
    }//GEN-LAST:event_input_player1MousePressed

    private void input_player2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_player2MousePressed
        if(input_player2.getText().equals("Usuario 2")) {
            input_player2.setText("");
        }
    }//GEN-LAST:event_input_player2MousePressed

    private void input_player3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_player3MousePressed
        if(input_player3.getText().equals("Usuario 3")) {
            input_player3.setText("");
        }
    }//GEN-LAST:event_input_player3MousePressed

    private void input_player4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_player4MousePressed
        if(input_player4.getText().equals("Usuario 4")) {
            input_player4.setText("");
        }
    }//GEN-LAST:event_input_player4MousePressed

    private void input_player1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_player1FocusGained
        if(input_player1.getText().equals("Usuario 1")) {
            input_player1.setText("");
        }
    }//GEN-LAST:event_input_player1FocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_users;
    private javax.swing.JLabel imageBg;
    private javax.swing.JLabel imageBg1;
    private javax.swing.JLabel imageBg2;
    private javax.swing.JLabel imageBg3;
    private javax.swing.JTextField input_player1;
    private javax.swing.JTextField input_player2;
    private javax.swing.JTextField input_player3;
    private javax.swing.JTextField input_player4;
    private javax.swing.JLabel label_player1;
    private javax.swing.JLabel label_player2;
    private javax.swing.JLabel label_player3;
    private javax.swing.JLabel label_player4;
    private javax.swing.JPanel player_1;
    private javax.swing.JPanel player_2;
    private javax.swing.JPanel player_3;
    private javax.swing.JPanel player_4;
    private javax.swing.JPanel start_btn;
    private javax.swing.JLabel start_txt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
