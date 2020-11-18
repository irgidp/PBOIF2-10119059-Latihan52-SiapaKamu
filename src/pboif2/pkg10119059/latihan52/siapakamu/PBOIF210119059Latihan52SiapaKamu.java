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
public class PBOIF210119059Latihan52SiapaKamu {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Dosen dosen = new Dosen();
        
        dosen.setNip("41227829930");
        System.out.println("NIP Dosen : " +dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        mhs.setNim("10110269");
        mhs.setKelas("PBO2");
        System.out.println("NIM : " +mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
