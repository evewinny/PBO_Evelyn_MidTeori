class beban extends input {
	public int biaya;
	public int harga;
	
	public void setBiaya() {
		biaya=0;
		switch(tipe) {
			case 31:
				biaya = 100000;
				break;
			case 32:
				biaya = 125000;
				break;
			case 33:
				biaya = 450000;
				break;
			case 34:
				biaya = 480000;
				break;
			case 35:
				biaya = 500000;
				break;
			case 40:
				biaya = 550000;
				break;
			default: System.out.println("Nomor yang anda masukkan, salah");	
		} 
	}
	
	public int getBiaya() {
		return biaya;
	}
	
	public void setHarga(int meter) {
			harga=meter*biaya;
		}
	public int getHarga() {
			return harga;
		}
}