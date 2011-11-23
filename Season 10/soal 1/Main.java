class Main{
	public static void main(String[] f){
		Santapan s = new Santapan();
		Makanan ma = new Makanan();
		Minuman mi = new Minuman();
		Cemilan ce = new Cemilan();
		
		s.cerna(ma);
		s.cerna(mi);
		s.cerna(ce);
	}
}