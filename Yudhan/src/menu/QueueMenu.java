/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import java.util.Stack;
import tools.Helper;

/**
 *
 * @author ASUS
 */
public class QueueMenu extends Helper{
public void menuQueue(){
        println("1. Tampilkan daftar menu makanan dan minuman\n" +
    "2. Tampilkan daftar menu makanan\n" +
    "3. Tampilkan daftar menu minuman\n" +
    "4. Menambahkan menu makanan baru\n" +
    "5. Menambahkan menu minuman baru\n" +
    "6. Menghapus menu makanan \n" +
    "7. Menghapus menu minuman \n" +
    "8. Mencari makanan/minuman yang diinginkan\n" +
    "9. Mengecek menu makanan/minuman pada urutan pertama");
       try{
       print("Pilih : ");
       pilih = sc.nextInt();
       } catch (Exception e) {
           println("Terjadi kesalahan : "+e);
       }
       sc.nextLine(); 
       menuMakanan();
       menuMinum();
        switch(pilih){
           case 1:
               println("makanan : "+makanQueue);
               println("minuman : "+minumQueue);
               break;
           case 2:
               println("makanan : "+makanQueue);
               break;
           case 3:
               println("minuman : "+minumQueue);
               break;
           case 4:
               addMakanan();
               break;
           case 5:
               addMinuman();
               break;
           case 6:
               deleteMakanan();
               break;
           case 7:
               deleteMinuman();
               break;
           case 8:
               searchMenu();
               break;
           case 9: 
               println("Makanan Pertama "+makanQueue.peek()+ "\n"+ "Minuman Pertama "+minumQueue.peek());
               break;
       }
    }
    public static void menuMakanan(){
       makanQueue.add("risol");
       makanQueue.add("mendoan");
       makanQueue.add("bakwan");
       makanQueue.add("dadar gulung");
    }
    public static void menuMinum(){
       minumQueue.add("boba");
       minumQueue.add("es sisri");
       minumQueue.add("es kacang");
       minumQueue.add("es kelapa");
    }
    public static void addMakanan(){
        println("Makanan saat ini : "+makanQueue);
        print("Tambahkan makanan : ");
        inputMakan = sc.nextLine();
        makanQueue.add(inputMakan);
        println("Menu makanan terbaru : "+makanQueue);
            
    }
    public static void addMinuman(){
        println("Minuman saat ini : "+minumQueue);
        print("Tambahkan minuman : ");
        inputMinum = sc.nextLine();
        minumQueue.add(inputMinum);
        println("Menu minuman terbaru : "+minumQueue);
    }
    public static void deleteMakanan(){
        println("Makanan saat ini : "+makanQueue);
        print("Hapus makanan : ");
        inputMakan = sc.nextLine();
        if (makanQueue.contains(inputMakan)) {
        makanQueue.remove(inputMakan);   
        }
        println("Makanan terbaru saat ini : "+makanQueue);
    }
    public static void deleteMinuman(){
        println("Minuman saat ini : "+minumQueue);
        print("Hapus minuman : ");
        inputMinum = sc.nextLine();
        if (minumQueue.contains(inputMinum)) {
        minumQueue.remove(inputMinum);   
        }
        println("Minuman terbaru saat ini : "+minumQueue);
    }
    public static void searchMenu(){
        print("Mencari makanan atau minuman : ");
        input = sc.nextLine();
        if (makanQueue.contains(input)) {
            println("Makanan "+input+" Tersedia silahkan di pesan");
        } else if (!makanQueue.contains(input)) {
            println("Makanan "+input+" Tidak Tersedia");
        } 
        if (minumQueue.contains(input)) {
            println("Minuman "+input+" Tersedia silahkan di pesan");
        } else if (!minumQueue.contains(input)) {
            println("Minuman "+input+" Tidak Tersedia");
        }
    }
    
}
