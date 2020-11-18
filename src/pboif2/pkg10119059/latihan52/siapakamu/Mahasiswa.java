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
public class Mahasiswa extends Manusia {
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar di kelas "+getKelas());
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
