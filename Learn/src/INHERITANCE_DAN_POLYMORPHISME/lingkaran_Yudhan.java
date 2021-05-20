/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INHERITANCE_DAN_POLYMORPHISME;

/**
 *
 * @author ASUS
 */
public class lingkaran_Yudhan extends bangundatar_Yudhan{
    public lingkaran_Yudhan(){
    r = 10;
    luas();
    keliling();
    }
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
}
