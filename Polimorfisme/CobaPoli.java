import java.util.Scanner;
public class CobaPoli{
public static void main (String[] args) {
	Tipe satu = new Tipe();
	Blok1 dua = new Blok1();
	Blok2 tiga = new Blok2();
	boolean loop = true;
	Scanner masukan = new Scanner(System.in);
	int tipe;
	
	satu.tampil();
	System.out.print("Tipe yang dipilih = ");
	tipe = masukan.nextInt();
	
	while(loop) {
		switch(tipe) {
			case 1 : dua.tmpl1();
					 System.out.println("Nama = " +satu.nama); 
	                 System.out.println("Alamat = " +satu.alamat);
					 System.out.println("Harga Bayar = " +dua.hb);
					 System.out.println("Bayar = " +dua.bayar); 
		  			 System.out.println("Kembalian = " +dua.kembalian);
					 loop = false; break;
					 
			case 2 : tiga.tmpl2();
					 System.out.println("Nama = " +satu.nama); 
	                 System.out.println("Alamat = " +satu.alamat);
					 System.out.println("Harga Bayar = " +tiga.hb);
					 System.out.println("Bayar = " +tiga.bayar); 
		  			 System.out.println("Kembalian = " +tiga.kembalian);
					 loop = false; break;
			default :System.out.println("Merek yang anda masukan salah! Masukkan merek yang benar!");
		}
	break;
	}
}
}