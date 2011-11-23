public class EkspresiWajah{
	public String respons(){
		return("Perhatian ekspresi wajah saya");
	}
}
	class Gembira extends EkspresiWajah{
		public String respons(){
			return("HA..HA..HA..HA..HA..HA..HA..HA..HA..HA..");
		}
	}
	class Sedih extends EkspresiWajah{
		public String respons(){
			return("hi..hi..hi..hi..hi..hi..hi..hi..hi..hi..");
		}
	}
	class Marah extends EkspresiWajah{
		public String respons(){
			return("Ape Lu Kate...!!!!");
		}
	}