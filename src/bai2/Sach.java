package bai2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sach {
    private String maSach;
    private Date ngayNhap;
    private long donGia;
    private int soLuong;
    private String nhaXuatBan;

    public Sach(){}

    public Sach(String maSach,Date ngayNhap,long donGia,int soLuong,String nhaXuatBan){
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong =soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setMaSach(String maSach){this.maSach = maSach;}
    public void setNgayNhap(Date ngayNhap){this.ngayNhap = ngayNhap;}
    public void setDonGia(long donGia){this.donGia = donGia;}
    public void setSoLuong(int soLuong){this.soLuong = soLuong;}
    public void setNhaXuatBan(String nhaXuatBan){this.nhaXuatBan = nhaXuatBan;}
    public String getMaSach(){return this.maSach;}
    public Date getNgayNhap(){return this.ngayNhap;}
    public long getDonGia(){return this.donGia;}
    public int getSoLuong(){return this.soLuong;}
    public String getNhaXuatBan(){return this.nhaXuatBan;}

    public void nhapSach(){
        System.out.println("nhap vao ma sach:");
        this.maSach = new Scanner(System.in).nextLine();
        System.out.println("nhap ngay nhap:");             //NHAP BIEN NGAY THANG
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayNhap = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }                                                   //-------------
        System.out.println("nhap don gia:");
        this.donGia = new Scanner(System.in).nextLong();
        System.out.println("nhap so luong:");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("nhap nha xuat ban:");
        this.nhaXuatBan = new Scanner(System.in).nextLine();
    }


    public String toString(){
        return " ma sach = " + maSach +
                ", ngay nhap =" + ngayNhap +
                ",don gia = " + donGia +
                ", so luong =" + soLuong +
                ",nha xuat ban =" + nhaXuatBan +
                '}';
    }
}
