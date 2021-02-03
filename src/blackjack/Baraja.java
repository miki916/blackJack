package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class Baraja {

	public Deque<Pokercard> baraja;
	
	public Baraja() {
		
		baraja = new LinkedList<Pokercard>();
		
		addCards();
		
	}
	
	public ArrayList<Shape> getShapeArray(){
		
		ArrayList<Shape> array = new ArrayList<Shape>();
		array.add(Shape.DIAMANTE);
		array.add(Shape.TREBOL);
		array.add(Shape.PICAS);
		array.add(Shape.CORAZON);
		
		return array;
	}
	
	public ArrayList<Value> getValueArray(){
			
			ArrayList<Value> array = new ArrayList<Value>();
			array.add(Value.AS);
			array.add(Value.DOS);
			array.add(Value.TRES);
			array.add(Value.CUATRO);
			array.add(Value.CINCO);
			array.add(Value.SEIS);
			array.add(Value.SIETE);
			array.add(Value.OCHO);
			array.add(Value.NUEVE);
			array.add(Value.DIEZ);
			array.add(Value.J);
			array.add(Value.Q);
			array.add(Value.K);
			
			return array;		
			
	}

	private void addCards() {

		for(Shape shape : getShapeArray()) {
			for(Value value : getValueArray()) {
				
				baraja.add(new Pokercard(shape,value));
				
			}			
		}
	}
	
	
	public Deque<Pokercard> getBaraja() {
		return baraja;
	}

	public void setBaraja(Deque<Pokercard> baraja) {
		this.baraja = baraja;
	}

	public void barajarCartas() {
		
		Collections.shuffle((LinkedList<Pokercard>)baraja);
		
	}
	
	public Pokercard cogerCarta() {
		
		return baraja.pollFirst(); 
		
	}
	
	public String mostrarBaraja() {
		
		return baraja.toString();
		
	}
	
	
	
	
	
}
