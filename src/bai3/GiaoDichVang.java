package bai3;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang(){
        super();
    }
    public GiaoDichVang(String dealId, Date ngayGiaoDich, long donGia, int soLuong,String loaiVang){
        super(dealId,ngayGiaoDich,donGia,soLuong);
        this.loaiVang = loaiVang;
    }
    public GiaoDichVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }
    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public void nhapGiaoDichVang(){
        super.nhapGiaoDich();
        System.out.println("nhap loai vang:");
        this.loaiVang = new Scanner(System.in).nextLine();
    }


    public long thanhTienGDV(){

        return getSoLuong()*getDonGia();
    }


    @Override
    public String toString() {
        return "GiaoDichVang{" + super.toString()+
                "loaiVang='" + loaiVang + '\'' +
                '}';
    }
}
