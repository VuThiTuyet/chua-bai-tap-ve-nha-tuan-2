package bai3;

public class QuanLy {
    private GiaoDichTienTe[] giaoDichTienTes;
    private GiaoDichVang[] giaoDichVangs;
    private int tongGiaoDichTienTe;
    private int tongGiaoDichVang;

    public QuanLy(){}

    public QuanLy(GiaoDichTienTe[] giaoDichTienTes, GiaoDichVang[] giaoDichVangs, int tongGiaoDichTienTe, int tongGiaoDichVang) {
        this.giaoDichTienTes = giaoDichTienTes;
        this.giaoDichVangs = giaoDichVangs;
        this.tongGiaoDichTienTe = tongGiaoDichTienTe;
        this.tongGiaoDichVang = tongGiaoDichVang;
    }
    public QuanLy(int tongGiaoDichTienTe,int tongGiaoDichVang){
        this.tongGiaoDichTienTe = tongGiaoDichTienTe;
        this.tongGiaoDichVang = tongGiaoDichVang;
        this.giaoDichTienTes = new GiaoDichTienTe[this.tongGiaoDichTienTe];
        this.giaoDichVangs = new GiaoDichVang[this.tongGiaoDichVang];
    }

    public GiaoDichTienTe[] getGiaoDichTienTes() {
        return giaoDichTienTes;
    }

    public void setGiaoDichTienTes(GiaoDichTienTe[] giaoDichTienTes) {
        this.giaoDichTienTes = giaoDichTienTes;
    }

    public GiaoDichVang[] getGiaoDichVangs() {
        return giaoDichVangs;
    }

    public void setGiaoDichVangs(GiaoDichVang[] giaoDichVangs) {
        this.giaoDichVangs = giaoDichVangs;
    }

    public int getTongGiaoDichTienTe() {
        return tongGiaoDichTienTe;
    }

    public void setTongGiaoDichTienTe(int tongGiaoDichTienTe) {
        this.tongGiaoDichTienTe = tongGiaoDichTienTe;
    }

    public int getTongGiaoDichVang() {
        return tongGiaoDichVang;
    }

    public void setTongGiaoDichVang(int tongGiaoDichVang) {
        this.tongGiaoDichVang = tongGiaoDichVang;
    }

    public void nhapGiaoDichTienTe(){
        for (int i = 0; i <this.tongGiaoDichTienTe ; i++) {
            this.giaoDichTienTes[i] = new GiaoDichTienTe();
            this.giaoDichTienTes[i].nhapGiaoDichTienTe();
        }
    }
    public void nhapGiaoDichVang(){
        for (int i = 0; i <this.tongGiaoDichVang ; i++) {
            this.giaoDichVangs[i] = new GiaoDichVang();
            this.giaoDichVangs[i].nhapGiaoDichVang();
        }
    }


    public void xuatGiaoDichTienTe(){
        for(GiaoDichTienTe x:giaoDichTienTes){
            System.out.println(x.toString());
        }
    }
    public void xuatGiaoDichVang(){
        for(GiaoDichVang y:giaoDichVangs){
            System.out.println(y.toString());
        }
    }

    public int tongSoLuongVang(){
        int tong = 0;
        for (int i = 0; i <this.tongGiaoDichVang ; i++) {
            tong += this.giaoDichVangs[i].getSoLuong();
        }
        return tong;
    }
    public int tongSoLuongTienTe(){
        int tong = 0;
        for (int i = 0; i <this.tongGiaoDichTienTe ; i++) {
            tong += this.giaoDichTienTes[i].getSoLuong();
        }
        return tong;
    }

    public long tongTienGiaoDichTienTe(){
        long tong = 0;
        for (int i = 0; i <this.tongGiaoDichTienTe ; i++) {
            tong += this.giaoDichTienTes[i].thanhTienGDTT();
        }
        return tong;
    }
    public long trungBinhTienCuaGiaoDichTienTe()
    {
        return tongTienGiaoDichTienTe()/tongGiaoDichTienTe;
    }

    public void xuatDonGiaTienTeLonHonMotTy(){
        for (int i = 0; i <this.tongGiaoDichTienTe ; i++) {
            if(this.giaoDichTienTes[i].getDonGia() > 1000000000){
                System.out.println("don gia lon hon 1 ty la:\n");
                System.out.println(this.giaoDichTienTes[i].getDonGia());
            }
        }
    }
}
