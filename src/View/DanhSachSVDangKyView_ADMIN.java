/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlsinhvientinhnguyen.Models;
import qlsinhvientinhnguyen.PhongVan;
import qlsinhvientinhnguyen.SinhVien;
import qlsinhvientinhnguyen.SinhVienPhongVan;
import qlsinhvientinhnguyen.SinhVienTinhNguyen;
import qlsinhvientinhnguyen.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public class DanhSachSVDangKyView_ADMIN extends javax.swing.JFrame {

    Models model = new Models();
    ArrayList<SinhVienPhongVan> dsSVPV_local;
    ArrayList<SinhVienTinhNguyen> dsSVTN_local;
    int dong = -1;
    int soLuongThamGia;
    private static DanhSachSVDangKyView_ADMIN instance;

    /**
     * Creates new form DanhSachSVDangKyView_ADMIN
     */
    public DanhSachSVDangKyView_ADMIN() {
        try {
            initComponents();
            model.Import();
            dsSVPV_local = new ArrayList<>();
            dsSVTN_local = new ArrayList<>();
            load_SVPV_Local();
            load_SVTN_Local();
            loadTableLichDangKy(dsSVPV_local);
        } catch (Exception e) {

        }
    }

    private void load_SVPV_Local() {
        try {
            for (SinhVien i : model.getListSinhViens()) {
                if (i instanceof SinhVienPhongVan) {
                    SinhVienPhongVan svPhongVan = (SinhVienPhongVan) i;
                    if (svPhongVan.getPhongVan() != null) {
                        dsSVPV_local.add(svPhongVan);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void load_SVTN_Local() {
        try {
            for (SinhVien i : model.getListSinhViens()) {
                if (i instanceof SinhVienTinhNguyen) {
                    SinhVienTinhNguyen svTinhNguyen = (SinhVienTinhNguyen) i;
                    dsSVTN_local.add(svTinhNguyen);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
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
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbSapXep = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSVDangKy = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lopComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btnChapNhan = new javax.swing.JButton();
        btnTuChoi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Danh sách sinh viên đăng ký");

        jLabel2.setText("Tên sinh viên");

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setText("Sắp xếp");

        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sinh viên", "Tên sinh viên", "Lịch phỏng vấn" }));
        cbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepActionPerformed(evt);
            }
        });

        tableSVDangKy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SV", "Tên SV", "Lớp", "Khoa", "Niên khóa", "Số điện thoại", "Email", "Lịch phỏng vấn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSVDangKy);
        if (tableSVDangKy.getColumnModel().getColumnCount() > 0) {
            tableSVDangKy.getColumnModel().getColumn(0).setMinWidth(40);
            tableSVDangKy.getColumnModel().getColumn(0).setMaxWidth(40);
            tableSVDangKy.getColumnModel().getColumn(1).setMinWidth(80);
            tableSVDangKy.getColumnModel().getColumn(1).setMaxWidth(80);
            tableSVDangKy.getColumnModel().getColumn(3).setMinWidth(80);
            tableSVDangKy.getColumnModel().getColumn(3).setMaxWidth(80);
            tableSVDangKy.getColumnModel().getColumn(4).setMinWidth(80);
            tableSVDangKy.getColumnModel().getColumn(4).setMaxWidth(80);
            tableSVDangKy.getColumnModel().getColumn(5).setMinWidth(100);
            tableSVDangKy.getColumnModel().getColumn(5).setMaxWidth(100);
            tableSVDangKy.getColumnModel().getColumn(7).setMinWidth(200);
            tableSVDangKy.getColumnModel().getColumn(7).setMaxWidth(200);
        }

        jLabel4.setText("Lọc");

        lopComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HTTT1", "KTPM1", "CNTT1", "KHMT01" }));
        lopComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lopComboBoxActionPerformed(evt);
            }
        });

        jButton2.setText("Quản lý SV tình nguyện");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnChapNhan.setText("Chấp nhận");
        btnChapNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChapNhanActionPerformed(evt);
            }
        });

        btnTuChoi.setText("Từ chối");
        btnTuChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTuChoiActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnRefresh.setText("Làm mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSearch)
                                    .addComponent(cbSapXep, 0, 163, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSearch))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(590, 590, 590)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lopComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(btnChapNhan)
                            .addComponent(btnTuChoi)
                            .addComponent(btnThoat)
                            .addComponent(btnRefresh)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lopComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChapNhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTuChoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThoat)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTuChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTuChoiActionPerformed
        // TODO add your handling code here:
        try {
            dong = tableSVDangKy.getSelectedRow();
            if (dong != -1) {
                SinhVienPhongVan svpv_acp = dsSVPV_local.get(dong);
                SinhVienPhongVan svpv = new SinhVienPhongVan(svpv_acp.getMaSV(), svpv_acp.getTenSV(), svpv_acp.getLop(), svpv_acp.getSDT(), svpv_acp.getEmail(), null);
                Iterator<SinhVien> iterator = model.ListSinhViens.iterator();
                while (iterator.hasNext()) {
                    SinhVien sv = iterator.next();
                    if (sv instanceof SinhVienPhongVan) {

                        SinhVienPhongVan svPhongVan = (SinhVienPhongVan) sv;

                        if (svPhongVan.getMaSV().equals(dsSVPV_local.get(dong).getMaSV())) {

                            iterator.remove();
                            model.ListSinhViens.add(svpv);
                            model.SaveChange();
                            updateDB_Local();

                            clearTable();
                            loadTableLichDangKy(dsSVPV_local);
                            break;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Chưa chọn sinh viên!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnTuChoiActionPerformed

    private void lopComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopComboBoxActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) lopComboBox.getSelectedItem();
        filter(selectedItem);
    }//GEN-LAST:event_lopComboBoxActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        try {
            updateDB_Local();
            clearTable();
            loadTableLichDangKy(dsSVPV_local);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepActionPerformed
        // TODO add your handling code here:
        ArrayList<SinhVienPhongVan> dsSV_sort = new ArrayList<>();
        updateDB_Local();
        dsSV_sort.addAll(dsSVPV_local);

        String selectedItem = (String) cbSapXep.getSelectedItem();
        if (selectedItem.equals("Tên sinh viên")) {
            Collections.sort(dsSV_sort, Comparator.comparing(SinhVienPhongVan::getTenSV));
        }
        if (selectedItem.equals("Mã sinh viên")) {
            Collections.sort(dsSV_sort, Comparator.comparing(SinhVienPhongVan::getMaSV));
        }
        if (selectedItem.equals("Lịch phỏng vấn")) {
            Collections.sort(dsSV_sort, Comparator.comparing(sv -> sv.getPhongVan().getNgayPV()));
        }
        clearTable();
        loadTableLichDangKy(dsSV_sort);
    }//GEN-LAST:event_cbSapXepActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:\
        updateDB_Local();
        ArrayList<SinhVienPhongVan> dsSV_search = new ArrayList<>();

        String txtS = txtSearch.getText();
        for (SinhVienPhongVan sv : dsSVPV_local) {
            if (sv.getTenSV().toLowerCase().contains(txtS.toLowerCase())) {
                dsSV_search.add(sv);
            }
        }
        clearTable();
        loadTableLichDangKy(dsSV_search);
        txtSearch.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnChapNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChapNhanActionPerformed
        // TODO add your handling code here:
        try {
            dong = tableSVDangKy.getSelectedRow();
            if (dong != -1) {
                SinhVienPhongVan svpv_acp = dsSVPV_local.get(dong);
                SinhVienTinhNguyen svtn = new SinhVienTinhNguyen(svpv_acp.getMaSV(), svpv_acp.getTenSV(), svpv_acp.getLop(), svpv_acp.getSDT(), svpv_acp.getEmail(), themTK(svpv_acp.getMaSV()), "Thành viên");
                Iterator<SinhVien> iterator = model.ListSinhViens.iterator();
                while (iterator.hasNext()) {

                    SinhVien sv = iterator.next();
                    if (sv instanceof SinhVienPhongVan) {

                        SinhVienPhongVan svPhongVan = (SinhVienPhongVan) sv;

                        if (svPhongVan.getMaSV().equals(dsSVPV_local.get(dong).getMaSV()) && svPhongVan.getPhongVan() != null) {

                            iterator.remove();
                            model.ListSinhViens.add(svtn);
                            model.SaveChange();
                            updateDB_Local();

                            clearTable();
                            loadTableLichDangKy(dsSVPV_local);
                            break;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Chưa chọn sinh viên!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnChapNhanActionPerformed

    public void updateDB_Local() {
        try {
            model.Import();
            dsSVPV_local = new ArrayList<>();
            dsSVTN_local = new ArrayList<>();
            load_SVPV_Local();
            load_SVTN_Local();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private TaiKhoan themTK(String masv) {
        TaiKhoan tk = new TaiKhoan(masv, "123456", 2);
        model.ListTaiKhoans.add(tk);
        try {
            model.SaveChange();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return tk;
    }

    private void filter(String dk) {
        DefaultTableModel modelTable = (DefaultTableModel) tableSVDangKy.getModel();
        int dem = 0;
        clearTable();
        updateDB_Local();
        for (SinhVienPhongVan i : dsSVPV_local) {
            if (i.getLop().getTenLop().equals(dk)) {
                modelTable.addRow(new Object[]{
                    ++dem, i.getMaSV(), i.getTenSV(), i.getLop().getTenLop(), i.getLop().getKhoa(), i.getLop().getNienKhoa(), i.getSDT(), i.getEmail(), i.getPhongVan().getNgayPV()});
            }
        }
    }

    private void loadTableLichDangKy(ArrayList<SinhVienPhongVan> arr) {
        DefaultTableModel modelTable = (DefaultTableModel) tableSVDangKy.getModel();
        int dem = 0;

        for (SinhVienPhongVan i : arr) {
            System.out.println(i.getPhongVan().getNgayPV());
            modelTable.addRow(new Object[]{
                ++dem, i.getMaSV(), i.getTenSV(), i.getLop().getTenLop(), i.getLop().getKhoa(), i.getLop().getNienKhoa(), i.getSDT(), i.getEmail(), i.getPhongVan().getNgayPV()});
        }
    }

    public void fakeData_PhongVan() {
        ArrayList<PhongVan> dspv = model.getListPhongVans();
        for (SinhVien i : model.getListSinhViens()) {
            if (i instanceof SinhVienPhongVan) {
                SinhVienPhongVan svPhongVan = (SinhVienPhongVan) i;
                svPhongVan.setPhongVan(dspv.get(0));
            }
        }
        try {
            model.SaveChange();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void clearTable() {
        DefaultTableModel modelTable = (DefaultTableModel) tableSVDangKy.getModel();
        modelTable.setRowCount(0);
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        QuanLySinhVienTinhNguyenView_ADMIN dsdk = new QuanLySinhVienTinhNguyenView_ADMIN();
        dsdk.getInstance().setLocationRelativeTo(null);
        dsdk.getInstance().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static DanhSachSVDangKyView_ADMIN getInstance() {
        if (instance == null) {
            instance = new DanhSachSVDangKyView_ADMIN();
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
            java.util.logging.Logger.getLogger(DanhSachSVDangKyView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachSVDangKyView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachSVDangKyView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachSVDangKyView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachSVDangKyView_ADMIN().getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChapNhan;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTuChoi;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lopComboBox;
    private javax.swing.JTable tableSVDangKy;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
