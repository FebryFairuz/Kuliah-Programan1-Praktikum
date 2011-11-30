class Sapi extends Hewan{
	public Sapi(){
		super("Sapi",4,false);
	}
	public void bersuara(){
		System.out.println("\nMoeh..Moeh..Moeh..Moeh..");
	}
	public static void main(String[] args){
		Sapi s = new Sapi();
		s.isiHewan();
		s.bersuara();
	}
}