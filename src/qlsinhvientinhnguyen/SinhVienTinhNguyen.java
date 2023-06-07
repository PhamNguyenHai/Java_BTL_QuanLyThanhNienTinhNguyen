package qlsinhvientinhnguyen;

import java.io.Serializable;

/**
 *
 * @author hai
 */
public class SinhVienTinhNguyen extends SinhVien implements Serializable{
    String VaiTro;
    DanhGia DanhGia = null;

    public SinhVienTinhNguyen() {
    }

    public SinhVienTinhNguyen(String MaSV, String TenSV, Lop Lop, String SDT, String Email, TaiKhoan TaiKhoan, String VaiTro) {
        super(MaSV, TenSV, Lop, SDT, Email, TaiKhoan);
        this.VaiTro = VaiTro;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public DanhGia getDanhGia() {
        return DanhGia;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    public void setDanhGia(DanhGia DanhGia) {
        this.DanhGia = DanhGia;
    }
}