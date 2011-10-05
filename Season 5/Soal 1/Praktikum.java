public class Praktikum{
	public static void main(String[] args){
		//inisialisasi variabel number1, number2, results dengan tipe data integer
		int number1, number2, results;
		//inisialisasi variabel number dengan tipe data boolean
		boolean number;
		//memberi nilai 20 pada variabel number1
		number1 = 20;
		//memberi nilai 10 pada variabel number2
		number2 = 10;
		
		//menghitung  number1 / number2 dan hasilnya akan disimpan oleh variabel results
		results = number1 / number2;
		//mencetak keluaran hasil pembagian variabel results
			System.out.println(results);
		//menghitung  number1 + number2 dan hasilnya akan disimpan oleh variabel results	
		results = number1 + number2;
		//mencetak keluaran hasil pembagian variabel results
			System.out.println(results);
		//mencocokan apakah 20 tidak sama dengan 10 dan hasilnya akan disimpan oleh variabel number
		number = (20 != 10);
		//mencetak keluaran hasil variabel number
			System.out.println(number);
		//mencocokan apakah 20 sama dengan 10 dan hasilnya akan disimpan oleh variabel number
		number = (20 == 10);
		//mencetak keluaran hasil variabel number
			System.out.println(number);	
	}
}