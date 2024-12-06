package CM_Daspro_1G_21_3;

import java.util.Scanner;

public class caseMethod {

	static void 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu, noMeja;
		String namaPelanggan;
		while (true) {
            System.out.println("===== Menu UTAMA =====");
            System.out.println("1. Tambah Data");
			System.out.println("2. Tampilkan Daftar Pesanan");
			System.out.println("3. Keluar");
			System.out.print("Pilih menu: ");
			menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.println("Masukkan nama pelanggan: ");
				namaPelanggan = sc.nextLine();
				System.out.println("Masukkan nomor meja: ");
				noMeja = sc.nextInt();
				System.out.println("===== MENU KAFE =====");
				System.out.println("1. Kopi Hitam - Rp 15000");
				System.out.println("2. Latte - Rp 22000");
				System.out.println("3. Teh Tarik - Rp 12000");
				System.out.println("4. Mie Goreng - Rp 18000");
			} else if (menu == 2) {
				
			} else if (menu == 3) {
				break;
			}
        }
	}
}