package vector;

public class Quadrato {


	private int lato;


	public Quadrato(int lato) {
		this.lato = lato;
	}



	public void setLato(int lato) {
		this.lato = lato;
	}
	public int getLato() {
		return lato;
	}



	@Override
	public String toString() {
		return "Lato = " + lato;
	}

	






}
