import java.util.ArrayList;
import java.time.LocalDate; // import the LocalDate class


public class Main {

	public static void main(String[] args) {
		Ders yaz16203 = new Ders("Nesneye Yonelik Programlama",4);
		Ders yaz16305 = new Ders("Yapay Zeka ve Uzman Sistemler",3);
		Ders yaz18411 = new Ders("Formal Diller ve Otomatlar",4);
		
//		Ogretim_Gorevlisi hoca1 = Ogretim_Gorevlisi();
				
		ArrayList<Ders> ogrenci1Dersler = new ArrayList<Ders>();
		ogrenci1Dersler.add(yaz18411);
		ogrenci1Dersler.add(yaz16203);
		
		Ogrenci ogrenci1	= new Ogrenci(1190505504, 64, ogrenci1Dersler);	//Öðrenci eklerken bilgiler ekleniyor.
		ogrenci1.dersEkle(yaz16305);		// Öðrenciye sonradan ders atanýyor.		
		
		ogrenci1.setIsim("Mustafa");
		ogrenci1.setSoyisim("Arýk");
		ogrenci1.setCinsiyet("Erkek");
		ogrenci1.setEmail("mustafaarik@gmail.com");
		// ogrenci1.setDogumTarihi(1984-03-24);
		
		 LocalDate myObj = LocalDate.now(); // Create a date object
		 System.out.println(myObj); // Display the current date
	
			ogrenci1.dersleriListele();			// Öðrenciye atanmýþ dersler listeleniyor.

	}

}
