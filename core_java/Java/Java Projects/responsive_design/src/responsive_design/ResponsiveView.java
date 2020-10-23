/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsive_design;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author HP
 */
public class ResponsiveView extends javax.swing.JFrame {

    /**
     * Creates new form ResponsiveView
     */
    boolean a = true;

    public ResponsiveView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        rightCom = new javax.swing.JPanel();
        menuIcon = new javax.swing.JPanel();
        line = new javax.swing.JPanel();
        menubarRightarrow = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tabelHide = new javax.swing.JPanel();
        leftCom = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setBackground(new java.awt.Color(0, 0, 51));
        header.setPreferredSize(new java.awt.Dimension(900, 70));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        rightCom.setPreferredSize(new java.awt.Dimension(500, 530));
        rightCom.setLayout(new java.awt.BorderLayout());

        menuIcon.setBackground(new java.awt.Color(0, 0, 51));
        menuIcon.setPreferredSize(new java.awt.Dimension(50, 530));
        menuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        line.setBackground(new java.awt.Color(204, 204, 204));
        line.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        menuIcon.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        menubarRightarrow.setBackground(new java.awt.Color(204, 204, 255));
        menubarRightarrow.setLayout(new java.awt.BorderLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        menubarRightarrow.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menubarRightarrow.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        menuIcon.add(menubarRightarrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        rightCom.add(menuIcon, java.awt.BorderLayout.LINE_END);

        tabelHide.setBackground(new java.awt.Color(0, 51, 102));
        tabelHide.setPreferredSize(new java.awt.Dimension(50, 530));

        javax.swing.GroupLayout tabelHideLayout = new javax.swing.GroupLayout(tabelHide);
        tabelHide.setLayout(tabelHideLayout);
        tabelHideLayout.setHorizontalGroup(
            tabelHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabelHideLayout.setVerticalGroup(
            tabelHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        rightCom.add(tabelHide, java.awt.BorderLayout.CENTER);

        getContentPane().add(rightCom, java.awt.BorderLayout.LINE_END);

        leftCom.setBackground(new java.awt.Color(204, 204, 255));
        leftCom.setPreferredSize(new java.awt.Dimension(450, 530));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Welcome Maria Jannat!!");

        javax.swing.GroupLayout leftComLayout = new javax.swing.GroupLayout(leftCom);
        leftCom.setLayout(leftComLayout);
        leftComLayout.setHorizontalGroup(
            leftComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftComLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        leftComLayout.setVerticalGroup(
            leftComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftComLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        getContentPane().add(leftCom, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(922, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    public void clickMenu(JPanel h1, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(25, 29, 74));
//        h2 .setBackground(new Color (5,10,46));
        } else {
            h1.setBackground(new Color(5, 10, 46));
//        h2 .setBackground(new Color (25,29,74));        
        }
    }

    public void showhide(JPanel rightComshowhide, boolean leftcom) {
        if (leftcom == true) {
            rightComshowhide.setPreferredSize(new Dimension(50, rightComshowhide.getHeight()));
        } else {
            rightComshowhide.setPreferredSize(new Dimension(500, rightComshowhide.getHeight()));
        }
    }

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        changecolor(line, new Color(247, 78, 105));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        clickMenu(line, 1);
        if (a == true) {
            showhide(rightCom, a);
            SwingUtilities.updateComponentTreeUI(this);
            a = false;
        } else {
            showhide(rightCom, a);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;
        }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        changecolor(line, new Color(5, 10, 46));
    }//GEN-LAST:event_jLabel1MouseExited

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
            java.util.logging.Logger.getLogger(ResponsiveView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResponsiveView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResponsiveView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResponsiveView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResponsiveView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel leftCom;
    private javax.swing.JPanel line;
    private javax.swing.JPanel menuIcon;
    private javax.swing.JPanel menubarRightarrow;
    private javax.swing.JPanel rightCom;
    private javax.swing.JPanel tabelHide;
    // End of variables declaration//GEN-END:variables
}
