public class Dosen extends Orang {
    private String nidn;
    private String mataKuliahDiajar;

    public Dosen(String id, String nama, String tanggallahir, String nidn, String mataKuliahDiajar) {
        super(id, nama, tanggallahir);
        this.nidn = nidn;
        this.mataKuliahDiajar = mataKuliahDiajar;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIND            : " + nidn);
        System.out.println("MataKuliah      : " + mataKuliahDiajar);
    }
}