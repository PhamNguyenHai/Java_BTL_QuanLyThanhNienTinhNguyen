package qlsinhvientinhnguyen;

import java.io.Serializable;

/**
 *
 * @author hai
 */
public class DanhGia implements Serializable{
    int SoSaoDanhGia;
    String NoiDungDanhGia;

    public DanhGia() {
    }

    public DanhGia(int SoSaoDanhGia, String NoiDungDanhGia) {
        this.SoSaoDanhGia = SoSaoDanhGia;
        this.NoiDungDanhGia = NoiDungDanhGia;
    }

    public int getSoSaoDanhGia() {
        return SoSaoDanhGia;
    }

    public String getNoiDungDanhGia() {
        return NoiDungDanhGia;
    }

    public void setSoSaoDanhGia(int SoSaoDanhGia) {
        this.SoSaoDanhGia = SoSaoDanhGia;
    }

    public void setNoiDungDanhGia(String NoiDungDanhGia) {
        this.NoiDungDanhGia = NoiDungDanhGia;
    }
}
