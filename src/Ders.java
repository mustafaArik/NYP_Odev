
public class Ders {
	// Aggragation iliþkisi ile, bu sýnýftan oluþturulan nesneler
	// Öðretim Görevlisi ve Öðrenci Sýnýflarýnda bir alan olarak, kullanýlacak. 
	
	private String ad;
	private Integer kredi;
	
	Ders(String ad, int kredi){
		this.ad = ad;
		this.kredi = kredi;
	}
		
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public Integer getKredi() {
		return kredi;
	}
	public void setKredi(Integer kredi) {
		this.kredi = kredi;
	}
	
}
