package morraCinese;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int segnoAvv, segnoUser, puntiUser, puntiAvv; //assegno variabili int e stringa ai vari input user e pc per il confronto e la leggibilità dei risultati per l'utente
		String outcome, segno, segnoAvvTrad;
		puntiUser = 0;
		puntiAvv = 0;
		segnoUser = 0;
		
		
		do {
			System.out.println("Sasso, Carta o Forbice?");
			segno = sc.nextLine(); // prendiamo l'input utente per il segno lanciato
			segnoAvv = r.nextInt(3); // abbiamo 3 output casuali per il lancio del segno del computer
			if (segno.toLowerCase().equals("carta")) // trasformiamo la stringa utente in valore per calcolare vittoria
				segnoUser = 0;
			else if (segno.toLowerCase().equals("sasso")) // trasformiamo la stringa utente in valore per calcolare vittoria
															
				segnoUser = 1;
			else if (segno.toLowerCase().equals("forbice")) // trasformiamo la stringa utente in valore per calcolare vittoria
															 
				segnoUser = 2;

			if (segnoAvv == 0) // trasformiamo il numero generato dal computer in stringa carta/sasso/forbice
								// per output
				segnoAvvTrad = "carta";

			else if (segnoAvv == 1)
				segnoAvvTrad = "sasso";

			else
				segnoAvvTrad = "forbice";
			
			if (segnoUser == segnoAvv) { // se i segni sono uguali genera pareggio
				outcome = "pareggiato..";
			} else if (segnoUser == 0 && segnoAvv == 1 || segnoUser == 1 && segnoAvv == 2
					|| segnoUser == 2 && segnoAvv == 0) { // condizioni per la vittoria
				outcome = "vinto!!";
				puntiUser++; // aggiunge 1 punto all'user
			} else { // se le condizioni di vittoria non sono soddisf esegue sconfitta
				outcome = "perso!";
				puntiAvv++;// aggiunge 1 punto all'avversario
			}
			System.out.println("Il tuo avversario ha lanciato " + segnoAvvTrad + "! Hai " + outcome + "!");
			System.out.println("Il punteggio è di " + puntiUser + " a " + puntiAvv + ".");

		} while (puntiAvv < 5 && puntiUser < 5);
		sc.close();
		
		if (puntiUser == 5)
			System.out.println("Hai vinto la partita!!");
		else
			System.out.println("Hai perso la partita!!");
	}

}