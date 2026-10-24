public class Orang {

    protected String id;
    protected String nama;
    protected String tanggallahir;

    public Orang(String id, String nama, String tanggallahir) {
        this.id = id;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
    }
    
    public void tampilkanInfo() {
        System.out.println("ID              : " + id);
        System.out.println("Nama            : " + nama);
        System.out.println("TanggalLahir    : " + tanggallahir);
    }
}