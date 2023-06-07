package qlsinhvientinhnguyen;

import java.io.Serializable;

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

    public PhongVan getPhongVan() {
        return PhongVan;
    }

    public void setPhongVan(PhongVan PhongVan) {
        this.PhongVan = PhongVan;
    }
}
