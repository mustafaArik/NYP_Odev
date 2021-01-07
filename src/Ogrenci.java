import java.util.ArrayList;

public class Ogrenci extends Kisi {
	private Integer ogrenciNo;
	private Integer mezuniyetKredisi;
	ArrayList<Ders> aldigiDersler = new ArrayList<Ders>();
	
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
		System.out.println(ogrenciNo + " Numaralı Öğrencinin ALDIĞI Dersler \t\t" + super.getIsim()+" "+super.getSoyisim());
		System.out.println("_______________________________________________________________________");
		for (Ders ders : aldigiDersler) {
			System.out.println("Ders Adı: "+ders.getAd() + "\t\t\tKredi :"+ders.getKredi());
			toplamKredi = toplamKredi + ders.getKredi();
		}

		System.out.println("-------------------------------------------------------Toplam Kredi: "+toplamKredi+"");
	}

	@Override
	public void Kimlik_Bilgisi_Yazdir() {
		System.out.println(super.getIsim() + " " + super.getSoyisim() + "\t D.Tarihi: " + super.getDogumTarihi() + " \t TC Kimlik: " + super.getTcno());
		System.out.println(super.getCinsiyet() + " " + super.getTelno()+ " " + getEmail());
		System.out.println("-----------------------------------------------------------------Kişi Bilgileri Bitti");		
	}

}
