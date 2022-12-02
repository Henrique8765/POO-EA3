
public class MenuController {
	private int meia;
	private int inteira;
	private int preferencia;
	private int sessao;
	
	public MenuController(int sessao) {
		this.setPreferencia(0);	
	}

	public int getMeia() {
		return meia;
	}

	public void setMeia(int meia) {
		this.meia = meia;
	}

	public int getInteira() {
		return inteira;
	}

	public void setInteira(int inteira) {
		this.inteira = inteira;
	}

	public int getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(int preferencia) {
		this.preferencia = preferencia;
	}

	public int getSessao() {
		return sessao;
	}

	public void setSessao(int sessao) {
		this.sessao = sessao;
	}

	
}
