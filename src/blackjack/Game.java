package blackjack;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Game {
	
	private Baraja baraja;
	private Player p1;
	private Player p2;
	
	public Game() {
		
		baraja = new Baraja();
		p2 = new Player("Bot");
		start();
	}
	
	private void start() {
		
		System.out.println("--BLACKJACK--");
		System.out.println("Bienvenido j1 reñena tus datos para comenzar: ");
		p1 = añadirJugador();
			
		System.out.println("Comienza el juego");
		baraja.barajarCartas();
		
		turnoJ1();
		
		if(p1.comprobarPuntos()) {
			
			System.out.println("Turno para el j2: ");
			turnoJ2();
			
			System.out.println("Puntos de " + p1.getNombre() + ": " +  p1.getPuntos() + p1.getCartas().toString());
			System.out.println("Puntos de " + p2.getNombre() + ": " + p2.getPuntos() + p2.getCartas().toString());
			
			if(p2.comprobarPuntos())
			comprobarGanador();
			else System.out.println("Has ganado (El BOT se ha pasado)");

		}
		else {
			
			System.out.println("GAME OVER TE HAS PASADO");		
			Reproductor.reproducirPerder();
		}					
	}

	private void comprobarGanador() {
		
		if(p1.getPuntos()<p2.getPuntos()) {
			
			System.out.println("Has perdido el bot ha conseguido mas puntos que tu");
			Reproductor.reproducirPerder();

		}else System.out.println("Has ganado has conseguido mas puntos");
		
	}

	private void turnoJ1() {
		
		boolean preguntar = true;
		
		while(p1.comprobarPuntos() && preguntar) {
			
			if(preguntarCarta()) { 	
				
				p1.añadirCartas(baraja.cogerCarta());
				System.out.println(p1.getCartas().toString());
				System.out.println("Puntos: " + p1.getPuntos());
				
			}else {
				
				System.out.println("Tu puntuacion es la siguiente: " + p1.getPuntos() );
				p1.getCartas().toString();
				preguntar = false;
				
			}		
		}
	}
		
	private void turnoJ2() {
		
		while(p1.getPuntos()>p2.getPuntos() && p2.comprobarPuntos()) {
			
			try {
				p2.añadirCartas(baraja.cogerCarta());	
				System.out.println(p2.getCartas().toString());
				System.out.println("Puntos: " + p2.getPuntos());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	
	private boolean preguntarCarta() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quiere carta? S/N");
		String res = sc.nextLine();
		
		if (res.toUpperCase().compareTo("S") == 0)
			
			return true;
		
		else if(res.toUpperCase().compareTo("N") == 0)
			
			return false;	
		
		else
			return preguntarCarta();
		
			
	}
	
	private Player añadirJugador() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();
		return new Player(nombre);
		
	}
	
	public static void clear() {  
		
		for(int i = 0; i<10;i++)
				System.out.println();
		
	}  
}
