
public class CobaIn{
public static void main (String[] args) {
	A supobj = new A();
	B subobj = new B();

	supobj.tampil();
	subobj.tmpl();
	System.out.println("Nama = " +supobj.nama); 
	System.out.println("Alamat = " +supobj.alamat);
	System.out.println("Harga Bayar = " +subobj.hb);
	System.out.println("Bayar = " +subobj.bayar); 
	System.out.println("Kembalian = " +subobj.kembalian);
	
}
}