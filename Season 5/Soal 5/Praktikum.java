public class Praktikum{
	public static void main(String args[]){
	//inisialisasi variabel test dan memiliki nilai 5
		int test = 5;
		//test=5+1
		//tetapi isi dari test bukan 6 melainkan 5 karena test++ (hasil dieksekusi terakhir) ,jika ++test maka hasilnya 6
		System.out.println(test++);
		//test=6
		System.out.println(test);
	}
}