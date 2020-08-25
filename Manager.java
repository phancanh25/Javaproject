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
public class Manager extends Info{

    public Manager() {
    }

    public Manager(String MaNV, String HoTen, String DiaChi, int Ngaybd, int Thangbd, int Nambd, int HeSoLuong, int LuongCanBan) {
        super(MaNV, HoTen, DiaChi, Ngaybd, Thangbd, Nambd, HeSoLuong, LuongCanBan);
    }
    
    int TinhLuong(){return LuongCanBan + HeSoLuong;}
}
