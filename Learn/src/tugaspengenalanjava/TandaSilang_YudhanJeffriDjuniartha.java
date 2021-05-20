/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspengenalanjava;

/**
 *
 * @author ASUS
 */
public class TandaSilang_YudhanJeffriDjuniartha {
    int length = 5;
    int width = 5;

    public void silang(){
        int length = 5;
        int width = 5;
        for(int i=0; i<width; i++){
            for(int j=0; j<length; j++){
                if(i==j  || (i+j)%width==width-1){
                    System.out.print("@");
                }else{
                    System.out.print("=");
                }
            }System.out.println();
        }
    }
}
