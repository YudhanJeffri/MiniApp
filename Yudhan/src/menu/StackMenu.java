/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import tools.Helper;
import static tools.Helper.print;
import static tools.Helper.println;
import static tools.Helper.sc;

/**
 *
 * @author ASUS
 */
public class StackMenu extends Helper{
    
    public void menuStack(){ 
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
               println("makanan : "+makanStack);
               println("minuman : "+minumStack);
               break;
           case 2:
               println("makanan : "+makanStack);
               break;
           case 3:
               println("minuman : "+minumStack);
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
               println("Makanan Pertama "+makanStack.pop()+ "\n"+ "Minuman Pertama "+minumStack.pop());
               break;
       }
    }
    public static void menuMakanan(){
       makanStack.push("risol");
       makanStack.push("mendoan");
       makanStack.push("bakwan");
       makanStack.push("dadar gulung");
    }
    public static void menuMinum(){
       minumStack.push("boba");
       minumStack.push("es sisri");
       minumStack.push("es kacang");
       minumStack.push("es kelapa");
    }
    public static void addMakanan(){
        println("Makanan saat ini : "+makanStack);
        print("Tambahkan makanan : ");
        inputMakan = sc.nextLine();
        makanStack.push(inputMakan);
        println("Menu makanan terbaru : "+makanStack);
            
    }
    public static void addMinuman(){
        println("Minuman saat ini : "+minumStack);
        print("Tambahkan minuman : ");
        inputMinum = sc.nextLine();
        minumStack.push(inputMinum);
        println("Menu minuman terbaru : "+minumStack);
    }
    public static void deleteMakanan(){
        println("Makanan saat ini : "+makanStack);
        print("Hapus makanan : ");
        inputMakan = sc.nextLine();
        if (makanStack.contains(inputMakan)) {
        makanStack.remove(inputMakan);   
        }
        println("Makanan terbaru saat ini : "+makanStack);
    }
    public static void deleteMinuman(){
        println("Minuman saat ini : "+minumStack);
        print("Hapus minuman : ");
        inputMinum = sc.nextLine();
        if (minumStack.contains(inputMinum)) {
        minumStack.remove(inputMinum);   
        }
        println("Minuman terbaru saat ini : "+minumStack);
    }
    public static void searchMenu(){
        print("Mencari makanan atau minuman : ");
        input = sc.nextLine();
        if (makanStack.contains(input)) {
            println("Makanan "+input+" Tersedia silahkan di pesan");
        } else if (!makanStack.contains(input)) {
            println("Makanan "+input+" Tidak Tersedia");
        } 
        if (minumStack.contains(input)) {
            println("Minuman "+input+" Tersedia silahkan di pesan");
        } else if (!minumStack.contains(input)) {
            println("Minuman "+input+" Tidak Tersedia");
        }
    }
}
