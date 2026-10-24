public class Mahasiswa extends Orang {
    private String nim;
    private String prodi;
    private double ipk;
     
    public Mahasiswa(String id, String nama, String tanggallahir, String nim, String prodi, double ipk) {
        super(id, nama, tanggallahir);
        this.nim = nim;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIM             : " + nim);
        System.out.println("Program Studi   : " + prodi);
        System.out.println("IPK             : " + ipk);
    }
} 