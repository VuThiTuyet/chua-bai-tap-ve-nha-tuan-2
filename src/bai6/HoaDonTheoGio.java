package bai6;

import java.util.Date;
import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon {
    private double soGioThue;

    public HoaDonTheoGio(){
        super();
    }

    public HoaDonTheoGio(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia, double soGioThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    public void nhapHoaDonTheoGio(){
        super.nhapHoaDon();
        System.out.println("nhap so gio thue");
        this.soGioThue = new Scanner(System.in).nextDouble();
    }

    public double thanhTienHoaDonTheoGio(){
        if(getSoGioThue()>24 && getSoGioThue()<30){
            return getSoGioThue()*getDonGia();
        }else
        {
            System.out.println("khong dung hoa don theo gio, chuyen sang dung hoa don theo ngay!");
            return 0;
        }
    }
    @Override
    public String toString() {
        return "HoaDonTheoGio{" + super.toString()+
                "soGioThue=" + soGioThue +
                '}';
    }
}
