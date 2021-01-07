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
		ArrayList<Ders> ogretimGorevlisi1Dersler = new ArrayList<Ders>();
		
		ogrenci1Dersler.add(yaz18411);	//Ders tipinde veri depolayan ArrayList'e dersler ekleniyor.
		ogrenci1Dersler.add(yaz16203);
		Ogrenci ogrenci1	= new Ogrenci(1190505504, 64, ogrenci1Dersler);	//Öðrenci nesnesi oluþturuluyor.
		
//		Ogretim_Gorevlisi hoca1 = Ogretim_Gorevlisi();
		try {		
			ogrenci1.dersEkle(yaz16305);		// Öðrenciye sonradan ders atanýyor.

	/*	Bir öðrenciyle ilgili Tüm ayrýntýlý bilgiler Ekleniyor.	*/
			// Kiþi Sýnýfýndan Kalýtým Alýnan özellikler
			dogumTarihi = "24.03.1984";
			ogrenci1.setIsim("Mustafa");
			ogrenci1.setSoyisim("Arýk");
			ogrenci1.setCinsiyet("Erkek");
			ogrenci1.setEmail("mustafaarik@gmail.com");
			ogrenci1.setTcno(267896148);
			ogrenci1.setTelno("555 277 9864");
			Date date=new SimpleDateFormat("dd.MM.yyyy").parse(dogumTarihi);
			ogrenci1.setDogumTarihi(date);			
		}
		catch (Exception e) {
			System.out.println("Öðrenci Eklenirken Bir Hata Oluþtu.");
		}
		
		
		
		ogretimGorevlisi1Dersler.add(yaz18411);
		ogretimGorevlisi1Dersler.add(yaz16305);
		Ogretim_Gorevlisi ogretimGorevlisi1 = new Ogretim_Gorevlisi("Prof. Dr.", 123456, 1, ogretimGorevlisi1Dersler);
		
		try
		{
			dogumTarihi = "01.06.1983";
			ogretimGorevlisi1.setIsim("Edip Serdar");
			ogretimGorevlisi1.setSoyisim("Güner");
			ogretimGorevlisi1.setCinsiyet("Erkek");
			ogretimGorevlisi1.setTcno(11122233);
			Date date=new SimpleDateFormat("dd.MM.yyyy").parse(dogumTarihi);
			ogretimGorevlisi1.setDogumTarihi(date);
			ogretimGorevlisi1.setTelno("0288 2140514");
		}
		catch (Exception e) {
			System.out.println("Öðretim Görevlisi Eklenirken Bir Hata Oluþtu.");
		}
		
		
		Memur memur1 = new Memur("Rektörlük", 111001, 6);
		try
		{
			dogumTarihi = "19.05.1996";
			memur1.setIsim("Seda");
			memur1.setSoyisim("Keskin Acet");
			memur1.setCinsiyet("Kadýn");
			memur1.setTcno(22244433);
			Date date=new SimpleDateFormat("dd.MM.yyyy").parse(dogumTarihi);
			memur1.setDogumTarihi(date);
			memur1.setTelno("0288 212 9670");
		}
		catch (Exception e) {
			System.out.println("Memur Eklenirken Bir Hata Oluþtu.");
		}
		
		
		
		
		
		
		
		
//		ogrenci1.dersleriListele();			// Öðrenciye atanmýþ dersler listeleniyor.
		ogrenci1.Kimlik_Bilgisi_Yazdir();
			
//		ogretimGorevlisi1Dersler.add(yaz16203);
		ogretimGorevlisi1.dersleriListele();	// Hoca'nýn girdiði dersler.
		ogretimGorevlisi1.Kimlik_Bilgisi_Yazdir();

		memur1.Kimlik_Bilgisi_Yazdir();


	}

}
