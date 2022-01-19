package edu.educacionit;

public class PiedraPapelTijera {
public static void main (String...params) {
System.out.println("Piedra papel tijera");

java.util.Scanner teclado = new java.util.Scanner(System.in);
String jugador1;
String jugador2;


System.out.println("Que opcion elije el jugador 1? ");
jugador1 = teclado.next();
System.out.println("Que opcion elije el jugador 2? ");
jugador2 = teclado.next();

System.out.println("El jugador 1 eligio " + jugador1 + " y el jugador 2 eligio " + jugador2);

if (jugador1.equals("papel") && jugador2.equals("papel"))
System.out.println("Empate");
else if (jugador1.equals("papel") && jugador2.equals("piedra"))
System.out.println("Gano el jugador 1");
else if (jugador1.equals("papel") && jugador2.equals("tijera"))
System.out.println("Gano el jugador 2");
else if (jugador1.equals("piedra") && jugador2.equals("papel"))
System.out.println("Gano el jugador 2");
else if (jugador1.equals("piedra") && jugador2.equals("piedra"))
System.out.println("Empate");
else if (jugador1.equals("piedra") && jugador2.equals("tijera"))
System.out.println("Gano el jugador 1");
else if (jugador1.equals("tijera") && jugador2.equals("papel"))
System.out.println("Gano el jugador 1");
else if (jugador1.equals("tijera") && jugador2.equals("piedra"))
System.out.println("Gano el jugador 2");
else if (jugador1.equals("tijera") && jugador2.equals("tijera"))
System.out.println("Empate");
else
System.out.println("Lalala");





}
}