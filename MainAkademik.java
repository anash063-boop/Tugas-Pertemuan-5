public class MainAkademik {
    public static void main(String[]args) {
        Dosen d1 = new Dosen("D001", "Dr, Siti Rahma", "12-05-1980", "0412058001", "Pemograman Objek");
        Mahasiswa m1 = new Mahasiswa("M001", "Anas Pratama", "03-09-2004", "2310101001", "Sistem Informasi", 3.75);

        System.out.println("=== Data Dosen ===");
        d1.tampilkanInfo();
        System.out.println();
        System.out.println("=== Data Mahasiswa ===");
        m1.tampilkanInfo();
    }
}