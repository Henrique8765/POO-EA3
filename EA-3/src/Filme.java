public class Filme {
	private String nome;
	private String diretor;
	private String descricao;
	private String genero;
	private String duracao;
	private boolean filme3D;
	
	public Filme(String nome, String diretor, String genero, String duracao, String descricao) {
		this.nome= nome;
		this.diretor= diretor;
		this.genero= genero;
		this.duracao= duracao;
		this.descricao=descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean getFilme3D() {
		return filme3D;
	}
	public void setFilme3D(boolean filme3d) {
		filme3D = filme3d;
	}

}
