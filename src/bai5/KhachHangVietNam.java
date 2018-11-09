package bai5;

import java.util.Scanner;

public class KhachHangVietNam extends KhachHang {
    private String doiTuongKhachHang;
    private double dinhMuc;

    KhachHangVietNam(){
        super();
    }

    public KhachHangVietNam(String doiTuongKhachHang, double dinhMuc) {
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public void nhapKhachHangVN() {
        super.nhapKhachHang();
        System.out.println("nhap dinh muc:");
        this.dinhMuc = new Scanner(System.in).nextDouble();
        do {
            System.out.println("nhap doi tuong khach hang(sinh hoat,kinh doanh,san xuat):");
            this.doiTuongKhachHang = new Scanner(System.in).nextLine();
            if (!this.doiTuongKhachHang.equals("sinh hoat") && !this.doiTuongKhachHang.equals("kinh doanh") && !this.doiTuongKhachHang.equals("san xuat")) {
                System.out.println("nhap sai, nhap lai!");
            }
        }while(!this.doiTuongKhachHang.equals("sinh hoat") && !this.doiTuongKhachHang.equals("kinh doanh") && !this.doiTuongKhachHang.equals("san xuat"));
    }

    public double thanhTienKhachHangVN(){
        if(getSoLuong() <= getDinhMuc()){
            return getSoLuong()*getDonGia();
        }else
        {
            return getSoLuong()*getDonGia()*getDinhMuc()+((getSoLuong()-getDinhMuc())*getDonGia()*2.5);
        }
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" + super.toString()+
                "doiTuongKhachHang='" + doiTuongKhachHang + '\'' +
                ", dinhMuc=" + dinhMuc +
                '}';
    }
}
