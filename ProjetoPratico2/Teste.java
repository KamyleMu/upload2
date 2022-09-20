
public class Teste {

	public static void main(String[] args) {
				
		Disco d1 = new Disco();
		Disco d2 = new Disco();
	
		System.out.println( " " + d1.loja());
			System.out.println( d1.getdisco() + ": R$" + d1.getpreco() );
			System.out.println( "Quantidade no estoque: " + d1.getestoque() + " discos");
			System.out.println( d2.getdisco2() + ": R$" + d2.getpreco2() );
			System.out.println( "Quantidade no estoque: " + d2.getestoque2() + " discos");
		}
	}