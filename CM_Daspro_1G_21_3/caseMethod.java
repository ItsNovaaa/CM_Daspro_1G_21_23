package CM_Daspro_1G_21_3;

import java.util.Scanner;

public class caseMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu, noMeja;
		String namaPelanggan;
		String[] Menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar"};
		int[] harga = {1000, 2000, 3000, 4000};
		String []MenuPilihan = new String[4];
		double []MenuTotalHarga = new double[4];

		while (true) {
            System.out.println("===== Menu UTAMA =====");
            System.out.println("1. Tambah Data");
			System.out.println("2. Tampilkan Daftar Pesanan");
			System.out.println("3. Keluar");
			System.out.print("Pilih menu: ");
			menu = sc.nextInt();
			System.out.println("Masukkan nomor meja: ");
			noMeja = sc.nextInt();
			sc.nextLine();
			System.out.println("Masukkan nama pelanggan: ");
			namaPelanggan = sc.nextLine();
			
			if (menu == 1) {
				TambahPesanan(Menu,harga);
				// System.out.println("===== MENU KAFE =====");
				// System.out.println("1. Kopi Hitam - Rp 15000");
				// System.out.println("2. Latte - Rp 22000");
				// System.out.println("3. Teh Tarik - Rp 12000");
				// System.out.println("4. Mie Goreng - Rp 18000");
			} else if (menu == 2) {
				
			} else if (menu == 3) {
				break;
			}

			
        }
	}

	public static void TambahPesanan(String[] Menu, int[] harga) {
		while (true) { 
			String []MenuPilihan = new String[4]; 
			double []MenuTotalHarga = new double[4];
			System.out.println("===== MENU KAFE =====");
			System.out.println("1. Kopi Hitam - Rp 15000");
			System.out.println("2. Latte - Rp 22000");
			System.out.println("3. Teh Tarik - Rp 12000");
			System.out.println("4. Mie Goreng - Rp 18000");

			System.out.println("Pilih Menu: ");
			int menuKafe = new Scanner(System.in).nextInt();
			System.out.println("Pilih Menu: ");
			int jumlahMenu = new Scanner(System.in).nextInt();

			if (menuKafe == 1) {
				MenuPilihan[0] = Menu[menuKafe-1];
				MenuTotalHarga[0] = 15000;
			}

			
			
		}



	}
}