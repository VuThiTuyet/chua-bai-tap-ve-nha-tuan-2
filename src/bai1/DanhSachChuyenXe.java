package bai1;

public class DanhSachChuyenXe {
    private NgoaiThanh[] ngoaiThanhs;
    private NoiThanh[] noiThanhs;
    private int soLuongCXNoiT;
    private int soLuongCXNgoaiT;

    public DanhSachChuyenXe(int soLuongCXNoiT,int soLuongCXNgoaiT){
        this.soLuongCXNoiT = soLuongCXNoiT;
        this.soLuongCXNgoaiT = soLuongCXNgoaiT;
        this.noiThanhs = new NoiThanh[this.soLuongCXNoiT];
        this.ngoaiThanhs = new NgoaiThanh[this.soLuongCXNgoaiT];
    }

    public void nhapDSXeNoiThanh(){
        for (int i = 0; i <this.soLuongCXNoiT ; i++) {
            this.noiThanhs[i] = new NoiThanh();
            this.noiThanhs[i].nhapNoiThanh();
        }
    }
    public void nhapDSXeNgoaiThanh(){
        for (int i = 0; i <this.soLuongCXNgoaiT ; i++) {
            this.ngoaiThanhs[i] = new NgoaiThanh();
            this.ngoaiThanhs[i].nhapNgoaiThanh();
        }
    }

    public NgoaiThanh[] getNgoaiThanhs() {
        return ngoaiThanhs;
    }
    public void setNgoaiThanhs(NgoaiThanh[] ngoaiThanhs) {
        this.ngoaiThanhs = ngoaiThanhs;
    }
    public NoiThanh[] getNoiThanhs() {
        return noiThanhs;
    }
    public void setNoiThanhs(NoiThanh[] noiThanhs) {
        this.noiThanhs = noiThanhs;
    }
    public int getSoLuongCXNoiT() {
        return soLuongCXNoiT;
    }
    public void setSoLuongCXNoiT(int soLuongCXNoiT) {
        this.soLuongCXNoiT = soLuongCXNoiT;
    }
    public int getSoLuongCXNgoaiT() {
        return soLuongCXNgoaiT;
    }
    public void setSoLuongCXNgoaiT(int soLuongCXNgoaiT) {
        this.soLuongCXNgoaiT = soLuongCXNgoaiT;
    }


    public long tongDoanhThuXeNoiThanh(){
        long tong = 0;
        for (int i = 0; i <this.soLuongCXNoiT ; i++) {
             tong += this.noiThanhs[i].getDoanhThu();
            System.out.println("tong DT xe Noi thanh la:");
        }
        return tong;
    }

    public long tongDoanhThuXeNgoaiThanh(){
        long tong = 0;
        for (int i = 0; i <this.soLuongCXNgoaiT ; i++) {
            tong += this.ngoaiThanhs[i].getDoanhThu();
            System.out.println("tong DT xe NGoai Thanh la:");
        }
        return tong;
    }
}
