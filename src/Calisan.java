
public abstract class Calisan extends Kisi{
	private Integer sicilNo;
	private Integer derece;
	
	public Integer Maas_Hesapla() {
		Integer maas = 0;
		
		return maas;
	}
	Calisan(){
		
	}
	Calisan(int sicilNo, int derece){
		this.sicilNo = sicilNo;
		this.derece = derece;
	}

	public Integer getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(Integer sicilNo) {
		this.sicilNo = sicilNo;
	}

	public Integer getDerece() {
		return derece;
	}

	public void setDerece(Integer derece) {
		this.derece = derece;
	}
	
}
