import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Ogretim_Gorevlisi extends Calisan{
	private String unvan;
	ArrayList<Ders> verdigiDersler = new ArrayList<Ders>(); // HAS-A �li�kisi (Ders - ��retim G�revlisi)
	
	public Ogretim_Gorevlisi(String unvan, int sicilNo, int derece, ArrayList<Ders> dersler) {
		this.unvan = unvan;
		super.setSicilNo(sicilNo);
		super.setDerece(derece);
		this.verdigiDersler = dersler;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	
	public void dersleriListele() {
		int toplamKredi = 0;
		
		System.out.println("\n_________________________________________________________________________________________");
		System.out.println("\n+++++"+super.getSicilNo() + " Sicil Numaral� =��RET�M G�REVL�S�N�N= Verdi�i Dersler \t" + super.getIsim()+" "+super.getSoyisim());
		System.out.println("_________________________________________________________________________________________");
		for (Ders ders : verdigiDersler) {
			System.out.println("Ders Ad�: "+ders.getAd() + "\t\t\tKredi :"+ders.getKredi());
			toplamKredi = toplamKredi + ders.getKredi();
		}

		System.out.println("-------------------------------------------------------Toplam Kredi: "+toplamKredi+"\n");
	}
	
	@Override
	public void Kimlik_Bilgisi_Yazdir() {
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");	
		
		System.out.println("\n#####################=====     ��retim G�revlisi Bilgileri     =====#######################");
		System.out.println("###########################################################################################");
		System.out.println(unvan+" "+super.getIsim() + " " + super.getSoyisim() );
		System.out.println("Sicil No:"+super.getSicilNo()+"\t\t\tDerece:"+super.getDerece());
		System.out.println("D.Tarihi: " + dateFormat.format(super.getDogumTarihi()) + " \t\tTC Kimlik: " + super.getTcno()+ "\t\tCinsiyet: " + super.getCinsiyet());
		System.out.println("Telefon: " + super.getTelno()+ "\t\tEposta: " + getEmail());
		System.out.println("###########################################################################################\n");	 
		
	}
	
}
