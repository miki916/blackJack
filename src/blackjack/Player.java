package blackjack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Player {
	
	private String nombre;
	private Deque<Pokercard> cartas;
	private int puntos;
	
	
	public Player(String nombre) {
		
		this.nombre=nombre;
		cartas = new LinkedList<Pokercard>();
		puntos = 0;
		
	}
	
	public void setPuntos(int puntos) {
		
		this.puntos = puntos;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public Deque<Pokercard> getCartas() {
		return cartas;
	}

	public int getPuntos() {
		return puntos;
	}

	public void añadirCartas(Pokercard card) {
		
		cartas.add(card);
		puntos += card.getScore();
		
	}
	
	public boolean comprobarPuntos() {
		
		if(puntos>21) 
			return false;	
		else
			return true;
		
	}
	
	public String toString() {
		
		return  cartas.toString() + "\n" + 
			   "Puntos: " + puntos;
		
	}
	
	
}
