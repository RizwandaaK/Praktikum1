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
public class Persegi {
    Scanner input = new Scanner(System.in);
    
    String bangundatar;
    double p,l,hasil;
    
    void luaspersegi() {
        System.out.println("");
        System.out.println("Menghitung Luas Persegi");
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        
        hasil = p*l;
    
        System.out.println("Luasnya adalah: "+hasil);
    }
}   
