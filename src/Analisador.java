import java.util.HashMap;

public class Analisador {
	
	public static final int TAMANHO = 100000;
	
	
	/* usando Mapas HASH */
	
	public static void main(String[] args) {
		HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();
		
		
		// vamos preencher o mapa
		for (int i=1; i<TAMANHO; i++) {
			mapa.put(i, new Produto(i, "Produto "+i, i*10.0));
		}
		int codigoAserEncontrado = TAMANHO;
		
		long ini, fim;
		
		ini = System.currentTimeMillis();
		for (int qtd = 0; qtd < 10000; qtd++) {
			Produto p = mapa.get(codigoAserEncontrado);
		}
		
		fim = System.currentTimeMillis();
		System.out.println("Este algoritmo levou: "+(fim-ini)+"ms");
	}
	
	/* usando ARRAY LISTS */	
	/*
	public static void main(String[] args) {
		
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		// vamos preencher a lista
		for (int i=1; i <= TAMANHO ; i++) {
			lista.add(new Produto(i, "Produto"+i, i*10.0));
		}
		
		int codigoAserEncontrado = TAMANHO;
		
		long ini, fim;
		ini = System.currentTimeMillis();
		for (int qtd = 0; qtd < 10000; qtd++) {
			for(Produto p: lista) {
				if (p.getId() == codigoAserEncontrado) {
					break;
				}
			}
		}						
		fim = System.currentTimeMillis();
		
		System.out.println("Este algoritmo levou: "+(fim-ini)+"ms");
	}
	
	*/
}
