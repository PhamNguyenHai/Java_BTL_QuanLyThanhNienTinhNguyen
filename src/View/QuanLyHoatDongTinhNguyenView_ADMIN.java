/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.toedter.calendar.JDateChooser;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import qlsinhvientinhnguyen.HoatDong;
import qlsinhvientinhnguyen.Models;
import qlsinhvientinhnguyen.SinhVien;
import qlsinhvientinhnguyen.SinhVienTinhNguyen;

/**
 *
 * @author ADMIN
 */
public class QuanLyHoatDongTinhNguyenView_ADMIN extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyHoatDongTinhNguyenView_ADMIN
     */
    Models model = new Models();
    HoatDong hoatDongSelected = null;
    
    public QuanLyHoatDongTinhNguyenView_ADMIN() {
        initComponents();
        try{
            model.Import();
            ArrayList<SinhVienTinhNguyen> dssvtn = new ArrayList<SinhVienTinhNguyen>();
            for(SinhVien i : model.getListSinhViens())
                if(i instanceof SinhVienTinhNguyen)
                    dssvtn.add((SinhVienTinhNguyen)i);
            
            loadTable();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void loadTable(){
        DefaultTableModel modelTable =  (DefaultTableModel)DSHoatDongTable.getModel();
        modelTable.setRowCount(0);
        int dem = 0;
        
        for(HoatDong i : model.getListHoatDongs()){   
            int SoLuongSVTNTG = 0;
            int TongSoSao = 0;
            for(SinhVienTinhNguyen j : i.getDSSinhVienThamGia()){
                if(j.getDanhGia() != null){
                    TongSoSao += j.getDanhGia().getSoSaoDanhGia();   
                    SoLuongSVTNTG++;
                }
            }
            modelTable.addRow(new Object[]{
                ++dem, i.getTenHD(), i.getNgayBatDau().getDayOfMonth() + "-" + i.getNgayBatDau().getMonthValue()+ "-" + i.getNgayBatDau().getYear(), i.getMoTa(), i.getNguoiQuanLy(), i.getChiPhiHoTro(), i.getDSSinhVienThamGia().size(), (SoLuongSVTNTG == 0 ? 0 : (TongSoSao/SoLuongSVTNTG)) + "* / 5"
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenHD = new javax.swing.JTextField();
        txtNguoiQLyHD = new javax.swing.JTextField();
        txtMoTaHD = new javax.swing.JTextField();
        txtChiPhiHoTro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DSHoatDongTable = new javax.swing.JTable();
        btnTimKiemTheoTenHD = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        btnXemDS = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Danh sách hoạt động tình nguyện");

        jLabel2.setText("Hoạt động");

        jLabel3.setText("Người quản lý hoạt động");

        jLabel5.setText("Ngày bắt đầu");

        jLabel6.setText("Mô tả");

        jLabel7.setText("Chi phí hỗ trợ");

        txtTenHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenHDActionPerformed(evt);
            }
        });

        txtChiPhiHoTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChiPhiHoTroActionPerformed(evt);
            }
        });

        DSHoatDongTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Hoạt động", "Ngày bắt đầu", "Mô tả", "Người quản lý", "Chi phí hỗ trợ", "Số SVTN", "Đánh giá"
            }
        ));
        DSHoatDongTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RowMouseRenderToForm(evt);
            }
        });
        jScrollPane1.setViewportView(DSHoatDongTable);
        if (DSHoatDongTable.getColumnModel().getColumnCount() > 0) {
            DSHoatDongTable.getColumnModel().getColumn(0).setMinWidth(20);
            DSHoatDongTable.getColumnModel().getColumn(0).setMaxWidth(50);
            DSHoatDongTable.getColumnModel().getColumn(2).setMinWidth(80);
            DSHoatDongTable.getColumnModel().getColumn(2).setMaxWidth(120);
            DSHoatDongTable.getColumnModel().getColumn(5).setPreferredWidth(2);
            DSHoatDongTable.getColumnModel().getColumn(6).setMinWidth(50);
            DSHoatDongTable.getColumnModel().getColumn(6).setMaxWidth(80);
            DSHoatDongTable.getColumnModel().getColumn(7).setMinWidth(30);
            DSHoatDongTable.getColumnModel().getColumn(7).setMaxWidth(80);
        }

        btnTimKiemTheoTenHD.setText("Tìm theo tên HD");
        btnTimKiemTheoTenHD.setActionCommand("Tìm theo");
        btnTimKiemTheoTenHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemTheoTenHDActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        dateChooser.setDateFormatString("dd-MM-yyyy");

        btnXemDS.setText("Xem DS SVTN Tham gia");
        btnXemDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDSActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(402, 402, 402))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(105, 105, 105)
                                .addComponent(txtTenHD, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNguoiQLyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMoTaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtChiPhiHoTro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTimKiemTheoTenHD, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXemDS, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtChiPhiHoTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtNguoiQLyHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtTenHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnTimKiemTheoTenHD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXemDS)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMoTaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThongKe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat)
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenHDActionPerformed

    private void btnTimKiemTheoTenHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemTheoTenHDActionPerformed
        DefaultTableModel modelTable =  (DefaultTableModel)DSHoatDongTable.getModel();
        
        String keyword = txtTenHD.getText();
        
        if(keyword.isEmpty()){
            loadTable();
        }
        else{
            modelTable.setRowCount(0);
            boolean check = false;
            int dem = 0;
        
            for(HoatDong i : model.getListHoatDongs()){ 
                int SoLuongSVTNTG = i.getDSSinhVienThamGia().size();
                int TongSoSao = 0;
            
                if(i.getTenHD().toLowerCase().contains(keyword.toLowerCase())){
                   modelTable.addRow(new Object[]{
                        ++dem, i.getTenHD(), i.getNgayBatDau().getDayOfMonth() + "-" + i.getNgayBatDau().getMonthValue()+ "-" + i.getNgayBatDau().getYear(), i.getMoTa(), i.getNguoiQuanLy(), i.getChiPhiHoTro(), SoLuongSVTNTG, (SoLuongSVTNTG == 0 ? 0 : (TongSoSao/SoLuongSVTNTG)) + "* / 5"
                    });
                    check = true;
                }
            }
            
            if(!check)
                JOptionPane.showMessageDialog(this, "Không tìm thấy hoạt động");
        }
    }//GEN-LAST:event_btnTimKiemTheoTenHDActionPerformed

    private void txtChiPhiHoTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChiPhiHoTroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChiPhiHoTroActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try{
            if(hoatDongSelected != null){
                if(JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa ?", "Cảnh báo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
                    HoatDong xoa = model.ListHoatDongs.get(model.ListHoatDongs.indexOf(hoatDongSelected));
                    if(xoa.getDSSinhVienThamGia().size() > 0){
                        throw new Exception("Không thể xóa vì đã có thành viên tham gia ");
                    }
                    else{
                        model.ListHoatDongs.remove(xoa);
                        model.SaveChange();
                        JOptionPane.showMessageDialog(this, "Xóa thành công");
                        loadTable();
                    }
                }
            }
            else
                throw new Exception("Vui lòng chọn sinh viên tình nguyện muốn xóa");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try{
            if(txtTenHD.getText().isEmpty() 
                && txtMoTaHD.getText().isEmpty() 
                && txtNguoiQLyHD.getText().isEmpty() 
                && txtChiPhiHoTro.getText().isEmpty()
                && dateChooser == null)
                throw new Exception("Vui lòng nhập đầy đủ thông tin");
            else{
                String MaMoi = model.getNewMaHD();
                System.out.println(MaMoi);
                HoatDong them = new HoatDong(MaMoi, txtTenHD.getText(), dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), txtMoTaHD.getText(), txtNguoiQLyHD.getText(), Double.parseDouble(txtChiPhiHoTro.getText()));
                model.ListHoatDongs.add(them);
                model.SaveChange();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                loadTable();
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try{
            if(hoatDongSelected != null){
                if(txtTenHD.getText().isEmpty() 
                && txtMoTaHD.getText().isEmpty() 
                && txtNguoiQLyHD.getText().isEmpty() 
                && txtChiPhiHoTro.getText().isEmpty()
                && dateChooser == null)
                    throw new Exception("Vui lòng nhập đầy đủ thông tin");
                else{
                    HoatDong sua = model.ListHoatDongs.get(model.ListHoatDongs.indexOf(hoatDongSelected));
                    sua.setTenHD(txtTenHD.getText());
                    sua.setNgayBatDau(dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    sua.setNguoiQuanLy(txtNguoiQLyHD.getText());
                    sua.setMoTa(txtMoTaHD.getText());
                    sua.setChiPhiHoTro(Double.parseDouble(txtChiPhiHoTro.getText()));
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    model.SaveChange();
                    loadTable();
                }
            }
            else
                throw new Exception("Vui lòng chọn sinh viên tình nguyện cần sửa");
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

//    public void XuatFileExcel(JTable table) throws IOException {
//        try{
//            Workbook workbook = new XSSFWorkbook();
//            Sheet sheet = workbook.createSheet("Sheet1");
//
//            // Tạo header row
//            Row headerRow = sheet.createRow(0);
//            for (int i = 0; i < table.getColumnCount(); i++) {
//                Cell headerCell = headerRow.createCell(i);
//                headerCell.setCellValue(table.getColumnName(i));
//            }
//
//            // Đổ dữ liệu từ JTable vào Excel
//            for (int i = 0; i < table.getRowCount(); i++) {
//                Row row = sheet.createRow(i + 1);
//                for (int j = 0; j < table.getColumnCount(); j++) {
//                    Cell cell = row.createCell(j);
//                    Object value = table.getValueAt(i, j);
//                    if (value != null) {
//                        cell.setCellValue(value.toString());
//                    }
//                }
//            }
//
//            // Lưu workbook vào file
//            FileOutputStream fileOut = new FileOutputStream("QuanLyHoatDongTinhNguyen.xlsx");
//            workbook.write(fileOut);
//            fileOut.close();
//            JOptionPane.showMessageDialog(null, "Đã xuất ra file: QL_HoatDongTinhNguyen.xlsx");
//        }catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }
//    }
    
    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
//        try{
//            XuatFileExcel(DSHoatDongTable);
//        }catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void RowMouseRenderToForm(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RowMouseRenderToForm
        int selectedRow = DSHoatDongTable.getSelectedRow();
        if(selectedRow != -1){
            hoatDongSelected = model.getListHoatDongs().get(selectedRow);
            txtTenHD.setText(hoatDongSelected.getTenHD());
            txtNguoiQLyHD.setText(hoatDongSelected.getNguoiQuanLy());
            dateChooser.setDate(java.sql.Date.valueOf(hoatDongSelected.getNgayBatDau()));
            txtMoTaHD.setText(hoatDongSelected.getMoTa());
            
            txtChiPhiHoTro.setText(Double.toString(hoatDongSelected.getChiPhiHoTro()));
        }
    }//GEN-LAST:event_RowMouseRenderToForm

    private void btnXemDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDSActionPerformed
        DanhSachSVThamGia_Admin dssvtg = new DanhSachSVThamGia_Admin(hoatDongSelected);
        dssvtg.setLocationRelativeTo(null);
        dssvtg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dssvtg.setVisible(true);
    }//GEN-LAST:event_btnXemDSActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        try{
            model.Import();
            loadTable();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyHoatDongTinhNguyenView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoatDongTinhNguyenView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoatDongTinhNguyenView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoatDongTinhNguyenView_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHoatDongTinhNguyenView_ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DSHoatDongTable;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiemTheoTenHD;
    private javax.swing.JButton btnXemDS;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtChiPhiHoTro;
    private javax.swing.JTextField txtMoTaHD;
    private javax.swing.JTextField txtNguoiQLyHD;
    private javax.swing.JTextField txtTenHD;
    // End of variables declaration//GEN-END:variables
}
