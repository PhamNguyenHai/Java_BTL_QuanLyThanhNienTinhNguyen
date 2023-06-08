package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import qlsinhvientinhnguyen.HoatDong;
import qlsinhvientinhnguyen.Models;
import qlsinhvientinhnguyen.SinhVien;
import qlsinhvientinhnguyen.SinhVienTinhNguyen;

public class DSHoatDongTN extends javax.swing.JFrame {

    Models model = new Models();

    public DSHoatDongTN() {
        initComponents();
        try {
            model.Import();
            ArrayList<SinhVienTinhNguyen> dssvtn = new ArrayList<SinhVienTinhNguyen>();
            for (SinhVien i : model.getListSinhViens()) {
                if (i instanceof SinhVienTinhNguyen) {
                    dssvtn.add((SinhVienTinhNguyen) i);
                }
            }

            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void loadTable() {
        DefaultTableModel modelTable = (DefaultTableModel) DSHoatDongTable.getModel();
        int dem = 0;
        for (HoatDong i : model.getListHoatDongs()) {
            modelTable.addRow(new Object[]{
                ++dem, i.getTenHD(), i.getNgayBatDau(), i.getMoTa(), i.getNguoiQuanLy(), i.getChiPhiHoTro()
            });
        }
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
        btnSearch = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        btnQuayLai = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DSHoatDongTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DANH SÁCH HOẠT ĐỘNG TÌNH NGUYỆN");

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        DSHoatDongTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Hoạt động", "Ngày bắt đầu", "Mô tả", "Người quản lý", "Chi phí hỗ trợ", "Danh sách đánh giá"
            }
        ));
        jScrollPane2.setViewportView(DSHoatDongTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQuayLai)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(btnSearch)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 854, Short.MAX_VALUE))))
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(248, 248, 248)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btnQuayLai)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        new TrangChu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearch.getText().trim(); // Lấy từ khóa tìm kiếm từ JTextField và loại bỏ khoảng trắng thừa

        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel modelTable = (DefaultTableModel) DSHoatDongTable.getModel();
        modelTable.setRowCount(0); // Xóa tất cả các dòng trong bảng trước khi tìm kiếm

        int dem = 0;
        boolean foundResult = false;
        for (HoatDong i : model.getListHoatDongs()) {
            if (i.getTenHD().toLowerCase().contains(keyword.toLowerCase())) {
                // Nếu tên hoạt động chứa từ khóa tìm kiếm (không phân biệt chữ hoa, chữ thường)
                modelTable.addRow(new Object[]{
                    ++dem, i.getTenHD(), i.getNgayBatDau(), i.getMoTa(), i.getNguoiQuanLy(), i.getChiPhiHoTro()
                });
                foundResult = true;
            }
        }

        if (!foundResult) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả phù hợp.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(DSHoatDongTN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSHoatDongTN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSHoatDongTN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSHoatDongTN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSHoatDongTN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DSHoatDongTable;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSearch;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
