package blackjack;

import java.util.ArrayList;

public enum Value {

	AS("A",11), 
	DOS("2",2), 
	TRES("3",3), 
	CUATRO("4",4), 
	CINCO("5",5), 
	SEIS("6",6),
	SIETE("7",7),
	OCHO("8",8), 
	NUEVE("9",9), 
	DIEZ("10",10), 
	J("J",10), 
	Q("Q",10), 
	K("K",10);
	
	private String numero;
	private int valor;
	
	Value(String numero,int valor){
		this.numero=numero;
		this.valor=valor;
	}

	public String getNumero() {
		return numero;
	}

	public int getValor() {
		return valor;
	}
	
	
	
	
}
