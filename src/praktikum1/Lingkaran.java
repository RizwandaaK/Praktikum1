/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;
import java.util.Scanner;
/**
 *
 * @author rizwa
 */
public class Lingkaran {
    Scanner input = new Scanner(System.in);
    
    String bangundatar;
    double r,hasil;
    
    void luaslingkaran() {
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan jari-jari(r): ");
        r = input.nextInt();
        
        hasil = (3.1428571428571 * r * r);
    
        System.out.println("Luasnya adalah: "+hasil);
    }
}
