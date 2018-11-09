package bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich{
    private String loaiDat;

    public GiaoDichDat(){
        super();
    }

    public GiaoDichDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dientich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dientich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public void nhapGiaoDichDat(){
        super.nhapGiaoDich();
        do {
            System.out.println("nhap loai dat(A,B,C):");
            this.loaiDat = new Scanner(System.in).nextLine();
            if(!this.loaiDat.equals("A") && !this.loaiDat.equals("B") && !this.loaiDat.equals("C")) {
                System.out.println("nhap sai, nhap lai!");
            }
        }while(!this.loaiDat.equals("A") && !this.loaiDat.equals("B") && !this.loaiDat.equals("C"));
    }

    public double thanhTienGiaoDichDat(){
        if(this.loaiDat.equals("A")){
            return getDientich()*getDonGia()*1.5;
        }else
        {
            return getDientich()*getDonGia();
        }
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" + super.toString()+
                "loaiDat='" + loaiDat + '\'' +
                '}';
    }
}
