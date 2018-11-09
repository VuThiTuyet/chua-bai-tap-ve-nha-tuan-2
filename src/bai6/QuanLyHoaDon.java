package bai6;

public class QuanLyHoaDon {
    private HoaDonTheoGio[] hoaDonTheoGios;
    private HoaDonTheoNgay[] hoaDonTheoNgays;
    private int tongHoaDonTheoGio;
    private int tongHoaDonTheoNgay;

    public QuanLyHoaDon() {
    }

    public QuanLyHoaDon(HoaDonTheoGio[] hoaDonTheoGios, HoaDonTheoNgay[] hoaDonTheoNgays, int tongHoaDonTheoGio, int tongHoaDonTheoNgay) {
        this.hoaDonTheoGios = hoaDonTheoGios;
        this.hoaDonTheoNgays = hoaDonTheoNgays;
        this.tongHoaDonTheoGio = tongHoaDonTheoGio;
        this.tongHoaDonTheoNgay = tongHoaDonTheoNgay;
    }

    public QuanLyHoaDon(int tongHoaDonTheoGio, int tongHoaDonTheoNgay) {
        this.tongHoaDonTheoGio = tongHoaDonTheoGio;
        this.tongHoaDonTheoNgay = tongHoaDonTheoNgay;
        this.hoaDonTheoGios = new HoaDonTheoGio[this.tongHoaDonTheoGio];
        this.hoaDonTheoNgays = new HoaDonTheoNgay[this.tongHoaDonTheoNgay];
    }

    public HoaDonTheoGio[] getHoaDonTheoGios() {
        return hoaDonTheoGios;
    }

    public void setHoaDonTheoGios(HoaDonTheoGio[] hoaDonTheoGios) {
        this.hoaDonTheoGios = hoaDonTheoGios;
    }

    public HoaDonTheoNgay[] getHoaDonTheoNgays() {
        return hoaDonTheoNgays;
    }

    public void setHoaDonTheoNgays(HoaDonTheoNgay[] hoaDonTheoNgays) {
        this.hoaDonTheoNgays = hoaDonTheoNgays;
    }

    public int getTongHoaDonTheoGio() {
        return tongHoaDonTheoGio;
    }

    public void setTongHoaDonTheoGio(int tongHoaDonTheoGio) {
        this.tongHoaDonTheoGio = tongHoaDonTheoGio;
    }

    public int getTongHoaDonTheoNgay() {
        return tongHoaDonTheoNgay;
    }

    public void setTongHoaDonTheoNgay(int tongHoaDonTheoNgay) {
        this.tongHoaDonTheoNgay = tongHoaDonTheoNgay;
    }

    public void nhapHoaDonTheoGio(){
        for (int i = 0; i <this.tongHoaDonTheoGio ; i++) {
            this.hoaDonTheoGios[i] = new HoaDonTheoGio();
            this.hoaDonTheoGios[i].nhapHoaDonTheoGio();
        }
    }
    public void nhapHoaDonTheoNgay(){
        for (int i = 0; i <this.tongHoaDonTheoNgay ; i++) {
            this.hoaDonTheoNgays[i] = new HoaDonTheoNgay();
            this.hoaDonTheoNgays[i].nhapHoaDonTheoNgay();
        }
    }

    public void xuatHoaDonTheoGio(){
        for(HoaDonTheoGio x:hoaDonTheoGios){
            System.out.println(x.toString());
        }
    }
    public void xuatHoaDonTheoNgay(){
        for(HoaDonTheoNgay y:hoaDonTheoNgays){
            System.out.println(y.toString());
        }
    }

   public do
}
