package bai5;

import java.util.Date;
import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachHangNuocNgoai(){
        super();
    }

    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(String maKhachHang, String hoTenKhachHang, Date ngayRaHoaDon, double soLuong, double donGia, String quocTich) {
        super(maKhachHang, hoTenKhachHang, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void nhapKhachHangNuocNgoai(){
        super.nhapKhachHang();
        System.out.println("nhap quoc tich:");
        this.quocTich = new Scanner(System.in).nextLine();
    }

    public double thanhTienKhachHangNuocNgoai(){
        return getDonGia()*getSoLuong();
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" + super.toString()+
                "quocTich='" + quocTich + '\'' +
                '}';
    }
}
