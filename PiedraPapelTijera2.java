/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera2;

/**
 *
 * @author Rocio
 */
public class PiedraPapelTijera2 {

   
    static public String calcularGanador (String jugador1, String jugador2) {
    
        String ganador = "";
        System.out.println("El jugador 1 eligió " + jugador1 + " y el jugador 2 eligió " + jugador2);
        
    if (jugador1.equals("papel") && jugador2.equals("papel"))
            System.out.println("Es empate"); 
        else if (jugador1.equals("papel") && jugador2.equals("piedra"))
                System.out.println("Gano el jugador 1");
        else if (jugador1.equals("papel") && jugador2.equals("tijera"))
                System.out.println("Gano el jugador 2");
        else if (jugador1.equals("piedra") && jugador2.equals("papel"))
                System.out.println("Gano el jugador 2");
        else if (jugador1.equals("piedra") && jugador2.equals("piedra"))
                System.out.println("Es empate");
        else if (jugador1.equals("piedra") && jugador2.equals("tijera"))
                System.out.println("Gano el jugador 1");
        else if (jugador1.equals("tijera") && jugador2.equals("papel"))
                System.out.println("Gano el jugador 1");
        else if (jugador1.equals("tijera") && jugador2.equals("piedra"))
                System.out.println("Gano el jugador 2");
        else if (jugador1.equals("tijera") && jugador2.equals("tijera"))
                System.out.println("Es empate");
        else 
                System.out.println("??");
            
                return ganador;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ganador;
        String jugador1;
        String jugador2;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        System.out.println("Jugador 1: piedra, papel o tijera? ");
            jugador1 = teclado.next();
        System.out.println("Jugador 2: piedra, papel o tijera? ");
            jugador2 = teclado.next();
            
            ganador = calcularGanador(jugador1, jugador2);
        

        
        
    }
    
}
