package qlsinhvientinhnguyen;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Models models = new Models();
        ArrayList<Lop> ListLop = new ArrayList<Lop>();
        ListLop.add(new Lop("IT01", "KHMT01", 15, "CNTT"));
        ListLop.add(new Lop("IT02", "HTTT1", 15, "CNTT"));
        ListLop.add(new Lop("IT03", "CNTT1", 15, "CNTT"));
        ListLop.add(new Lop("IT04", "KTPM1", 15, "CNTT"));
        
        
        ArrayList<PhongVan> ListPV = new ArrayList<PhongVan>();
        ListPV.add(new PhongVan("PV01", LocalDate.of(2023, 3, 5), "305 - A10", 10));
    ListPV.add(new PhongVan("PV02", LocalDate.of(2023, 5, 8), "305 - A10", 5));
        
        
        ArrayList<TaiKhoan> ListTK = new ArrayList<TaiKhoan>();
        ListTK.add(new TaiKhoan("admin", "admin", 1));
        ListTK.add(new TaiKhoan("SV01", "123456", 2));
        ListTK.add(new TaiKhoan("SV03", "123456", 2));
        ListTK.add(new TaiKhoan("SV04", "123456", 2));
        ListTK.add(new TaiKhoan("SV07", "123456", 2));
        
        
        ArrayList<SinhVien> ListSV = new ArrayList<SinhVien>();
        ListSV.add(new SinhVienTinhNguyen("SV01", "Nguyễn Ngọc Xuân",   ListLop.get(0), "0325524413", "xuannn@gmail.com",       ListTK.get(1), "Thành viên"));
        ListSV.add(new SinhVienPhongVan  ("SV02", "Trần Anh Tuyền",     ListLop.get(1), "0543524512", "anhtuyen@gmail.com",     null));
        ListSV.add(new SinhVienTinhNguyen("SV03", "Phạm Xuân Long",     ListLop.get(2), "0343523134", "long@gmail.com",         ListTK.get(1), "Thành viên"));
        ListSV.add(new SinhVienTinhNguyen("SV04", "Hà Thanh Huyền",     ListLop.get(3), "0235524454", "thanhhuyen@gmail.com",   ListTK.get(1), "Thành viên"));
        ListSV.add(new SinhVienPhongVan  ("SV05", "Phạm Tuấn Anh",      ListLop.get(3), "0225532417", "letgo@gmail.com",        null));
        ListSV.add(new SinhVienPhongVan  ("SV06", "Hoàng Văn Ngọc",     ListLop.get(2), "0924524416", "ngochoang@gmail.com",    null));
        ListSV.add(new SinhVienTinhNguyen("SV07", "Trần Đức Đạt",       ListLop.get(1), "0334525410", "ducdat342@gmail.com",    ListTK.get(1), "Thành viên"));
        ListSV.add(new SinhVienPhongVan  ("SV08", "Đào Thị Thảo",    ListLop.get(2), "0325524311", "daothithao@gmail.com",    null));
        ListSV.add(new SinhVienPhongVan  ("SV09", "Lưu Tuấn Thành",    ListLop.get(1), "0325524311", "tuanthanh@gmail.com",    null));
        ListSV.add(new SinhVienPhongVan  ("SV10", "Phạm Nguyễn Nguyên Hải",    ListLop.get(0), "0325524311", "nguyenhai@gmail.com",    null));
        ListSV.add(new SinhVienPhongVan  ("SV11", "Tạ Đức Mạnh",    ListLop.get(3), "0325524311", "ducmanh@gmail.com",    null));
        ListSV.add(new SinhVienPhongVan  ("SV12", "Nguyễn Thị Thông",    ListLop.get(2), "0325524311", "nguyenthong@gmail.com",    null));
        ListSV.add(new SinhVienPhongVan  ("SV13", "Trần Duy Long",    ListLop.get(0), "0325524311", "duylong@gmail.com",    null));
        ListSV.add(new SinhVienPhongVan  ("SV14", "Nguyễn Bá Trung",    ListLop.get(1), "0325524311", "batrung@gmail.com",    null));
        
        
        ArrayList<HoatDong> ListHD = new ArrayList<HoatDong>();
        ListHD.add(new HoatDong("HD01", "Dọn vệ sinh trường", LocalDate.of(2023, 6, 15), "Dọn dẹp toàn bộ khuôn viên trường, các phòng học", "Nguyễn Xuân Anh", 5000000));
        ListHD.add(new HoatDong("HD02", "Tổ chức hiến máu", LocalDate.of(2023, 6, 18), "Phân công hỗ trợ tổ chức hiến máu tình nguyện", "Nguyễn Nam Anh", 1000000));
        ListHD.add(new HoatDong("HD03", "Tổ chức sự kiện VWA", LocalDate.of(2023, 7, 10), "Dọn dẹp toàn bộ khán đài, bàn ghế khách", "Hà Thanh Hoàng", 2000000));
        ListHD.add(new HoatDong("HD04", "Tổ chức sự kiện VNH", LocalDate.of(2023, 7, 15), "Dọn dẹp toàn bộ khán đài, bàn ghế khách", "Nguyễn Xuân Anh", 2000000));
        
        
        models.setListLops(ListLop);
        models.setListPhongVans(ListPV);
        models.setListTaiKhoans(ListTK);
        models.setListSinhViens(ListSV);
        models.setListHoatDongs(ListHD);
        try{
            models.SaveChange();
            System.out.print("ThanhCongg");
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    } 
}
