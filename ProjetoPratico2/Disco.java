
public class Disco {
	private String nomeDisco;
	private int preco;
	private int qntestoque;

	public void setAll(int preco, int qntestoque, String nomeDisco) {
		this.preco = preco;
		this.nomeDisco = nomeDisco;
		this.qntestoque = qntestoque;
	}

	public String getdisco() {
		nomeDisco = "Nirvana";
		return nomeDisco;
	}	

	public int getestoque() {
		qntestoque = 10;
		return qntestoque;
	}

	public int getpreco() {
		preco = 20;
		return preco;
	}
	
	public String getdisco2() {
		nomeDisco = "Maltan";
		return nomeDisco;
	}	

	public int getestoque2() {
		qntestoque = 3;
		return qntestoque;
	}

	public int getpreco2() {
		preco = 40;
		return preco;
	}	

	public static String loja() {
		return "Seja bem vindo a loja de discos DiscZ";
	}

	public void precos(int preco) {
		if (preco <= 0) {
			preco = 1;
		}

	}

}
