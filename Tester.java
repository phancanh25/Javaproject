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
public class Tester extends Info{
    protected int Error;

    public Tester(int Error) {
        this.Error = 0;
    }

    public Tester(int Error, String MaNV, String HoTen, String DiaChi, int Ngaybd, int Thangbd, int Nambd, int HeSoLuong, int LuongCanBan) {
        super(MaNV, HoTen, DiaChi, Ngaybd, Thangbd, Nambd, HeSoLuong, LuongCanBan);
        this.Error = Error;
    }
    
    int TinhLuong(){return LuongCanBan + HeSoLuong + Error * 200000;}
}
