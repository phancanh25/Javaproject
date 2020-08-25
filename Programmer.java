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
public class Programmer extends Info{
    private int OverTime;
    public Programmer() {
        super();
        this.OverTime = 0;
    }

    public Programmer(String MaNV, String HoTen, String DiaChi, int Ngaybd, int Thangbd, int Nambd, int HeSoLuong, int LuongCanBan,int OverTime) {
        super(MaNV, HoTen, DiaChi, Ngaybd, Thangbd, Nambd, HeSoLuong, LuongCanBan);
        this.OverTime = OverTime;
    }
    int TinhLuong(){
        return LuongCanBan + HeSoLuong + OverTime;
    }
    protected void Nhappro(){
        System.out.println("OverTime: ");
        this.OverTime = sc.nextInt();
    }

    public String toStringpro() {
        return "Programmer{" + "OverTime=" + OverTime + '}';
    }

    
    
    
    
}
