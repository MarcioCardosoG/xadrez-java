package boardgame;



public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas <1) {
			throw new TabuleiroException("Erro de criação: é necessário pelomenos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}


	public int getLinhas() {
		return linhas;
	}



	public int getColunas() {
		return colunas;
	}


	public Peca peca(int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new TabuleiroException("Posição não existe");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca (Position position) {
		if (!posicaoExiste(position)) {
			throw new TabuleiroException("Posição não existe");
		}
		
		return pecas[position.getLinha()][position.getColuna()];
	}
	
	public void colocaPeca (Peca peca, Position position) {
		if(issoEUmaPeca(position)) {
			throw new TabuleiroException("Já existe uma peça nessa posição " + position);
		}
		pecas[position.getLinha()][position.getColuna()] = peca;
		peca.position = position;
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >=0 && coluna < colunas;
		
	}
	
	public boolean posicaoExiste(Position position) {
		return posicaoExiste(position.getLinha(), position.getColuna());
	}
	
	public boolean issoEUmaPeca(Position position) {
		if (!posicaoExiste(position)) {
			throw new TabuleiroException("Posição não existe");
		}
		return peca(position) !=null;
	}

}
