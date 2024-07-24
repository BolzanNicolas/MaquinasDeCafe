package ar.com.unlam.pb2;

public class MaquinaEstafadora extends MaquinaCafe{

	private Boolean darVacioVacio;
	private Integer limiteCafe;
	
	public MaquinaEstafadora() {
		this.darVacioVacio = false;
		this.limiteCafe = 10;
	}

	public Boolean getDarVacioVacio() {
		return darVacioVacio;
	}

	public void setDarVacioVacio(Boolean darVacioVacio) {
		this.darVacioVacio = darVacioVacio;
	}

	public Integer getLimiteCafe() {
		return limiteCafe;
	}

	public void setLimiteCafe(Integer limiteCafe) {
		this.limiteCafe = limiteCafe;
	}
	
}
