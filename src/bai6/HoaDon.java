package bai6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HoaDon {
    private String maHoaDon;
    private Date ngayHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private double donGia;

    public HoaDon(){}

    public HoaDon(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapHoaDon(){
        System.out.println("nhap ma hoa don:");
        this.maHoaDon = new Scanner(System.in).nextLine();
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.ngayHoaDon = df.parse(ngay);
            } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("nhap ten khach hanh:");
        this.tenKhachHang = new Scanner(System.in).nextLine();
        System.out.println("nhap ma phong:");
        this.maPhong = new Scanner(System.in).nextLine();
        System.out.println("nhap don gia:");
        this.donGia = new Scanner(System.in).nextDouble();
    }
    @Override
    public String toString() {
        return "maHoaDon='" + maHoaDon + '\'' +
                ", ngayHoaDon=" + ngayHoaDon +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", maPhong='" + maPhong + '\'' +
                ", donGia=" + donGia +
                '}';
    }
}
