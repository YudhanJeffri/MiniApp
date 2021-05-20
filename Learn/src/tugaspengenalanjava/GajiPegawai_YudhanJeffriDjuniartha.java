/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspengenalanjava;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GajiPegawai_YudhanJeffriDjuniartha {
    String nama_pegawai;
    int jumlah_kehadiran,gaji,potong;
   
    public void gajiPegawai(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("|--------------------------|");
        System.out.print("Masukkan Nama Pegawai : ");
        nama_pegawai = sc.nextLine();
        System.out.print("Masukkan Jumlah Kehadiran : ");
        jumlah_kehadiran = sc.nextInt();
        gaji = 50000*jumlah_kehadiran;
        potong = gaji - gaji/10/100;
         if (jumlah_kehadiran < 20){
            System.out.println("Gaji "+nama_pegawai+ " adalah Rp "+potong);
        } else {
            System.out.println("Gaji "+nama_pegawai+ " adalah Rp "+gaji);
        }
         sc.nextLine();
        }
        
    }
}
