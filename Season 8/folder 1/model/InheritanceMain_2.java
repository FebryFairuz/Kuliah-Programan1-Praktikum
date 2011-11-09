package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain{
	public static void main(String[] args)throws ParseException{
		Student s = new Student();
		s.setNim("4510210039");
		s.setNama("Febry Damatraseta Fairuz");
		s.setAlamat("Bogor Nirwana Recident");
		s.setTglLahir(new SimpleDateFormat("dd-mm-yyyy").parse("29-02-1992"));
		s.setNoHp("089xxxxxxxx");
		
		Employee e = new Employee();
		e.setNpm("4510210038");
		e.setNama("M. Rafii Pratama");
		e.setAlamat("Jakarta");
		e.setTglLahir(new SimpleDateFormat("dd-mm-yyyy").parse("26-10-1992"));
		s.setNoHp("089xxxxxxxx");
		
		showData(s);
		System.out.println("\n==============================================\n");
		showDate(e);
	}
	
	static void showData(Student s){
		System.out.println("Class Student");
		System.out.println("NPM : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd-mm-yyyy").format(s.getTglLahir()));
		System.out.println("No Hp : " + s.getNoHp());
	}
	
	static void showData(Employee e){
		System.out.println("Class Employee");
		System.out.println("NPM : " + e.getNim());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd-mm-yyyy").format(e.getTglLahir()));
		System.out.println("No Hp : " + e.getNoHp());
	}
}