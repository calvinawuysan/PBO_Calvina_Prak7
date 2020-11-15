import java.util.Scanner;
class Blok1 extends Tipe {
	void tmpl1() {
	boolean loop = true;
	Scanner masukan = new Scanner(System.in);
	System.out.println("Blok: ");
	System.out.println("1. A : Rp.500.000");
	System.out.println("2. B : Rp.300.000");
	System.out.print("Blok yang dipilih = ");
	blok = masukan.nextInt();
	switch(blok) {
		case 1 :    System.out.print("Bayaran Anda = ");
					bayar = masukan.nextInt();
					kembalian = bayar - 500000;
					System.out.println();
					hb = 500000;
					loop =  false; break;
		case 2 :   	System.out.print("Bayaran Anda = ");
					bayar = masukan.nextInt();
					kembalian = bayar - 300000; 
					System.out.println();;
					hb = 300000;
					loop =  false; break; 
		default :   System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih blok 1-2");
	}
	}
}
	