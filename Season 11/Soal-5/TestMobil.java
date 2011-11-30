public class TestMobil{
	public static void main(String[] args){
		Mobil m = new Mobil(){
			public void injakPedalGas(){
				System.out.println("Mobilnya Jalann...");
			}
		};
		Kijang k = new Kijang();
		BMW b = new BMW();
		
		m.injakPedalGas();
		
		m = k;
		m.injakPedalGas();
		
		m = b;
		m.injakPedalGas();
	}
}