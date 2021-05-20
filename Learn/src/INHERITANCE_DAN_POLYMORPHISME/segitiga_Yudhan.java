
package INHERITANCE_DAN_POLYMORPHISME;
public class segitiga_Yudhan extends bangundatar_Yudhan{
    public segitiga_Yudhan(){
    alas = 3;
    tinggi = 4;
    sisi = 5;   
    luas();
    keliling();
    }
    float luas() {
        float luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }  
    float keliling(){
        float keliling = alas + tinggi + sisi;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
    
}
