
public class Ders {
	// Aggragation ili�kisi ile, bu s�n�ftan olu�turulan nesneler
	// ��retim G�revlisi ve ��renci S�n�flar�nda bir alan olarak, kullan�lacak. 
	
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
