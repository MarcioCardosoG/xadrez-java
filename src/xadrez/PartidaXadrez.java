package xadrez;

import boardgame.Position;
import boardgame.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}

	public XadrezPeca[][] pecas() {
		XadrezPeca[][] partPecas = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				partPecas[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
			}
		}
		return partPecas;
	}

	private void iniciarPartida() {
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.BRANCA), new Position(2, 1));
		tabuleiro.colocaPeca(new Rei(tabuleiro, Cor.PRETA), new Position(0, 4));
		tabuleiro.colocaPeca(new Rei(tabuleiro, Cor.BRANCA), new Position(7, 4));
	}

}
