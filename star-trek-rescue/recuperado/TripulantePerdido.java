
public class TripulantePerdido implements SalaComando{

	@Override
	public String[][] mapeiaPosicao(String [][] mapa, Coordenada c, int eixoX, int eixoY) {


		int x = eixoX - 1;
		int y = eixoY - 1;
		
		for (int i = x - 1; i <= eixoX; i++) {
			for (int j = y - 1; j <= eixoY; j++) {
				mapa[i][j] = "x";
			}
		}
		//vai dar merda se os eixos forem (10,10)
		
		return mapa;
	}

}
