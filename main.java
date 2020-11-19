import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String nama;
		int meter;
		int total;
		int bayar;
		
		beban A = new beban();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama: ");
		nama=input.nextLine();
		System.out.println();
		
		System.out.println("Tipe rumah: ");
		System.out.println("31 ");
		System.out.println("32 ");
		System.out.println("33 ");
		System.out.println("34 ");
		System.out.println("35 ");
		System.out.println("40 ");
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("Masukkan tipe rumah anda: ");
		byte tipe = input.nextByte();
		A.setTipe(tipe);
		A.setBiaya();
		System.out.println("Biaya bebannya: Rp." +A.getBiaya());
		System.out.println();
		 
		System.out.println("Masukkan jumlah pemakaian meteran anda: ");
		meter = input.nextInt();
		A.setHarga(meter);
		System.out.println("Total Harga anda adalah: "+A.getHarga());
		System.out.println("Masukkan pembayaran");
		bayar=input.nextInt();
		int kembali = bayar-A.getHarga();
		System.out.println("Kembalian mu adalah: "+kembali);
		
		System.out.println("Halo! "+nama+", Biaya beban tipemu: "+A.getBiaya()+", total harganya: "+A.getHarga()+", dan kembalian kamu sebanyak: "+kembali);
	}
}