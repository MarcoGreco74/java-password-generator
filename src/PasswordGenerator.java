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
public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
		String nome = "Marco";
		String cognome = "Greco";
		String colore = "blu";
		int giorno = 7;
		int mese = 10;
		int anno = 1974;		
		char dash = '-';
		int birthDate = giorno+mese+anno;
		String password = nome+dash+cognome+dash+colore+dash+birthDate;	
		System.out.println("La tua password è: "+password);
    }
}
