package qlsinhvientinhnguyen;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hai
 */
public class TaiKhoan implements Serializable{
    String TenDN;
    String MatKhau;
    int QuyenTruyCap;

    public TaiKhoan() {
    }

    public TaiKhoan(String TenDN, String MatKhau) {
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
    }

    public TaiKhoan(String TenDN, String MatKhau, int QuyenTruyCap) {
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
        this.QuyenTruyCap = QuyenTruyCap;
    }

    public String getTenDN() {
        return TenDN;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public int getQuyenTruyCap() {
        return QuyenTruyCap;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setQuyenTruyCap(int QuyenTruyCap) {
        this.QuyenTruyCap = QuyenTruyCap;
    }
}
