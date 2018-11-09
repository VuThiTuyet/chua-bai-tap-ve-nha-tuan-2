package bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(){
        super();
    }

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dientich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dientich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public void nhapGiaoDichNha(){
        super.nhapGiaoDich();
        System.out.println("nhap dia chi");
        this.diaChi = new Scanner(System.in).nextLine();
        do{
            System.out.println("nhap loai nha:");
            this.loaiNha = new Scanner(System.in).nextLine();
            if(!loaiNha.equals("cao cap") && !loaiNha.equals("thuong")){
                System.out.println("nhap sai, nhap lai");
            }
        }while (!loaiNha.equals("cao cap") && !loaiNha.equals("thuong"));
        this.loaiNha = loaiNha;
    }

    public double tinhThanhTienGiaoDichNha(){
        if(this.loaiNha.equals("cao cap") ){
            return getDientich()*getDonGia();
        }else
        {
            return getDientich()*getDonGia()*0.9;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" + super.toString()+
                "loaiNha='" + loaiNha + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
