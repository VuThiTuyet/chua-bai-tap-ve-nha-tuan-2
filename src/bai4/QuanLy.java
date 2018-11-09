package bai4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QuanLy {
    private GiaoDichNha[] giaoDichNhas;
    private GiaoDichDat[] giaoDichDats;
    private int tongSoGiaoDichNha;
    private int tongSoGiaoDichDat;

    public QuanLy(){}

    public QuanLy(GiaoDichNha[] giaoDichNhas, GiaoDichDat[] giaoDichDats, int tongSoGiaoDichNha, int tongSoGiaoDichDat) {
        this.giaoDichNhas = giaoDichNhas;
        this.giaoDichDats = giaoDichDats;
        this.tongSoGiaoDichNha = tongSoGiaoDichNha;
        this.tongSoGiaoDichDat = tongSoGiaoDichDat;
    }
    public QuanLy(int tongSoGiaoDichNha,int tongSoGiaoDichDat){
        this.tongSoGiaoDichNha = tongSoGiaoDichNha;
        this.tongSoGiaoDichDat = tongSoGiaoDichDat;
        this.giaoDichDats = new GiaoDichDat[this.tongSoGiaoDichDat];
        this.giaoDichNhas = new GiaoDichNha[this.tongSoGiaoDichNha];
    }

    public GiaoDichNha[] getGiaoDichNhas() {
        return giaoDichNhas;
    }

    public void setGiaoDichNhas(GiaoDichNha[] giaoDichNhas) {
        this.giaoDichNhas = giaoDichNhas;
    }

    public GiaoDichDat[] getGiaoDichDats() {
        return giaoDichDats;
    }

    public void setGiaoDichDats(GiaoDichDat[] giaoDichDats) {
        this.giaoDichDats = giaoDichDats;
    }

    public int getTongSoGiaoDichNha() {
        return tongSoGiaoDichNha;
    }

    public void setTongSoGiaoDichNha(int tongSoGiaoDichNha) {
        this.tongSoGiaoDichNha = tongSoGiaoDichNha;
    }

    public int getTongSoGiaoDichDat() {
        return tongSoGiaoDichDat;
    }

    public void setTongSoGiaoDichDat(int tongSoGiaoDichDat) {
        this.tongSoGiaoDichDat = tongSoGiaoDichDat;
    }

    public void nhapGiaoDichNha(){
        for (int i = 0; i <this.tongSoGiaoDichNha ; i++) {
            this.giaoDichNhas[i] = new GiaoDichNha();
            this.giaoDichNhas[i].nhapGiaoDichNha();
        }
    }
    public void nhapGiaoDichDat(){
        for (int i = 0; i <this.tongSoGiaoDichDat; i++) {
            this.giaoDichDats[i] = new GiaoDichDat();
            this.giaoDichDats[i].nhapGiaoDichDat();
        }
    }

    public void xuatGiaoDichNha(){
        for(GiaoDichNha x:giaoDichNhas){
            System.out.println(x.toString());
        }
    }
    public void xuatGiaoDichDat(){
        for(GiaoDichDat y:giaoDichDats){
            System.out.println(y.toString());
        }
    }

    public double tongTBThanhTienGiaoDichDat(){
        double tong = 0;
        for (int i = 0; i <this.tongSoGiaoDichDat ; i++) {
            tong += this.giaoDichDats[i].thanhTienGiaoDichDat();
        }
        return tong;
    }

    public double trungBinhThanhTienGiaoDichDat(){
        return tongTBThanhTienGiaoDichDat()/tongSoGiaoDichDat;
    }

    public void xuatGiaoDichDatThang9Nam2013(){
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
        for (int i = 0; i <this.tongSoGiaoDichDat; i++) {
            if(this.giaoDichDats[i].getNgayGiaoDich().after(ngaytruoc) && this.giaoDichDats[i].getNgayGiaoDich().before(ngaysau)){
                System.out.println(this.giaoDichDats[i].toString());
            }
        }
    }
}
