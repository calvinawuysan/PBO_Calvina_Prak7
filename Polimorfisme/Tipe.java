import java.util.Scanner;
class Tipe {
	String nama;
	String alamat;
	int tipe;
	int blok;
	int bloka;
	int bayar;
	int kembalian, hb;
	Scanner masukan = new Scanner(System.in);
	void tampil() {
	System.out.print("Masukkan Nama = ");
	nama = masukan.nextLine();
	System.out.print("Masukkan Alamat = ");
	alamat = masukan.nextLine();
	System.out.println("Tipe: ");
	System.out.println("1. Tipe 36");
	System.out.println("2. Tipe 37");
}
}