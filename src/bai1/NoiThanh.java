package bai1;

import java.util.Scanner;

public class NoiThanh extends Xe {
    private double soKmDiDuoc;
    private int soTuyen;

    public NoiThanh(){
        super();
    }

    public NoiThanh(double soKmDiDuoc, int soTuyen) {
        this.soKmDiDuoc = soKmDiDuoc;
        this.soTuyen = soTuyen;
    }

    public NoiThanh(String maSoChuyen, String hoTenLaiXe, String soXe, long doanhThu, double soKmDiDuoc, int soTuyen){
        super(maSoChuyen,hoTenLaiXe,soXe,doanhThu);
        this.soKmDiDuoc = soKmDiDuoc;
        this.soTuyen = soTuyen;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc){this.soKmDiDuoc = soKmDiDuoc;}
    public void setSoTuyen(int soTuyen){this.soTuyen = soTuyen;}
    public double getSoKmDiDuoc(){return this.soKmDiDuoc;}
    public int getSoTuyen(){return this.soTuyen;}

    public void nhapNoiThanh(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so km di duoc=");
        this.soKmDiDuoc = new Scanner(System.in).nextDouble();
        System.out.println("nhap so tuyen = ");
        this.soTuyen = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "NoiThanh{" +
                ",soKmDiDuoc=" + soKmDiDuoc +
                ", soTuyen=" + soTuyen +
                '}';
    }

}
