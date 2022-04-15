/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class ujibus2 {
    public static void main(String[] args) {
        bus2 busmini4 = new bus2(10);
        busmini4.getpassword(40);
        busmini4.getpassword(90);
        busmini4.cetak();
        
       
        busmini4.pluspenumpang(3);
        busmini4.cetak();
        
        busmini4.pluspenumpang(1);
        busmini4.cetak();
        
        busmini4.pluspenumpang(1);
        busmini4.cetak();
    }
}

