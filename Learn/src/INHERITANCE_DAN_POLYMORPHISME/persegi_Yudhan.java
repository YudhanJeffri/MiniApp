
package INHERITANCE_DAN_POLYMORPHISME;

public class persegi_Yudhan extends bangundatar_Yudhan{
    public persegi_Yudhan(){
    sisi = 5;
    luas();
    keliling();
    }
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }    
}
