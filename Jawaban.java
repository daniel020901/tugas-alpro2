
public class Jawaban {

	public static void main(String[] args) {
		//ini tipe Data Logika
		System.out.println(" ======== Tipe data Logika ========= " );
		boolean ini_bool = true;
		boolean ini_lean = false;
		System.out.println ("Tipe data boolean adalah tipe data yang membandingkan nilai satu dengan nilai lain  ");
		System.out.println ("Nilai  tipe data boolean = " + ini_bool);
		System.out.println ("Nilai tipe data dari lean = " + ini_lean);
		System.out.println();
		
		//ini tipe data karakter
		System.out.println ("--------- Tipe data karakter --------");
		System.out.println ();
		System.out.println ("Tipe data karakter(char) adalah tipe data yang hanya menyimpan nilai tiap satu variabel nya ");
		
		char f = 'F';
		char a = 'A';
		char v = 'V';
		
		String tulisanjava = "java";
		
		System.out.println("char : "+f+a+v);
		System.out.println("String:"+tulisanjava);
		System.out.println();
		
		System.out.println ("========= Tipe data Numerik ==========");
		System.out.println ("Nilai data numerik terbagi menjadi dua bagian : bilangan bulat dan bilangan desimal ");
		//  ini tipe data integer(bulat)
		byte nilai_byte = 100;
		short nilai_short = 17221;
		int nilai_int = 12183113;
		long nilai_long = 200000000L;
		
		System.out.println ("Nilai tipe data byte = " +nilai_byte);
		System.out.println ("Nilai tipe data short = "+ nilai_short);
		System.out.println ("Nilai tipe data int = "+ nilai_int);
		System.out.println ("Nilai tipe data long ="+ nilai_long);
		System.out.println ();

		System.out.println ("====================================");
		//ini bilangan pecahan
		float floatnumber = 1.25f;
		double doublenumber = 1.25;
		System.out.println ("Nilai tipe data float = "+ floatnumber);
		System.out.println ("Nilai tipe data double = "+ doublenumber);
	}

}
