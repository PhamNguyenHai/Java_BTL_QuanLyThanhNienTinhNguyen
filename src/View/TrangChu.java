/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author thong
 */
public class TrangChu extends javax.swing.JFrame {

    private static TrangChu instance;
    /**
     * Creates new form thong1
     */
    public TrangChu() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnDSDangKy = new javax.swing.JButton();
        btnQLSVTN = new javax.swing.JButton();
        btnQLHDTN = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("TRANG CHỦ");

        jButton1.setText("LỊCH ĐĂNG KÝ SINH VIÊN TÌNH NGUYỆN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDSDangKy.setText("DANH SÁCH ĐĂNG KÝ");
        btnDSDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSDangKyActionPerformed(evt);
            }
        });

        btnQLSVTN.setText("QUẢN LÝ SINH VIÊN TÌNH NGUYỆN");
        btnQLSVTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVTNActionPerformed(evt);
            }
        });

        btnQLHDTN.setText("QUẢN LÝ HOẠT ĐỘNG TÌNH NGUYỆN");
        btnQLHDTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHDTNActionPerformed(evt);
            }
        });

        jButton5.setText("QUẢN LÝ ĐÁNH GIÁ HOẠT ĐỘNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDSDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQLSVTN)
                            .addComponent(btnQLHDTN)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton5)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLSVTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDSDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLHDTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DangKyLichPhongVanView_ADMIN n= new DangKyLichPhongVanView_ADMIN();
        n.getInstance().setLocationRelativeTo(null);
        n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        n.getInstance().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDSDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSDangKyActionPerformed
        // TODO add your handling code here:
        System.out.println("DONE");
        DanhSachSVDangKyView_ADMIN n= new DanhSachSVDangKyView_ADMIN();
        n.getInstance().setLocationRelativeTo(null);
        n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        n.getInstance().setVisible(true);
    }//GEN-LAST:event_btnDSDangKyActionPerformed

    private void btnQLSVTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVTNActionPerformed
        // TODO add your handling code here:
        QuanLySinhVienTinhNguyenView_ADMIN n = new QuanLySinhVienTinhNguyenView_ADMIN();
        n.getInstance().setLocationRelativeTo(null);
        n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        n.getInstance().setVisible(true);
    }//GEN-LAST:event_btnQLSVTNActionPerformed
    private void btnQLHDTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHDTNActionPerformed
        QuanLyHoatDongTinhNguyenView_ADMIN qlhdtn = new QuanLyHoatDongTinhNguyenView_ADMIN();
        qlhdtn.setLocationRelativeTo(null);
        qlhdtn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        qlhdtn.setVisible(true);
    }//GEN-LAST:event_btnQLHDTNActionPerformed

    /**
     * @param args the command line arguments
     */
     public static TrangChu getInstance() {
        if (instance == null) {
            instance = new TrangChu();
        }
        return instance;
    }
     
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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDSDangKy;
    private javax.swing.JButton btnQLHDTN;
    private javax.swing.JButton btnQLSVTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
