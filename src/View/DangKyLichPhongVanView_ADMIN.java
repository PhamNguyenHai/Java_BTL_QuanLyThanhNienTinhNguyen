/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.toedter.calendar.JDateChooser;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;
import qlsinhvientinhnguyen.Models;
import qlsinhvientinhnguyen.PhongVan;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class DangKyLichPhongVanView_ADMIN extends javax.swing.JFrame {

    Models model = new Models();
    PhongVan pv = new PhongVan();
    int dong = -1;

    /**
     * Creates new form DangKyLichPhongVanView_ADMIN
     */
    public DangKyLichPhongVanView_ADMIN() {
        initComponents();
        try {
            model.Import();
            loadTableLichDangKy();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void pt_XuatFileExcel(JTable table) throws IOException {
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("People");

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
        jLabel2 = new javax.swing.JLabel();
        cbSapXep = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLichDangKy_Admin = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPhong = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        themBtn = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        thongKeBtn = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        txtNgayPV = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Lịch đăng ký phỏng vấn sinh viên tình nguyện");

        jLabel2.setText("Sắp xếp");

        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày phỏng vấn", "Số lượng" }));
        cbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepActionPerformed(evt);
            }
        });

        tableLichDangKy_Admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ngày phỏng vấn", "Phòng", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableLichDangKy_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLichDangKy_Admin);
        if (tableLichDangKy_Admin.getColumnModel().getColumnCount() > 0) {
            tableLichDangKy_Admin.getColumnModel().getColumn(0).setMinWidth(45);
            tableLichDangKy_Admin.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        jLabel3.setText("Ngày phỏng vấn");

        jLabel4.setText("Phòng");

        jLabel5.setText("Số lượng");

        themBtn.setText("Thêm lịch đăng ký");
        themBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themBtnActionPerformed(evt);
            }
        });

        xoa.setText("Xóa lịch đăng ký");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        thongKeBtn.setText("Thống kê");
        thongKeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongKeBtnActionPerformed(evt);
            }
        });

        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(336, 336, 336))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPhong)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtNgayPV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(themBtn)
                            .addComponent(xoa)
                            .addComponent(thongKeBtn)
                            .addComponent(thoat)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtNgayPV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addComponent(themBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thongKeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thoat)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thongKeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongKeBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_thongKeBtnActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_thoatActionPerformed

    // Thêm một phỏng vấn
    private void themBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themBtnActionPerformed
        // TODO add your handling code here:
        try {
            if (txtNgayPV.getDate() == null || "".equals(txtSoLuong.getText()) || "".equals(txtPhong.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Chua du thong tin de them", "Thong Bao", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Sinh mã tăng dần
                int slPV = model.getListPhongVans().size();
                String maPV = model.getListPhongVans().get(slPV - 1).getMaPV().substring(2);
                int soMaPV = Integer.parseInt(maPV) + 1;
                String MaPV = "PV" + String.valueOf(soMaPV);

                // Date -> LocalDate
                Date NgayPV = txtNgayPV.getDate();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(NgayPV);
                LocalDate localDate = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));

                // Add Phỏng Vấn
                String PhongPV = txtPhong.getText();
                int SoLuong = Integer.valueOf(txtSoLuong.getText());
                pv = new PhongVan(MaPV, localDate, PhongPV, SoLuong);
                model.ListPhongVans.add(pv);
                model.SaveChange();
                clearTable();
                loadTableLichDangKy();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_themBtnActionPerformed

    // Xóa một phỏng vấn
    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        try {
            int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                dong = tableLichDangKy_Admin.getSelectedRow();
                if (dong != -1) {
                    model.ListPhongVans.remove(dong);
                    model.SaveChange();
                    clearTable();
                    loadTableLichDangKy();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_xoaActionPerformed

    // Hiển thị thông tin lên input khi click 
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        dong = tableLichDangKy_Admin.getSelectedRow();
        if (dong != -1) {
            pv = model.ListPhongVans.get(dong);
            LocalDate ngayPV = pv.getNgayPV();
            Date date = java.sql.Date.valueOf(ngayPV);
            txtNgayPV.setDate(date);
            txtPhong.setText(pv.getPhongPV());
            txtSoLuong.setText(String.valueOf(pv.getSoLuong()));
        }
    }//GEN-LAST:event_tableMouseClicked

    private void cbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepActionPerformed
        // TODO add your handling code here:
        ArrayList<PhongVan> dsPV_sort = new ArrayList<>();
        dsPV_sort.addAll(model.getListPhongVans());

        String selectedItem = (String) cbSapXep.getSelectedItem();
        if (selectedItem.equals("Số lượng")) {
            Collections.sort(dsPV_sort, Comparator.comparingInt(PhongVan::getSoLuong));
        }
        if (selectedItem.equals("Ngày phỏng vấn")) {
            Collections.sort(dsPV_sort, Comparator.comparing(PhongVan::getNgayPV));
        }
        clearTable();
        DefaultTableModel modelTable = (DefaultTableModel) tableLichDangKy_Admin.getModel();
        int dem = 0;
        for (PhongVan i : dsPV_sort) {
            modelTable.addRow(new Object[]{
                ++dem, i.getNgayPV(), i.getPhongPV(), i.getSoLuongThamGia() + "/" + i.getSoLuong()
            });
        }

    }//GEN-LAST:event_cbSapXepActionPerformed

    // Hiển thị dữ liệu lên bảng
    private void loadTableLichDangKy() {
        DefaultTableModel modelTable = (DefaultTableModel) tableLichDangKy_Admin.getModel();
        int dem = 0;
        for (PhongVan i : model.getListPhongVans()) {
            modelTable.addRow(new Object[]{
                ++dem, i.getNgayPV(), i.getPhongPV(), i.getSoLuongThamGia() + "/" + i.getSoLuong()
            });
        }
    }

    // Xóa toàn bộ các hàng của bảng
    public void clearTable() {
        DefaultTableModel modelTable = (DefaultTableModel) tableLichDangKy_Admin.getModel();
        modelTable.setRowCount(0);
    }

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
            java.util.logging.Logger.getLogger(DangKyLichPhongVanView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyLichPhongVanView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyLichPhongVanView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyLichPhongVanView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyLichPhongVanView_ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLichDangKy_Admin;
    private javax.swing.JButton themBtn;
    private javax.swing.JButton thoat;
    private javax.swing.JButton thongKeBtn;
    private com.toedter.calendar.JDateChooser txtNgayPV;
    private javax.swing.JTextField txtPhong;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
