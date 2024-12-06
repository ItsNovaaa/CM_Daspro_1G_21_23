package CM_Daspro_1G_21_3;

import java.util.Scanner;

public class caseMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu, noMeja;
		String namaPelanggan;
		String[] Menu = {"Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng"};
		int[] harga = {15000, 22000, 12000, 18000};
		String []MenuPilihan = new String[4];
		double []MenuTotalHarga = new double[4];

		while (true) {
            System.out.println("===== Menu UTAMA =====");
            System.out.println("1. Tambah Data");
			System.out.println("2. Tampilkan Daftar Pesanan");
			System.out.println("3. Keluar");
			System.out.print("Pilih menu: ");
			menu = sc.nextInt();
			System.out.print("Masukkan nomor meja: ");
			noMeja = sc.nextInt();
			sc.nextLine();
			System.out.print("Masukkan nama pelanggan: ");
			namaPelanggan = sc.nextLine();
			
			if (menu == 1) {
				TambahPesanan(Menu,harga);
			} else if (menu == 2) {
				
			} else if (menu == 3) {
				break;
			}

			
        }
	}

	public static void TambahPesanan(String[] Menu, int[] harga) {
		double TotalhargaMenu = 0;
		String []MenuPilihan = new String[4]; 
		while (true) { 
			double MenuTotalHarga = 0;
			System.out.println("===== MENU KAFE =====");
			System.out.println("1. Kopi Hitam - Rp 15000");
			System.out.println("2. Latte - Rp 22000");
			System.out.println("3. Teh Tarik - Rp 12000");
			System.out.println("4. Mie Goreng - Rp 18000");

			System.out.print("Pilih menu (Masukkan no menu, atau 0 untuk selesai): ");
			int menuKafe = new Scanner(System.in).nextInt();
			if (menuKafe == 0) {
				break;
			}
			System.out.print("Masukkan jumlah item untuk " + Menu[menuKafe-1] + ": " );
			int jumlahMenu = new Scanner(System.in).nextInt();

			if (menuKafe == 1) {
				MenuPilihan[menuKafe-1] = Menu[menuKafe-1];
				MenuTotalHarga = harga[menuKafe-1] * jumlahMenu;
				TotalhargaMenu += MenuTotalHarga;
			} else if (menuKafe == 2) {
				MenuPilihan[menuKafe-1] = Menu[menuKafe-1];
				MenuTotalHarga = harga[menuKafe-1] * jumlahMenu;
				TotalhargaMenu += MenuTotalHarga;

			} else if (menuKafe == 3) {
				MenuPilihan[menuKafe-1] = Menu[menuKafe-1];
				MenuTotalHarga = harga[menuKafe-1] * jumlahMenu;
				TotalhargaMenu += MenuTotalHarga;

			} else if (menuKafe == 4) {
				MenuPilihan[menuKafe-1] = Menu[menuKafe-1];
				MenuTotalHarga = harga[menuKafe-1] * jumlahMenu;
				TotalhargaMenu += MenuTotalHarga;
			}
		}
	}
}
