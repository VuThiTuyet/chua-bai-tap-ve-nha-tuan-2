package bai6;

import java.util.Date;
import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon {
    private double soNgayThue;

    public HoaDonTheoNgay(){
        super();
    }

    public HoaDonTheoNgay(double soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia, double soNgayThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }

    public double getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(double soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public void nhapHoaDonTheoNgay(){
        super.nhapHoaDon();
        System.out.println("nhap so ngay thue");
        this.soNgayThue = new Scanner(System.in).nextDouble();
    }

    public double thanhTienHoaDonTheoNgay(){
        if(getSoNgayThue()<7){
            return getSoNgayThue()*getDonGia();
        }
        else{
            return getSoNgayThue()*getDonGia()*0.2;
        }
    }
    @Override
    public String toString() {
        return "HoaDonTheoNgay{" + super.toString()+
                "soNgayThue=" + soNgayThue +
                '}';
    }
}
