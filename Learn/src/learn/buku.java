/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author ASUS
 */
public class buku {
    private int id;
    private String judul_buku;
    private String pengarang;
    private String penerbit;
    private int jumlah_buku;
    private int jumlah_halaman;
    private byte[] pic;

    public buku(int id, String judul_buku, String pengarang, String penerbit, int jumlah_buku, int jumlah_halaman, byte[] pic) {
        this.id = id;
        this.judul_buku = judul_buku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.jumlah_buku = jumlah_buku;
        this.jumlah_halaman = jumlah_halaman;
        this.pic = pic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJumlah_buku() {
        return jumlah_buku;
    }

    public void setJumlah_buku(int jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
    
    
           
            
    
}
