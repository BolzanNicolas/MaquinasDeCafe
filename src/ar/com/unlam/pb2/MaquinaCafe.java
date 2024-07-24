package ar.com.unlam.pb2;

public class MaquinaCafe {

	private Integer cafeGramosInicial;
	private Double costoCafe;
	private Integer cafeVendidos;
	
	public MaquinaCafe() {
		this.cafeGramosInicial = 1000;
		this.costoCafe = 120.0;
		this.cafeVendidos = 0;
	}
	
	public Integer getCafeGramosInicial() {
		return cafeGramosInicial;
	}

	public void setCafeGramosInicial(Integer cafeGramosInicial) {
		this.cafeGramosInicial = cafeGramosInicial;
	}

	public Double getCostoCafe() {
		return costoCafe;
	}

	public void setCostoCafe(Double costoCafe) {
		this.costoCafe = costoCafe;
	}

	public Integer getCafeVendidos() {
		return cafeVendidos;
	}

	public void setCafeVendidos(Integer cafeVendidos) {
		this.cafeVendidos = cafeVendidos;
	}
	
	
}
