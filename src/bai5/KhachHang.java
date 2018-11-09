package bai5;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants.S;

public class KhachHang {
    private String maKhachHang;
    private String hoTenKhachHang;
    private Date ngayRaHoaDon;
    private double soLuong;
    private double donGia;

    public KhachHang(){};
    public KhachHang(String maKhachHang, String hoTenKhachHang, Date ngayRaHoaDon, double soLuong, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTenKhachHang = hoTenKhachHang;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTenKhachHang() {
        return hoTenKhachHang;
    }

    public void setHoTenKhachHang(String hoTenKhachHang) {
        this.hoTenKhachHang = hoTenKhachHang;
    }

    public Date getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(Date ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapKhachHang(){
        System.out.println("nhap ma khach hang:");
        this.maKhachHang = new Scanner(System.in).nextLine();
        System.out.println("nhap ten khach hang:");
        this.hoTenKhachHang = new Scanner(System.in).nextLine();
        System.out.println("nhap ngay ra hoa don:");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            try {
                this.ngayRaHoaDon = df.parse(ngay);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTenKhachHang='" + hoTenKhachHang + '\'' +
                ", ngayRaHoaDon=" + ngayRaHoaDon +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
