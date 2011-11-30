class Spongebob extends Hewan implements Manusia{
	public Spongebob(){
		super("Spongebob",2,false);
	}
	public void bersuara(){
		System.out.println("\nHallo Patrick...");
	}
	public void menyanyi(){
		System.out.println("nye..nye..wik..wik..");
	}
	public void ketawa(){
		System.out.println("kek..kek..kek..");
	}
	public static void makan(){
		System.out.println("Kraby Patty");
	}
	public void makan2(){
		super.makan();
	}
	public static void main(String[] args){
		Spongebob s = new Spongebob();
		s.isHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan();
		Hewan.makan();
	}
}