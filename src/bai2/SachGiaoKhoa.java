package bai2;

import java.util.Date;
import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa(){
    }

    public SachGiaoKhoa(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(String maSach, Date ngayNhap, long donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public void setTinhTrang(String tinhTrang){this.tinhTrang = tinhTrang;}
    public String getTinhTrang(){return this.tinhTrang;}

    public void nhapSGK(){
        super.nhapSach();
        String tinhTrang;
        do {
            System.out.println("nhap tinh trang sach(MOI hoac CU):");
            tinhTrang = new Scanner(System.in).nextLine();
            if (!tinhTrang.equals("MOI")&& !tinhTrang.equals("CU")){
                System.out.printf("nhap sai, nhap lai!");
            }
        }while (!tinhTrang.equals("MOI")&& !tinhTrang.equals("CU"));
        this.tinhTrang = tinhTrang;
    }

    public long thanhTien(){
        if(this.tinhTrang.equals("MOI")){
            return getSoLuong()*getDonGia();
        }
        else{
            return (long) (getSoLuong()*getDonGia()*0.5);
        }
    }

    public String toString(){
        return "Sach gia khoa {" + super.toString()+
                ",tinh trang sach: " + tinhTrang +
                '}';
    }
}
