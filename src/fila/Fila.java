package fila;

public class Fila {
	private No inicioFila;
	private No finalFila;
	
	public Fila(){
		
	}
	
	public boolean filaVazia() {
		return this.getInicioFila() == null && this.getFinalFila() == null;
	}
	public void Inserir(String info) {
		if(filaVazia()) {
			No novaFila = new No(info);
			this.setFinalFila(novaFila);
			this.setInicioFila(novaFila);
			return;
		}
		No novaFila = new No(info);
		this.getFinalFila().setNext(novaFila);
		this.setFinalFila(novaFila);
	}
	
	public void imprime() {
		if(filaVazia()) {
			System.out.println("Lista Vazia!");
			return;
		}
		
		for(No ordem = this.getInicioFila(); ordem != null; ordem = ordem.getNext()) {
			System.out.println("   >> |"+ordem.getInfo()+"| <<   ");
		}
	}
	
	public void remove() {
		if(filaVazia()) {
			System.out.println("Lista Vazia!");
			return;
		}
		if(this.getFinalFila() == this.getInicioFila()) {
			this.setFinalFila(null);
			this.setInicioFila(null);
			return;
		}
		this.setInicioFila(this.getInicioFila().getNext());
	}
	public No getFinalFila() {
		return finalFila;
	}

	public void setFinalFila(No finalFila) {
		this.finalFila = finalFila;
	}
	public No getInicioFila() {
		return inicioFila;
	}

	public void setInicioFila(No inicioFila) {
		this.inicioFila = inicioFila;
	}
}
