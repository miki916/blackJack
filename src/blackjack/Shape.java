package blackjack;

import java.util.ArrayList;

public  enum  Shape {

	DIAMANTE("♦️",Color.RED),TREBOL ("♣️",Color.BLACK),PICAS("♠️",Color.BLACK),CORAZON("❤️",Color.RED);
	
	private String forma;
	private Color color;
	
	Shape(String forma, Color color){
		this.forma = forma;
		this.color = color;
		
	}
		
	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String toString() {
		
		return forma;
		
	}
	
	
	
}
