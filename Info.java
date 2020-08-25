/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuoiky;

/**
 *
 * @author canh
 */
public class Info {
    protected String MaNV,HoTen,DiaChi;
    protected int Ngaybd,Thangbd,Nambd,HeSoLuong;
    protected int LuongCanBan;
    protected Info(){
        this.DiaChi = "";
        this.HoTen = "";
        this.MaNV = "";
        this.HeSoLuong = 0;
        this.Thangbd = 0;
        this.Nambd = 0;
        this.Ngaybd = 0;
        this.LuongCanBan = 0;
    }

    public Info(String MaNV, String HoTen, String DiaChi, int Ngaybd, int Thangbd, int Nambd, int HeSoLuong, int LuongCanBan) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.Ngaybd = Ngaybd;
        this.Thangbd = Thangbd;
        this.Nambd = Nambd;
        this.HeSoLuong = HeSoLuong;
        this.LuongCanBan = LuongCanBan;
    }
    
    public void setHoTen(String HoTen){
        this.HoTen= HoTen;
    }
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    public void setNgaybd(int Ngaybd) {
        this.Ngaybd = Ngaybd;
    }
    public void setThangbd(int Thangbd) {
        this.Thangbd = Thangbd;
    }
    public void setNambd(int Nambd) {
        this.Nambd = Nambd;
    }
    public void setHeSoLuong(int HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }
    public void setLuongCanBan(int LuongCanBan) {
        this.LuongCanBan = LuongCanBan;
    }
    public String getHoTen(){
        return HoTen;
    }
    public String getMaNV() {
        return MaNV;
    }
    public String getDiaChi() {
        return DiaChi;
    }
    public int getNgaybd() {
        return Ngaybd;
    }
    public int getThangbd() {
        return Thangbd;
    }
    public int getNambd() {
        return Nambd;
    }
    public int getHeSoLuong() {
        return HeSoLuong;
    }
    public int getLuongCanBan() {
        return LuongCanBan;
    }
    int TinhLuong(){return 0;}
}
