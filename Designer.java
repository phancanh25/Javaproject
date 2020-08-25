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
public class Designer extends Info {
    protected int Bonus;

    public Designer() {
        this.Bonus = 0;
    }

    public Designer(int Bonus, String MaNV, String HoTen, String DiaChi, int Ngaybd, int Thangbd, int Nambd, int HeSoLuong, int LuongCanBan) {
        super(MaNV, HoTen, DiaChi, Ngaybd, Thangbd, Nambd, HeSoLuong, LuongCanBan);
        this.Bonus = Bonus;
    }
    
    int TinhLuong(){return LuongCanBan + HeSoLuong + Bonus;}
    
    protected void NhapDes(){
        System.out.println("Bonus: ");
        this.Bonus = sc.nextInt();
    }
    
    public String toStringdes() {
        return "Designer{" + "Bonus=" + Bonus + '}';
    }

    
    
}
