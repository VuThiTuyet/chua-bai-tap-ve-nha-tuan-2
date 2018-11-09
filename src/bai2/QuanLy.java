package bai2;

public class QuanLy {
    private SachThamKhao[] sachThamKhaos;
    private SachGiaoKhoa[] sachGiaoKhoas;
    private int tongSachTk;
    private int tongSachGK;

    public QuanLy(){}

    public QuanLy(SachThamKhao[] sachThamKhaos, SachGiaoKhoa[] sachGiaoKhoas, int tongSachTk, int tongSachGK) {
        this.sachThamKhaos = sachThamKhaos;
        this.sachGiaoKhoas = sachGiaoKhoas;
        this.tongSachTk = tongSachTk;
        this.tongSachGK = tongSachGK;
    }

    public QuanLy(int tongSachGK, int tongSachTk){
        this.tongSachTk = tongSachTk;
        this.tongSachGK = tongSachGK;
        this.sachThamKhaos = new SachThamKhao[this.tongSachTk];
        this.sachGiaoKhoas = new SachGiaoKhoa[this.tongSachGK];
    }

    public SachThamKhao[] getSachThamKhaos(){
        return sachThamKhaos;
    }
    public void setSachThamKhaos(SachThamKhao[] sachThamKhaos){
        this.sachThamKhaos = sachThamKhaos;
    }
    public SachGiaoKhoa[] getSachGiaoKhoas() {
        return sachGiaoKhoas;
    }
    public void setSachGiaoKhoas(SachGiaoKhoa[] sachGiaoKhoas) {
        this.sachGiaoKhoas = sachGiaoKhoas;
    }
    public int getTongSachTk() {
        return tongSachTk;
    }
    public void setTongSachTk(int tongSachTk) {
        this.tongSachTk = tongSachTk;
    }
    public int getTongSachGK() {
        return tongSachGK;
    }
    public void setTongSachGK(int tongSachGK) {
        this.tongSachGK = tongSachGK;
    }

    public void nhapDSSGK(){
        for (int i = 0; i <this.tongSachGK ; i++) {
            this.sachGiaoKhoas[i] = new SachGiaoKhoa();
            this.sachGiaoKhoas[i].nhapSGK();
        }
    }
    public void nhapDSSTK(){
        for (int i = 0; i <this.tongSachTk ; i++) {
            this.sachThamKhaos[i] = new SachThamKhao();
            this.sachThamKhaos[i].nhapSTK();
        }
    }

    public long tongTienSGK(){
        long tong = 0;
        for (int i = 0; i < this.tongSachGK ; i++) {
            tong += this.sachGiaoKhoas[i].thanhTien();
        }
        return tong;
    }
    public long tongTienSTK() {
        long tong = 0;
        for (int i = 0; i < this.tongSachTk ; i++) {
            tong = this.sachThamKhaos[i].thanhTien();
        }
        return tong;
    }

    public long tbcDonGiaSTK(){
        return tongTienSTK()/tongSachTk;
    }


    public void xuatSGK(){
        for (SachGiaoKhoa x:sachGiaoKhoas) {
            System.out.println(x.toString()+"\n");
        }
    }
    public void xuatSTK(){
        for(SachThamKhao y:sachThamKhaos){
            System.out.println(y.toString() + "\n");
        }
    }

    public void xuatSGKnxbX(){
        for (int i = 0; i <this.tongSachGK ; i++) {
            if(this.sachGiaoKhoas[i].getNhaXuatBan().equals("X")){
                System.out.println("sgk cua nxb X la:\n");
                System.out.println(this.sachGiaoKhoas[i].toString());
            }
        }

    }
}
