package qlsinhvientinhnguyen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author hai
 */
public class Models implements Serializable{
    public ArrayList<PhongVan> ListPhongVans;
    public ArrayList<SinhVien> ListSinhViens;
    public ArrayList<TaiKhoan> ListTaiKhoans;
    public ArrayList<HoatDong> ListHoatDongs;
    public ArrayList<Lop> ListLops;

    public Models() {
        ListHoatDongs = new ArrayList<HoatDong>();
        ListLops = new ArrayList<Lop>();
        ListTaiKhoans = new ArrayList<TaiKhoan>();
        ListSinhViens = new ArrayList<SinhVien>();
        ListPhongVans = new ArrayList<PhongVan>();
    }
    
    public void Import() throws Exception {
        FileInputStream fi = new FileInputStream("DATA.TXT");
        ObjectInputStream ois = new ObjectInputStream(fi);
        Models importedData = (Models) ois.readObject();
        fi.close();
        ois.close();
    
    // Gán các danh sách từ đối tượng importedData cho đối tượng hiện tại
        this.ListPhongVans = importedData.ListPhongVans;
        this.ListSinhViens = importedData.ListSinhViens;
        this.ListTaiKhoans = importedData.ListTaiKhoans;
        this.ListHoatDongs = importedData.ListHoatDongs;
        this.ListLops = importedData.ListLops;
    }
    
//    public static Models ImportData() throws Exception {
//    FileInputStream fi = new FileInputStream("DATA.TXT");
//    ObjectInputStream ois = new ObjectInputStream(fi);
//    Models importedData = (Models)ois.readObject();
//    fi.close();
//    ois.close();
//    return importedData;
//    }
    
    public void SaveChange() throws Exception{
        FileOutputStream fs = new FileOutputStream("DATA.TXT");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(this);
        os.close();
        fs.close();
    }

    public void setListPhongVans(ArrayList<PhongVan> ListPhongVans) {
        this.ListPhongVans = ListPhongVans;
    }

    public void setListSinhViens(ArrayList<SinhVien> ListSinhViens) {
        this.ListSinhViens = ListSinhViens;
    }

    public void setListTaiKhoans(ArrayList<TaiKhoan> ListTaiKhoans) {
        this.ListTaiKhoans = ListTaiKhoans;
    }

    public void setListHoatDongs(ArrayList<HoatDong> ListHoatDongs) {
        this.ListHoatDongs = ListHoatDongs;
    }

    public void setListLops(ArrayList<Lop> ListLops) {
        this.ListLops = ListLops;
    }

    public ArrayList<PhongVan> getListPhongVans() {
        return ListPhongVans;
    }

    public ArrayList<SinhVien> getListSinhViens() {
        return ListSinhViens;
    }

    public ArrayList<TaiKhoan> getListTaiKhoans() {
        return ListTaiKhoans;
    }

    public ArrayList<HoatDong> getListHoatDongs() {
        return ListHoatDongs;
    }

    public ArrayList<Lop> getListLops() {
        return ListLops;
    }    

    public Iterable<PhongVan> getPhongVanList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
