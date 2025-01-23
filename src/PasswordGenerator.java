/*
Create un nuovo progetto java chiamato java-password-generator
Aggiungete una classe PasswordGenerator che contiene un metodo main
Il programma deve fare quanto segue:
- chiedere all'utente e salvare in opportune variabili il
	- nome
	- cognome
	- colore preferito
	- data di nascita di un utente suddivisa in giorno, mese e anno in numero
- generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
La sua password sarà Pinco-Pallo-magenta-2011
*/
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Inserisci il tuo nome");
			String nome = scan.next();
			System.out.println("Inserisci il tuo cognome");
			String cognome = scan.next();
			System.out.println("Inserisci il tuo colore preferito");
			String colore = scan.next();
			System.out.println("Inserisci il tuo giorno di nascita");
			int giorno = scan.nextInt();
			System.out.println("Inserisci il tuo mese di nascita");
			int mese = scan.nextInt();
			System.out.println("Inserisci il tuo anno di nascita");
			int anno = scan.nextInt();
			char dash = '-';
			int birthDate = giorno+mese+anno;
			String password = nome+dash+cognome+dash+colore+dash+birthDate;
			System.out.println("La tua password è: "+password);
      		scan.close();
    		}catch (ExceptionInInitializerError e) {
      			System.out.println("An error occurred.");  
    		} 
  		}
	}
