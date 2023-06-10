package qlsinhvientinhnguyen;

import java.io.Serializable;

/**
 *
 * @author hai
 */
public class Lop implements Serializable{
    String MaLop;
    String TenLop;
    int NienKhoa;
    String Khoa;

    public Lop() {
    }

    public Lop(String MaLop, String TenLop, int NienKhoa, String Khoa) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.NienKhoa = NienKhoa;
        this.Khoa = Khoa;
    }

    public String getMaLop() {
        return MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public int getNienKhoa() {
        return NienKhoa;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public void setNienKhoa(int NienKhoa) {
        this.NienKhoa = NienKhoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }
}
