package xadrez;

import boardgame.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public XadrezPeca[][] pecas(){
		XadrezPeca[][] partPecas = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas();i++) {
			for (int j=0; j<tabuleiro.getColunas();j++) {
				partPecas[i][j] = (XadrezPeca) tabuleiro.peca(i,j);
			}
		}
		return partPecas;
	}
	

}
