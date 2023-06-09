package qlsinhvientinhnguyen;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author hai
 */
public class PhongVan implements Serializable{
    String MaPV;
    LocalDate NgayPV;
    String PhongPV;
    int SoLuong;
    int SoLuongThamGia = 0; 

    public PhongVan() {
    }

    public void setSoLuongThamGia(int SoLuongThamGia) {
        this.SoLuongThamGia = SoLuongThamGia;
    }

    public PhongVan(String MaPV, LocalDate NgayPV, String PhongPV, int SoLuong) {
        this.MaPV = MaPV;
        this.NgayPV = NgayPV;
        this.PhongPV = PhongPV;
        this.SoLuong = SoLuong;
    }

    public String getMaPV() {
        return MaPV;
    }

    public LocalDate getNgayPV() {
        return NgayPV;
    }

    public String getPhongPV() {
        return PhongPV;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getSoLuongThamGia() {
        return SoLuongThamGia;
    }

    public void setMaPV(String MaPV) {
        this.MaPV = MaPV;
    }

    public void setNgayPV(LocalDate NgayPV) {
        this.NgayPV = NgayPV;
    }

    public void setPhongPV(String PhongPV) {
        this.PhongPV = PhongPV;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
}
