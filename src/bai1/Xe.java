package bai1;

import java.util.Scanner;

public class Xe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private String soXe;
    private long doanhThu;

    public Xe(){}
    public Xe(String maSoChuyen,String hoTenTaiXe,String soXe,long doanhThu){
        this.soXe = soXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.maSoChuyen = maSoChuyen;
        this.doanhThu = doanhThu;
    }

    public void setMaSoChuyen(String maSoChuyen){this.maSoChuyen = maSoChuyen;}
    public void setHoTenTaiXe(String hoTenTaiXe){this.hoTenTaiXe = hoTenTaiXe;}
    public void setSoXe(String soXe){this.soXe = soXe;}
    public void setDoanhThu(long doanhThu){this.doanhThu = doanhThu;}

    public String getMaSoChuyen(){return this.maSoChuyen;}
    public String getHoTenTaiXe(){return this.hoTenTaiXe;}
    public String getSoXe(){return this.soXe;}
    public long getDoanhThu(){return this.doanhThu;}

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma so chuyen:");
        this.maSoChuyen = new Scanner(System.in).nextLine();
        System.out.println("nhap ho ten tai xe:");
        this.hoTenTaiXe = new Scanner(System.in).nextLine();
        System.out.println("nhap so xe:");
        this.soXe = new Scanner(System.in).nextLine();
        System.out.println("nhap doanh thu:");
        this.doanhThu = new Scanner(System.in).nextLong();
    }

    public String toString(){
        return "Xe {" +
                ", ma so chuyen = " + maSoChuyen +
                ", ho ten tai xe = " + hoTenTaiXe +
                ", so xe = " + soXe +
                ", doanh thu = " + doanhThu +
                '}';
    }
}
