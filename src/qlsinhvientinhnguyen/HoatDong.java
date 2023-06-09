package qlsinhvientinhnguyen;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author hai
 */
public class HoatDong implements Serializable{
    String MaHD;
    String TenHD;
    LocalDate NgayBatDau;
    String MoTa;
    String NguoiQuanLy;
    double ChiPhiHoTro;
    ArrayList<SinhVienTinhNguyen> DSSinhVienThamGia;

    public HoatDong() {
    }

    public HoatDong(String MaHD, String TenHD, LocalDate NgayBatDau, String MoTa, String NguoiQuanLy, double ChiPhiHoTro) {
        this.MaHD = MaHD;
        this.TenHD = TenHD;
        this.NgayBatDau = NgayBatDau;
        this.MoTa = MoTa;
        this.NguoiQuanLy = NguoiQuanLy;
        this.ChiPhiHoTro = ChiPhiHoTro;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getTenHD() {
        return TenHD;
    }

    public LocalDate getNgayBatDau() {
        return NgayBatDau;
    }

    public String getMoTa() {
        return MoTa;
    }

    public String getNguoiQuanLy() {
        return NguoiQuanLy;
    }

    public double getChiPhiHoTro() {
        return ChiPhiHoTro;
    }

    public ArrayList<SinhVienTinhNguyen> getDSSinhVienThamGia() {
        return DSSinhVienThamGia;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setTenHD(String TenHD) {
        this.TenHD = TenHD;
    }

    public void setNgayBatDau(LocalDate NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public void setNguoiQuanLy(String NguoiQuanLy) {
        this.NguoiQuanLy = NguoiQuanLy;
    }

    public void setChiPhiHoTro(double ChiPhiHoTro) {
        this.ChiPhiHoTro = ChiPhiHoTro;
    }

    public void setDSSinhVienThamGia(ArrayList<SinhVienTinhNguyen> DSSinhVienThamGia) {
        this.DSSinhVienThamGia = DSSinhVienThamGia;
    }
}
