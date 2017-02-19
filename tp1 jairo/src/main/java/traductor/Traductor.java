package traductor;

import java.io.*;
public class TraductorJuan {

	public static void main(String[] args) {
		String nombreformado="";
		try {
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce tu nombre y se te mostrará en japonés: ");
			String nombre=teclado.readLine().toUpperCase().trim();
			for (int i=0; i<nombre.length(); i++) {
				char caracter=nombre.charAt(i); // Tenemos la primera letra
				String cadenadevuelta=devolverTraduccion(caracter);
				nombreformado+=cadenadevuelta;
			}
			
			System.out.println("Tu nombre "+nombre+" en japonés es: "+nombreformado);
			
		} catch (IOException e) {
			System.out.println("Error de I/O");
		}
	}
	public static String devolverTraduccion(char caracter){
		switch (caracter) {
		case 'A':
			return "KA";
		case 'B':
			return "TU";
		case 'C':
			return "MI";
		case 'D':
			return "TE";
		case 'E':
			return "KU";
		case 'F':
			return "LU";
		case 'G':
			return "JI";
		case 'H':
			return "RI";
		case 'I':
			return "KI";
		case 'J':
			return "ZU";
		case 'K':
			return "ME";
		case 'L':
			return "TA";
		case 'M':
			return "RIN";
		case 'N':
			return "TO";
		case 'Ñ':
			return "TO";
		case 'O':
			return "MO";
		case 'P':
			return "NO";
		case 'Q':
			return "KE";
		case 'R':
			return "SHI";
		case 'S':
			return "ARI";
		case 'T':
			return "CHI";
		case 'U':
			return "DO";
		case 'V':
			return "RU";
		case 'W':
			return "MEI";
		case 'X':
			return "NA";
		case 'Y':
			return "FU";
		case 'Z':
			return "RA";
		case 'Á':
			return "KA";
		case 'É':
			return "KU";
		case 'Í':
			return "KI";
		case 'Ó':
			return "MO";
		case 'Ú':
			return "DO";
		}
		return "";
	}
}