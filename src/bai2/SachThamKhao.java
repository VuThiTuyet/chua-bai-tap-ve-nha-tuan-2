package bai2;

import java.util.Date;
import java.util.Scanner;

public class SachThamKhao extends Sach{
    private long thue;

    public SachThamKhao(){
        super();
    };
    public SachThamKhao(long thue){
        this.thue = thue;
    }
    public SachThamKhao(String maSach, Date ngayNhap, long donGia, int soLuong, String nhaXuatBan, long thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public void setThue(long thue){this.thue = thue;}
    public long getThue(){return this.thue;}

    public void nhapSTK(){
        super.nhapSach();
        System.out.println("nhap so thue:");
        this.thue = new Scanner(System.in).nextLong();
    }

    public long thanhTien(){
        return getSoLuong()*getDonGia()+thue;
    }

    public String toString(){
        return "Sach Tham Khao {" + super.toString() +
                "thue = " + thue +
                '}';
    }
    }
