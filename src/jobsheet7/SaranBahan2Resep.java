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
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("bahan kedua: ");
            if(bahan 1 == 1) {
                System.out.println("1. susu");
                System.out.println("2. minyak goreng");
                System.out.println("3. tidak ada");          
        }else{
                System.out.println("1. minyak goreng");
                System.out.println("2. roti");
                System.out.println("3. tidak ada");
        }
        System.out.print("masukkan no pilihan anda : ");
        int bahan2 = scanner.nextInt();
        
        }else
            System.out.println("mohon maaf pilihan tidak ditemukan," + "tidak dapat memberikan saran resep");
        
                
                
            
        }
            
        }
    }
}
