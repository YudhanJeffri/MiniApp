/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspengenalanjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UangKembalian_YudhanJeffriDjuniartha {
    
    Scanner sc = new Scanner(System.in);
    int uang, total, kembalian, jml;
    int[] nominal={100000,50000,20000,10000,5000,2000,1000,500,200,100};
   public void uangKembalian(){
         
          Scanner scan = new Scanner(System.in);
          System.out.print("Masukan Jumlah Uang     : ");
          uang = scan.nextInt();
          System.out.print("Masukan Total Belanja :  ");
          total = scan.nextInt();
          kembalian = uang-total;
          System.out.println("Total Kembalian : " + kembalian);
          System.out.println("Uang Kembalian yang harus diberkina pada pelanggan : ");
          for(int i=0;i<nominal.length;i++){
              jml = kembalian/nominal[i];
              kembalian -= jml*nominal[i];
              if(jml==0){
              }else{
               System.out.println("*" + ") " + "Rp."+ nominal[i] + "= " + jml );  
              }
          }
    }
    
}
