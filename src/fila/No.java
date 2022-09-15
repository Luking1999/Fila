package fila;

public class No {
	private No inicio;
	private No fim;
	private No next;
	private String info;
	
	public No(String info) {
		this.setInfo(info);
		this.setNext(null);
	}
	
	public String getInfo() {
		return info;
	}
	public No getNext() {
		return next;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public void setNext(No next) {
		this.next = next;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
