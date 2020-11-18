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
public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
