package bai3;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{
    private long tiGia;
    private String tienTe;

    public GiaoDichTienTe(){
        super();
    }

    public GiaoDichTienTe(long tiGia,String tienTe) {
        this.tiGia = tiGia;
        this.tienTe= tienTe;
    }

    public GiaoDichTienTe(String dealId, Date ngayGiaoDich, long donGia, int soLuong, long tiGia,String tienTe) {
        super(dealId, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.tienTe = tienTe;
    }

    public long getTiGia() {
        return tiGia;
    }
    public void setTiGia(long tiGia) {
        this.tiGia = tiGia;
    }
    private String getTienTe(){return tienTe;}
    private void setTienTe(String tienTe){this.tienTe = tienTe;}

    public void nhapGiaoDichTienTe(){
        super.nhapGiaoDich();
        System.out.println("nhap ti gia:");
        this.tiGia = new Scanner(System.in).nextLong();
        do{
            System.out.println("nhap cac loai tien te(USD hoac Euro hoac VN:");
            tienTe = new Scanner(System.in).nextLine();
            if(!tienTe.equals("USD") && !tienTe.equals("Euro") && !tienTe.equals("VN")) {
                System.out.println("nhap sai, nhap lai di!");
            }
        }while (!this.tienTe.equals("USD") && !this.tienTe.equals("Euro") && !this.tienTe.equals("VN"));
            this.tienTe = tienTe;
    }

    public long thanhTienGDTT(){
        if(this.tienTe.equals("VN")){
            return getSoLuong()*getDonGia();
        }
        else{
            return getSoLuong()*getDonGia()*getTiGia();
        }
    }
    @Override
    public String toString() {
        return "GiaoDichTienTe{" + super.toString()+
                "tiGia=" + tiGia +
                '}';
    }
}
