import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		String dogumTarihi;
		Ders yaz16203 = new Ders("Nesneye Yonelik Programlama",4);
		Ders yaz16305 = new Ders("Yapay Zeka ve Uzman Sistemler",3);
		Ders yaz18411 = new Ders("Formal Diller ve Otomatlar",4);
		ArrayList<Ders> ogrenci1Dersler = new ArrayList<Ders>();
		
		ogrenci1Dersler.add(yaz18411);	//Ders tipinde veri depolayan ArrayList'e dersler ekleniyor.
		ogrenci1Dersler.add(yaz16203);		
		Ogrenci ogrenci1	= new Ogrenci(1190505504, 64, ogrenci1Dersler);	//��renci nesnesi olu�turuluyor.
		
//		Ogretim_Gorevlisi hoca1 = Ogretim_Gorevlisi();
		try {		
			ogrenci1.dersEkle(yaz16305);		// ��renciye sonradan ders atan�yor.

	/*	Bir ��renciyle ilgili T�m ayr�nt�l� bilgiler Ekleniyor.	*/
			// Ki�i S�n�f�ndan Kal�t�m Al�nan �zellikler
			dogumTarihi = "24.03.1984";
			ogrenci1.setIsim("Mustafa");
			ogrenci1.setSoyisim("Ar�k");
			ogrenci1.setCinsiyet("Erkek");
			ogrenci1.setEmail("mustafaarik@gmail.com");
			ogrenci1.setTcno(267896148);
			ogrenci1.setTelno("555 277 9864");
			Date date=new SimpleDateFormat("dd.MM.yyyy").parse(dogumTarihi);
			ogrenci1.setDogumTarihi(date);			
		}
		catch (Exception e) {
			System.out.println("��renci Eklenirken Bir Hata Olu�tu.");
		}
		
		ogrenci1.dersleriListele();			// ��renciye atanm�� dersler listeleniyor.
		ogrenci1.Kimlik_Bilgisi_Yazdir();


	}

}
