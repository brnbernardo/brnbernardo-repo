
public class TripulanteProximo implements SalaComando{

	@Override
	public String[][] mapeiaPosicao(String [][] mapa, Coordenada c, int eixoX, int eixoY) {
		// TODO Auto-generated method stub
		
		int x = eixoX - 1;
		int y = eixoY - 1;
		
		if (c.getX() < eixoX && c.getY() < eixoY) {
			//if ((eixoX - c.getX()) == 1 && (eixoY - c.getY()) == 1) {
				mapa[c.getX()-1][c.getY()-1] = "!";
				mapa[x-1][y] = "!";
				mapa[x][y-1] = "!";
				mapa[x][y] = "!";
			//}
		}
		
		if (c.getX() > eixoX && c.getY() < eixoY) {
			mapa[c.getX()-1][c.getY()-1] = "!";
			mapa[x][y] = "!";
			mapa[x][y+1] = "!";
			mapa[x+1][y+1] = "!";
		}
		
		if (c.getX() < eixoX && c.getY() > eixoY) {
			mapa[c.getX()-1][c.getY()-1] = "!";
			mapa[x-1][y] = "!";
			mapa[x][y+1] = "!";
			mapa[x][y] = "!";
		}
		
		if (c.getX() > eixoX && c.getY() > eixoY) {
			//if ((c.getX() - eixoX) == 1 && (c.getY() - eixoY) == 1) {
				mapa[c.getX()-1][c.getY()-1] = "!";
				mapa[x+1][y] = "!";
				mapa[x][y+1] = "!";
				mapa[x][y] = "!";
			//}
		} 
		
		if (c.getX() == eixoX) {
			for (int i = y; i < y + 1; i++) {
				for (int j = x - 1; j < x + 1; j++) {
					mapa[i][j] = "!";
				}
			}
		}
		
		if (c.getY() == eixoY) {
			for (int i = x; i < x + 1; i++) {
				for (int j = y - 1; j < y + 1; j++) {
					mapa[i][j] = "!";
				}
			}
		}
		
		
		return mapa;
	}
	
	public void teste(){
	
	}

}
