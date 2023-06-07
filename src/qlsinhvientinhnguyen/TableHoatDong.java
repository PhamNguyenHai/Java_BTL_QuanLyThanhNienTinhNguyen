/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsinhvientinhnguyen;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author T490
 */
public class TableHoatDong extends AbstractTableModel implements Serializable{
    private String name[]={"Mã HD","Tên hoạt động","Ngày bắt đầu","Ngày bắt đầu","Mô tả","Người quản lý","Chi phí hỗ trợ"};
    private Class classes[] = {String.class, String.class, LocalDate.class, String.class, String.class, Double.class};
    ArrayList<HoatDong> dshd = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return dshd.size();
    }
    @Override
    public int getColumnCount() {
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return dshd.get(rowIndex).getMaHD();
            case 1: return dshd.get(rowIndex).getTenHD();
            case 2: return dshd.get(rowIndex).getNgayBatDau();
            case 3: return dshd.get(rowIndex).getMoTa();
            case 4: return dshd.get(rowIndex).getNguoiQuanLy();
            case 5: return dshd.get(rowIndex).getChiPhiHoTro();

            default: return null;
        }
    }

    public TableHoatDong(ArrayList<HoatDong> ds) {
        dshd = ds;
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
     return classes[columnIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public String getColumnName(int column) {
        return name[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
