package ar.com.unlam.pb2;

public class MaquinaPremium extends MaquinaCafe{

	private Integer reutilizaCafe;

	
	public MaquinaPremium() {
		this.reutilizaCafe = 1;
	}

	public Integer getReutilizaCafe() {
		return reutilizaCafe;
	}

	public void setReutilizaCafe(Integer reutilizaCafe) {
		this.reutilizaCafe = reutilizaCafe;
	}

}
