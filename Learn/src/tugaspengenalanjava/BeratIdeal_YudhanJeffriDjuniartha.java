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
public class BeratIdeal_YudhanJeffriDjuniartha {
    static Double bb, rumus; static int pilih; static String nama, jk; static Scanner sc = new Scanner(System.in);
    static void beratIdeal(){
        System.out.print("Masukkan nama : ");
        nama = sc.next();
        System.out.println("1. Pria");
        System.out.println("2. Perempuan");
        System.out.print("Pilih Jenis Kelamin : ");      
        while (!sc.hasNextDouble()){
                    System.out.println("Input is not a number");
                    System.out.print("Pilih Jenis Kelamin : ");
                    sc.nextLine();
                }
        pilih = sc.nextInt();
        switch(pilih){
            case 1:jk = "Pria";
                System.out.print("Masukkan Tinggi Badan : ");
                while (!sc.hasNextInt()){
                    System.out.println("Input is not a number");sc.nextLine();
                }bb = sc.nextDouble();
                rumus = (bb - 100) - (bb-100)*10/100;
                System.out.println("Berat badan ideal "+nama+" berjenis kelamin "+jk+" berat "+rumus);
                break;
            case 2:jk = "Perempuan";
                System.out.print("Masukkan Tinggi Badan : ");
                while (!sc.hasNextInt()){
                    System.out.println("Input is not a number");sc.nextLine();
                }bb = sc.nextDouble();
                rumus = (bb - 100) - (bb-100)*15/100;
                System.out.println("Berat badan ideal "+nama+" berjenis kelamin "+jk+" berat "+rumus);
                break;    
        }
    }
}
