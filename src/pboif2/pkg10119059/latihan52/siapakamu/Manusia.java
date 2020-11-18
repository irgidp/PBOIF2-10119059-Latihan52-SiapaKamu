/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Siapa Kamu
 */
package pboif2.pkg10119059.latihan52.siapakamu;
/**
 *
 * @author Corazon
 */
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya manusia");
    }
}
