package prueba;


public class Nodo {

	int fila;
	int columna;
	Nodo padre; 
	

	public Nodo(int fila, int columna, Nodo nodo) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.padre = nodo;
	}

	
	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna(int columna) {
		this.columna = columna;
	}


	public Nodo getPadre() {
		return padre;
	}


	public void setPadre(Nodo padre) {
		this.padre = padre;
	}


	
	

}
