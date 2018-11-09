package bai3;

import java.awt.print.PrinterAbortException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    private String dealId;
    private Date ngayGiaoDich;
    private long donGia;
    private int soLuong;

    public GiaoDich(){}
    public GiaoDich(String dealId, Date ngayGiaoDich, long donGia, int soLuong) {
        this.dealId = dealId;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getDealId() {
        return dealId;
    }
    public void setDealId(String dealId) {
        this.dealId = dealId;
    }
    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public long getDonGia() {
        return donGia;
    }
    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhapGiaoDich() {
        System.out.println("nhap ma giao dich:");
        this.dealId = new Scanner(System.in).nextLine();
        System.out.println("nhap ngay giao dich:");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try {
                this.ngayGiaoDich = df.parse(ngay);
        } catch (ParseException e) {
                e.printStackTrace();
        }
        System.out.println("nhap don gia:");
        this.donGia = new Scanner(System.in).nextLong();
        System.out.println("nhap so luong:");
        this.soLuong = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "dealId='" + dealId + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }
}
