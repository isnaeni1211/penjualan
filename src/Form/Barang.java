
package Form;
import java.sql.*; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel; 
import Koneksi.koneksi;
import java.awt.event.KeyEvent;

public class Barang extends javax.swing.JFrame {
private Connection conn = new koneksi().connect(); 
private DefaultTableModel tabmode;
   
    public Barang() {
        initComponents();
        kosong(); 
        aktif(); 
        datatable();
    }

        protected void aktif () { 
        txtkd.requestFocus(); 
        cbjenis.setSelectedItem(null);
    } 
    protected void kosong() { 
        txtkd.setText(""); 
        txtnmbrg.setText(""); 
        txthb.setText("");
        txthj.setText("");
        txtcarik.setText("");
        cbjenis.setSelectedItem(null);
    }
    
    protected void datatable() { 
        Object[] Baris ={"Kode Barang", "Nama Barang", "Jenis ", "Harga Beli", "Harga Jual"}; 
            tabmode = new DefaultTableModel (null, Baris); 
            //tablebarang.setModel(tabmode); 
            String cariitem=txtcarik.getText();
            
            try { 
            String sql = "select * from barang where kdbrg like '%"+cariitem+"%' or nmbrg like '%"+cariitem+"%' order by kdbrg asc";
            Statement stat = conn.createStatement(); 
            ResultSet hasil = stat.executeQuery(sql); 
            while (hasil.next()) { 
                tabmode.addRow (new Object[]{ 
                    hasil.getString(1), 
                    hasil.getString(2), 
                    hasil.getString(3), 
                    hasil.getString(4), 
                    hasil.getString(5)
      
                }); 
            }
            tblbarang.setModel(tabmode); 
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtkd = new javax.swing.JTextField();
        bhapusk = new javax.swing.JButton();
        txtnmbrg = new javax.swing.JTextField();
        bbatalk = new javax.swing.JButton();
        bkeluark = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txthj = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtcarik = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblbarang = new javax.swing.JTable();
        bcarik = new javax.swing.JButton();
        txthb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bsimpank = new javax.swing.JButton();
        bubahk = new javax.swing.JButton();
        cbjenis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(502, 587));
        setPreferredSize(new java.awt.Dimension(502, 587));
        setSize(new java.awt.Dimension(502, 587));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtkd.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txtkd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 210, 30));

        bhapusk.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        bhapusk.setText("Hapus");
        bhapusk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapuskActionPerformed(evt);
            }
        });
        getContentPane().add(bhapusk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 80, -1));

        txtnmbrg.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txtnmbrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 210, 30));

        bbatalk.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        bbatalk.setText("Batal");
        bbatalk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalkActionPerformed(evt);
            }
        });
        getContentPane().add(bbatalk, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 80, -1));

        bkeluark.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        bkeluark.setText("Keluar");
        bkeluark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarkActionPerformed(evt);
            }
        });
        getContentPane().add(bkeluark, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 80, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        jLabel9.setText("Data Barang");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txthj.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txthj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthjActionPerformed(evt);
            }
        });
        getContentPane().add(txthj, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcarik.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        txtcarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcarikActionPerformed(evt);
            }
        });
        txtcarik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcarikKeyPressed(evt);
            }
        });
        jPanel2.add(txtcarik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 108, -1));

        tblbarang.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        tblbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbarangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblbarang);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 41, 450, 150));

        bcarik.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        bcarik.setText("Cari");
        bcarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcarikActionPerformed(evt);
            }
        });
        jPanel2.add(bcarik, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 470, 205));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        txthb.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        getContentPane().add(txthb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 210, 30));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA BARANG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 11, 510, 50));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel2.setText("Kode Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 30));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 30));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel4.setText("Jenis Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 30));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel5.setText("Harga Jual");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 30));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel6.setText("Harga Beli");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        bsimpank.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        bsimpank.setText("Simpan");
        bsimpank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpankActionPerformed(evt);
            }
        });
        getContentPane().add(bsimpank, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, -1));

        bubahk.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        bubahk.setText("Ubah");
        bubahk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahkActionPerformed(evt);
            }
        });
        getContentPane().add(bubahk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 80, -1));

        cbjenis.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAKANAN", "MINUMAN" }));
        getContentPane().add(cbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, 30));

        setSize(new java.awt.Dimension(518, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bhapuskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapuskActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "hapus", "konfirmasi dialog", JOptionPane.YES_NO_OPTION);
        if (ok==0) {
            String sql = "delete from barang where kdbrg ='"+txtkd.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                txtkd.requestFocus();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
            }
            datatable();
        }
    }//GEN-LAST:event_bhapuskActionPerformed

    private void bbatalkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalkActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_bbatalkActionPerformed

    private void bkeluarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarkActionPerformed
        dispose();
    }//GEN-LAST:event_bkeluarkActionPerformed

    private void txthjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthjActionPerformed

    private void tblbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbarangMouseClicked
        int bar = tblbarang.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
 
        txtkd.setText(a);
        txtnmbrg.setText(b);
        cbjenis.setSelectedItem(null);
        txthb.setText(d);
        txthj.setText(e);

    }//GEN-LAST:event_tblbarangMouseClicked

    private void bsimpankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpankActionPerformed
        String sql = "insert into barang values (?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtkd.getText()); 
            stat.setString(2, txtnmbrg.getText()); 
            stat.setString(3, cbjenis.getSelectedItem().toString()); 
            stat.setString(4, txthb.getText()); 
            stat.setString(5, txthj.getText()); 

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            kosong();
            txtkd.requestFocus();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan"+e);
        }
        datatable();
    }//GEN-LAST:event_bsimpankActionPerformed

    private void bubahkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahkActionPerformed
        try{
            String sql = "update barang set nmbrg=?,jenis=?,hargabeli=?,hargajual=? where kdbrg='"+txtkd.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnmbrg.getText());
            stat.setString(2, cbjenis.getSelectedItem().toString());
            stat.setString(3, txthb.getText());
            stat.setString(4, txthj.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            kosong();
            txtkd.requestFocus();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal diubah"+e);
        }
        datatable();
    }//GEN-LAST:event_bubahkActionPerformed

    private void txtcarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcarikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcarikActionPerformed

    private void txtcarikKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcarikKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
        datatable(); 
        }
    }//GEN-LAST:event_txtcarikKeyPressed

    private void bcarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcarikActionPerformed
        // TODO add your handling code here:
        datatable();
    }//GEN-LAST:event_bcarikActionPerformed

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
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatalk;
    private javax.swing.JButton bcarik;
    private javax.swing.JButton bhapusk;
    private javax.swing.JButton bkeluark;
    private javax.swing.JButton bsimpank;
    private javax.swing.JButton bubahk;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblbarang;
    private javax.swing.JTextField txtcarik;
    private javax.swing.JTextField txthb;
    private javax.swing.JTextField txthj;
    private javax.swing.JTextField txtkd;
    private javax.swing.JTextField txtnmbrg;
    // End of variables declaration//GEN-END:variables
}
