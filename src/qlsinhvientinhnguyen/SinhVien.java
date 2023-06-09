package qlsinhvientinhnguyen;

import java.io.Serializable;

/**
 *
 * @author phamn
 */
public abstract class SinhVien implements Serializable{
    protected String MaSV;
    protected String TenSV;
    protected Lop Lop;
    protected String SDT;
    protected String Email;
    protected TaiKhoan TaiKhoan;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String TenSV, Lop Lop, String SDT, String Email, TaiKhoan TaiKhoan) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.Lop = Lop;
        this.SDT = SDT;
        this.Email = Email;
        this.TaiKhoan = TaiKhoan;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public Lop getLop() {
        return Lop;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEmail() {
        return Email;
    }

    public TaiKhoan getTaiKhoan() {
        return TaiKhoan;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public void setLop(Lop Lop) {
        this.Lop = Lop;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTaiKhoan(TaiKhoan TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }
    
}
