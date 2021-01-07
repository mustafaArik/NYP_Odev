import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;  


public class Ogrenci extends Kisi {
	private Integer ogrenciNo;
	private Integer mezuniyetKredisi;
	ArrayList<Ders> aldigiDersler = new ArrayList<Ders>();	// HAS-A İlişkisi (Ders Sınıfı - Öğrenci Sınıfı)
	
	Ogrenci(int ogrno, int kredi , ArrayList<Ders> dersler){
		//OgrenciNO Integer , Kredi Integer
		// Aldığı Dersler, ARRAYLIST Olarak gönderilecek.
		
		this.ogrenciNo = ogrno;
		this.mezuniyetKredisi = kredi;
		this.aldigiDersler = dersler;
	}
	
	
	
	public String Mezuniyet_Durumu() {
		String durum = null;
		return durum;		
	}

	public Integer getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(Integer ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public Integer getMezuniyetKredisi() {
		return mezuniyetKredisi;
	}

	public void setMezuniyetKredisi(Integer mezuniyetKredisi) {
		this.mezuniyetKredisi = mezuniyetKredisi;
	}
	
	public void dersEkle(Ders d) {
		boolean varmi = aldigiDersler.contains(d);
		if(!varmi)
			aldigiDersler.add(d);
	}
	
	public void dersCikar(int sira) {
		aldigiDersler.remove(sira);
	}
	
	public void dersleriListele() {
		int toplamKredi = 0;
		
		System.out.println("\n"+ogrenciNo + " Numaralı Öğrencinin ALDIĞI Dersler \t\t" + super.getIsim()+" "+super.getSoyisim());
		System.out.println("_______________________________________________________________________");
		for (Ders ders : aldigiDersler) {
			System.out.println("Ders Adı: "+ders.getAd() + "\t\t\tKredi :"+ders.getKredi());
			toplamKredi = toplamKredi + ders.getKredi();
		}

		System.out.println("-------------------------------------------------------Toplam Kredi: "+toplamKredi+"\n");
	}

	@Override
	public void Kimlik_Bilgisi_Yazdir() {
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");		
		
		System.out.println("\n################################     Öğrenci Bilgileri     ################################");
		System.out.println("###########################################################################################");
		System.out.println(super.getIsim() + " " + super.getSoyisim());
		System.out.println("D.Tarihi: " + dateFormat.format(super.getDogumTarihi()) + " \t\tTC Kimlik: " + super.getTcno() + "\t\tCinsiyet: "+super.getCinsiyet());
		System.out.println("Telefon: " + super.getTelno()+ "\t\tEposta: " + getEmail());
		System.out.println("###########################################################################################\n");	 
		
	}

}
