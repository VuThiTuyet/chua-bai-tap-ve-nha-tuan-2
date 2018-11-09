package bai4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dientich;

    public GiaoDich(){}
    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, double dientich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dientich = dientich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDientich() {
        return dientich;
    }
    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public void nhapGiaoDich(){
        System.out.println("nhap ma giao dich");
        this.maGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("mhap ngay");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayGiaoDich = df.parse(ngay);
        } catch (ParseException e) {
                e.printStackTrace();
        }
        System.out.println("nhap don gia:");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("nhap dien tich:");
        this.dientich = new Scanner(System.in).nextDouble();
    }
    @Override
    public String toString() {
        return "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", dientich=" + dientich +
                '}';
    }
}
