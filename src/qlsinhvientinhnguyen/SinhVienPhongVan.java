package qlsinhvientinhnguyen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author hai
 */
public class SinhVienPhongVan extends SinhVien implements Serializable{
    PhongVan PhongVan;

    public SinhVienPhongVan() {
    }

    public SinhVienPhongVan(String MaSV, String TenSV, Lop Lop, String SDT, String Email, TaiKhoan TaiKhoan) {
        super(MaSV, TenSV, Lop, SDT, Email, TaiKhoan);
    }
    public boolean compareData(String maSV, String hoTen, String lop) {
        return (getMaSV().equals(maSV) && getTenSV().equals(hoTen) && getLop().equals(lop));
    }

    public PhongVan getPhongVan() {
        return PhongVan;
    }

    public void setPhongVan(PhongVan PhongVan) {
        this.PhongVan = PhongVan;
    }

    public void setPhongVan(ArrayList<SinhVien> svpv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
