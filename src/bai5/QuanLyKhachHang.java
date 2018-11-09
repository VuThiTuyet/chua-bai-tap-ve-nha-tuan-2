package bai5;

import bai3.QuanLy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QuanLyKhachHang {
    private KhachHangVietNam[] khachHangVietNams;
    private KhachHangNuocNgoai[] khachHangNuocNgoais;
    private int tongKhachHangVietNam;
    private int tongKhachHangNuocNgoai;

    public QuanLyKhachHang(){}

    public QuanLyKhachHang(KhachHangVietNam[] khachHangVietNams, KhachHangNuocNgoai[] khachHangNuocNgoais, int tongKhachHangVietNam, int tongKhachHangNuocNgoai) {
        this.khachHangVietNams = khachHangVietNams;
        this.khachHangNuocNgoais = khachHangNuocNgoais;
        this.tongKhachHangVietNam = tongKhachHangVietNam;
        this.tongKhachHangNuocNgoai = tongKhachHangNuocNgoai;
    }
    public QuanLyKhachHang(int tongKhachHangVietNam,int tongKhachHangNuocNgoai){
        this.tongKhachHangVietNam = tongKhachHangVietNam;
        this.tongKhachHangNuocNgoai = tongKhachHangNuocNgoai;
        this.khachHangVietNams = new KhachHangVietNam[this.tongKhachHangVietNam];
        this.khachHangNuocNgoais = new KhachHangNuocNgoai[this.tongKhachHangNuocNgoai];
    }

    public KhachHangVietNam[] getKhachHangVietNams() {
        return khachHangVietNams;
    }

    public void setKhachHangVietNams(KhachHangVietNam[] khachHangVietNams) {
        this.khachHangVietNams = khachHangVietNams;
    }

    public KhachHangNuocNgoai[] getKhachHangNuocNgoais() {
        return khachHangNuocNgoais;
    }

    public void setKhachHangNuocNgoais(KhachHangNuocNgoai[] khachHangNuocNgoais) {
        this.khachHangNuocNgoais = khachHangNuocNgoais;
    }

    public int getTongKhachHangVietNam() {
        return tongKhachHangVietNam;
    }

    public void setTongKhachHangVietNam(int tongKhachHangVietNam) {
        this.tongKhachHangVietNam = tongKhachHangVietNam;
    }

    public int getTongKhachHangNuocNgoai() {
        return tongKhachHangNuocNgoai;
    }

    public void setTongKhachHangNuocNgoai(int tongKhachHangNuocNgoai) {
        this.tongKhachHangNuocNgoai = tongKhachHangNuocNgoai;
    }

    public void nhapKhachHangVN(){
        for (int i = 0; i <this.tongKhachHangVietNam ; i++) {
            this.khachHangVietNams[i] = new KhachHangVietNam();
            this.khachHangVietNams[i].nhapKhachHangVN();
        }
    }
    public void nhapKhachHangNN(){
        for (int i = 0; i <this.tongKhachHangNuocNgoai ; i++) {
            this.khachHangNuocNgoais[i] = new KhachHangNuocNgoai();
            this.khachHangNuocNgoais[i].nhapKhachHangNuocNgoai();
        }
    }
    public void xuatKhachHangVN(){
        for(KhachHangVietNam x:khachHangVietNams){
            System.out.println(x.toString());
        }
    }
    public void xuatKhachHangNN(){
        for(KhachHangNuocNgoai y:khachHangNuocNgoais){
            System.out.println(y.toString());
        }
    }

    public double tongSoLuongKhachHangVietNam(){
        double tong = 0;
        for (int i = 0; i <this.tongKhachHangVietNam ; i++) {
            tong += this.khachHangVietNams[i].getSoLuong();
        }
        return tong;
    }

    public double tongSoLuongKhachHangNuocNgoai(){
        double tong= 0;
        for (int i = 0; i <this.tongKhachHangNuocNgoai ; i++) {
            tong += this.khachHangNuocNgoais[i].getSoLuong();
        }
        return tong;
    }


    public double tongTienKhachNuocNgoai(){
        double tongtien=0;
        for (int i = 0; i <this.tongKhachHangNuocNgoai ; i++) {
            tongtien += this.khachHangNuocNgoais[i].thanhTienKhachHangNuocNgoai();
        }
        return tongtien;
    }
    public double tbThanhTienChoKhachHangNuocNgoai(){
        return tongTienKhachNuocNgoai()/tongKhachHangNuocNgoai;
    }


    public void xuatHoaDonT9Nam2013CuaKhachHangVN(){
        Date ngaytruoc = new Date();
        Date ngaysau = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String ngaytruoct9 = "30/08/2013";
        try {
            ngaytruoc = df.parse(ngaytruoct9);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String ngaysauT9 = "01/10/2013";

        try {
            ngaysau = df .parse(ngaysauT9);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <this.tongKhachHangVietNam ; i++) {
            if(this.khachHangVietNams[i].getNgayRaHoaDon().after(ngaysau)&&this.khachHangVietNams[i].getNgayRaHoaDon().before(ngaytruoc)){
                System.out.println(this.khachHangVietNams[i].toString());
            }
        }
    }
    public void xuatHoaDonT9Nam2013CuaKhachHangNuocNgoai(){
        Date ngaytruoc = new Date();
        Date ngaysau = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String ngaytruoct9 = "30/08/2013";
        try {
            ngaytruoc = df.parse(ngaytruoct9);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String ngaysauT9 = "01/10/2013";

        try {
            ngaysau = df .parse(ngaysauT9);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <this.tongKhachHangNuocNgoai ; i++) {
            if(this.khachHangVietNams[i].getNgayRaHoaDon().after(ngaysau)&&this.khachHangVietNams[i].getNgayRaHoaDon().before(ngaytruoc)){
                System.out.println(this.khachHangVietNams[i].toString());
            }
        }
    }
}
