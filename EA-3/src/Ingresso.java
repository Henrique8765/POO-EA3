
public class Ingresso {
	public String filme;
	private String tipoDeIngresso;
	private String horarioDaSessao;
	
	public Ingresso(String filme, String tipoDeIngresso, String horarioDaSessao) {
		this.filme= filme;
		this.tipoDeIngresso= tipoDeIngresso;
		this.horarioDaSessao= horarioDaSessao;
	}
	public void acessoLanchonete() {
		System.out.println("Para acessar a Lanchonete, você necessita comprar um ingresso VIP.");
	}
	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public String getTipoDeIngresso() {
		return tipoDeIngresso;
	}

	public void setTipoDeIngresso(String tipoDeIngresso) {
		this.tipoDeIngresso = tipoDeIngresso;
	}

	public String getHorarioDaSessao() {
		return horarioDaSessao;
	}

	public void setHorarioDaSessao(String horarioDaSessao) {
		this.horarioDaSessao = horarioDaSessao;
	}
}
