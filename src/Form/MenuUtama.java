
package Form;

public class MenuUtama extends javax.swing.JFrame {

   
    public MenuUtama() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mplgn = new javax.swing.JMenuItem();
        mbrg = new javax.swing.JMenuItem();
        mksr = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnota = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pemrograman Visual");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1080, 50));

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistem Aplikasi Penjualan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1080, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1080, 720));

        jMenu3.setText("Master");
        jMenu3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        mplgn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        mplgn.setText("Pelanggan");
        mplgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mplgnActionPerformed(evt);
            }
        });
        jMenu3.add(mplgn);

        mbrg.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        mbrg.setText("Barang");
        mbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbrgActionPerformed(evt);
            }
        });
        jMenu3.add(mbrg);

        mksr.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        mksr.setText("Kasir");
        mksr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mksrActionPerformed(evt);
            }
        });
        jMenu3.add(mksr);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Transaksi");
        jMenu4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        mnota.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        mnota.setText("Nota");
        mnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnotaActionPerformed(evt);
            }
        });
        jMenu4.add(mnota);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mplgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mplgnActionPerformed
        // TODO add your handling code here:
        Pelanggan frmP = new Pelanggan();
        frmP.setVisible(true);
    }//GEN-LAST:event_mplgnActionPerformed

    private void mbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbrgActionPerformed
        Barang frmB = new Barang();
        frmB.setVisible(true);
    }//GEN-LAST:event_mbrgActionPerformed

    private void mksrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mksrActionPerformed
        // TODO add your handling code here:
        Kasir frmK = new Kasir();
        frmK.setVisible(true);
    }//GEN-LAST:event_mksrActionPerformed

    private void mnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnotaActionPerformed
        // TODO add your handling code here:
        Nota frmN = new Nota();
        frmN.setVisible(true);
    }//GEN-LAST:event_mnotaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mbrg;
    private javax.swing.JMenuItem mksr;
    private javax.swing.JMenuItem mnota;
    private javax.swing.JMenuItem mplgn;
    // End of variables declaration//GEN-END:variables
}
