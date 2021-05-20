package INHERITANCE_DAN_POLYMORPHISME;
public class persegipanjang_Yudhan extends bangundatar_Yudhan{
    public persegipanjang_Yudhan(){
    panjang = 10;
    lebar = 20;
    luas();
    keliling();
    }
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return luas;
    }
    
    float keliling(){
        float keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
    
}
