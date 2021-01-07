import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Memur extends Calisan{
	private String calistigiBirim;
	
	Memur(String calistigiBirim, int sicilNo, int derece){
		this.calistigiBirim = calistigiBirim;
		super.setSicilNo(sicilNo);
		super.setDerece(derece);
	}

	public String getCalistigiBirim() {
		return calistigiBirim;
	}

	public void setCalistigiBirim(String calistigiBirim) {
		this.calistigiBirim = calistigiBirim;
	}

	@Override
	public void Kimlik_Bilgisi_Yazdir() {
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");	
		
		System.out.println("\n#######################_____     Memur Bilgileri     _____#########################");
		System.out.println("###################################################################################");
		System.out.println(super.getIsim() + " " + super.getSoyisim() );
		System.out.println("Sicil No:"+super.getSicilNo()+"\t\t\tDerece:"+super.getDerece() + "\t\tÇalýþtýðý Birim:" + calistigiBirim);
		System.out.println("D.Tarihi: " + dateFormat.format(super.getDogumTarihi()) + " \t\tTC Kimlik: " + super.getTcno()+ "\t\tCinsiyet: " + super.getCinsiyet());
		System.out.println("Telefon: " + super.getTelno()+ "\t\tEposta: " + getEmail());
		System.out.println("###################################################################################\n");		
	}
	
}