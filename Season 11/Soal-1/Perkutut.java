class Perkutut extends Hewan{
	public Perkutut(){
	super("perkutut",2,true);
}
public void bersuara(){
	System.out.println("\nCicit..cicit..cuit..");
}
public static void main(String[] args){
	Perkutut p = new Perkutut();
	p.isHewan();
	p.bersuara();
}
}