package bai1;

import java.util.Scanner;

public class NgoaiThanh extends Xe {
    private String noiDen;
    private int soNgayDiDuoc;

    public NgoaiThanh(){
        super();
    }

    public NgoaiThanh(String noiDen, int soNgayDiDuoc) {
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public NgoaiThanh(String maSoChuyen, String hoTenLaiXe, String soXe, long doanhThu, String noiDen, int soNgayDiDuoc){
        super(maSoChuyen,hoTenLaiXe,soXe,doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public void setNoiDen(String noiDen){this.noiDen = noiDen;}
    public void setSoNgayDiDuoc(int soNgayDiDuoc){this.soNgayDiDuoc = soNgayDiDuoc;}
    public String getNoiDen(){return this.noiDen;}
    public int getSoNgayDiDuoc(){return this.soNgayDiDuoc;}

    public void nhapNgoaiThanh(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("noi den =");
        this.noiDen = new Scanner(System.in).nextLine();
        System.out.println("so ngay di duoc =");
        this.soNgayDiDuoc = new Scanner(System.in).nextInt();
    }

    public String toString(){
        return "Ngoai Thanh {" +
                ", noi den = " + noiDen +
                ",so ngay di duoc = " + soNgayDiDuoc +
                '}';
    }
}
