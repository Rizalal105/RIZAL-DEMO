import java.util.Scanner;

class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan login
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Untuk menangani newline setelah nextInt()

        // Menangani pilihan login
        if (pilihan == 1) {
            // Login Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Cek apakah username dan password sesuai
            if (username.equals("Admin15") && password.equals("sayaadmin1")) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine(); //objek
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Cek apakah nama dan NIM sesuai
            if (nama.equals("Rizal al syahril") && nim.equals("202410370110105")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            // Pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}