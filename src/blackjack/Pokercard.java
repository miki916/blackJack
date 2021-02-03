package blackjack;

public class Pokercard extends Card {
	
	private Value number;
	private Shape shape;
	
	public Pokercard(Shape shape, Value number) {
		super(number.getValor());
		this.number = number;
		this.shape = shape;
		// TODO Auto-generated constructor stub
	}

	public Value getNumber() {
		return number;
	}

	public void setNumber(Value number) {
		this.number = number;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public String toString() {
		
		return shape.getForma() + number.getNumero(); 
		
	}
	
	
}
