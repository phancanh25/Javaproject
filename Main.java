/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuoiky;
import java.util.*;
/**
 *
 * @author canh
 */
public class Main {
    public static void main(String[] args) {
    
        Programmer Proger = new Programmer();
        Designer Deser = new Designer();
        Tester Teser = new Tester();
        Manager Maner = new Manager();
        
        
        Proger.nhap();
        Proger.Nhappro();
        System.out.println(Proger.toString());
        System.out.println(Proger.toStringpro());
        
        
    }
    
    
    
    
}
