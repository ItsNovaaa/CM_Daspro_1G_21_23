package CM_Daspro_1G_21_3;

import java.util.Scanner;

public class caseMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		String[] Menu = {"Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng"};
		int[] harga = {15000, 22000, 12000, 18000};
		double [][] dataPelanggan = new double[10][10];
		int [] noMeja = new int[10];
		String [] namaPelanggan = new String[10];
		double []HargaTotalItem = new double[10];
		int a = 0;

            while (true) {
                System.out.println("===== Menu UTAMA =====");
                System.out.println("1. Tambah Data");
                System.out.println("2. Tampilkan Daftar Pesanan");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");
                menu = sc.nextInt();
				if (menu > 4) 	{
					System.out.println("Yang Bener dong");
					continue;
				}
				if (menu == 1) {
					System.out.print("Masukkan nomor meja: ");
					noMeja[a] = sc.nextInt();
					sc.nextLine();
					System.out.print("Masukkan nama pelanggan: ");
					namaPelanggan[a] = sc.nextLine();
				}
                switch (menu) {
                    case 1:
                        TambahPesanan(Menu,harga,a,dataPelanggan,HargaTotalItem);
                        a++;
                        break;
                    case 2:
                        tampilkanPesanan(dataPelanggan,noMeja,namaPelanggan,Menu,harga,HargaTotalItem);
                        break;
                    case 3:
						System.exit(0);
                        break;
                }
            }
	}

	public static void TambahPesanan(String[] Menu, int[] harga,int a, double [][] dataPelanggan,double [] HargaTotalItem) {
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
			if (menuKafe > 4) {
				System.out.println("Yang Bener dong");
				continue;
			}
			if (menuKafe == 0) {
				break;
			}
			System.out.print("Masukkan jumlah item untuk " + Menu[menuKafe-1] + ": " );
			int jumlahMenu = new Scanner(System.in).nextInt();

			if (menuKafe == 1) {
				MenuPilihan[menuKafe-1] = Menu[menuKafe-1];
				MenuTotalHarga = harga[menuKafe-1] * jumlahMenu;
				HargaTotalItem[menuKafe-1] = MenuTotalHarga + HargaTotalItem[menuKafe-1];
				TotalhargaMenu += MenuTotalHarga;
				dataPelanggan[a][menuKafe-1] = MenuTotalHarga;
			} else if (menuKafe == 2) {
				MenuPilihan[menuKafe-1] = Menu[menuKafe-1];
				MenuTotalHarga = harga[menuKafe-1] * jumlahMenu;
				HargaTotalItem[menuKafe-1] = MenuTotalHarga;
				TotalhargaMenu += MenuTotalHarga;
				dataPelanggan[a][menuKafe-1] = MenuTotalHarga;
			} else if (menuKafe == 3) {
				MenuPilihan[menuKafe-1] = Menu[menuKafe-1];
				MenuTotalHarga = harga[menuKafe-1] * jumlahMenu;
				HargaTotalItem[menuKafe-1] = MenuTotalHarga + HargaTotalItem[menuKafe-1];			
				TotalhargaMenu += MenuTotalHarga;
				dataPelanggan[a][menuKafe-1] = MenuTotalHarga;
			} else if (menuKafe == 4) {
				MenuPilihan[menuKafe-1] = Menu[menuKafe-1];
				MenuTotalHarga = harga[menuKafe-1] * jumlahMenu;
				HargaTotalItem[menuKafe-1] = MenuTotalHarga + HargaTotalItem[menuKafe-1];
				TotalhargaMenu += MenuTotalHarga;
				dataPelanggan[a][menuKafe-1] = MenuTotalHarga;
			}
		}
		System.out.println("Total Pembelian = " + TotalhargaMenu);
	}

	public static void tampilkanPesanan(double [][] dataPelanggan, int [] noMeja, String [] namaPelanggan, String [] Menu, int [] harga, double [] HargaTotalItem) {
		for (int i = 0; i < 4; i++) {
			if (namaPelanggan[i] != null) {
                System.out.println("===== DAFTAR PESANAN =====");
                System.out.println("Nama pelanggan: " + namaPelanggan[i]);
                System.out.println("Nomor meja: " + noMeja[i]);
                System.out.println("Pesanan:");

                for (int j = 0; j < Menu.length; j++) {
                    if (dataPelanggan[i][j] != 0) {
                        int jumlahItem = (int) (dataPelanggan[i][j] / harga[j]);
                        System.out.println(Menu[j] + " - Rp " + harga[j] + " x " + jumlahItem + " = Rp " + dataPelanggan[i][j]);
                    }
                }
                System.out.println("Total Pembelian = Rp " + HargaTotalItem[i]);
                System.out.println();
					}
		}
	}

}
