package bai3;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy(2,1);
        quanLy.nhapGiaoDichTienTe();
        quanLy.xuatGiaoDichTienTe();
        System.out.println(quanLy.tongSoLuongTienTe());
        System.out.println(quanLy.trungBinhTienCuaGiaoDichTienTe());
        quanLy.xuatDonGiaTienTeLonHonMotTy();
        //giao dich vang tuong tu
    }
}
