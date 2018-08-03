/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SaranBahan2Resep {
    public static void main(String[] args) {
        String identitas = "regita putri rozi / x rpl 5 / 35";
        System.out.println("identitas :" + identitas);
        
        System.out.println("\nSaran Resep Dari Bahan Milik Anda\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bahan pertama: ");
        System.out.println("1. pisang");
        System.out.println("2. telur");
        System.out.print("masukkan no pilihan anda :");
        int bahan1 = scanner.nextInt();
    }
}
