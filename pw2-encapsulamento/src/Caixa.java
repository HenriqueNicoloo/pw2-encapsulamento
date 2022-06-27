
public class Caixa {

	private int altura;
	private int largura;
	private int profundidade;
	
	public String cabeDentro(int diametro) {
		if(diametro<=altura && diametro<=largura && diametro<=profundidade)
			return "sim";
		else 
			return "não";
		
	}
	
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
}
