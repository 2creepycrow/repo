package traductor;

public class Nombre {

	public static void main(String[] args) {
		boolean seguir;
		do {
			String nombre = PedirDatos.leerCadena("Introduzca su nombre");
			nombre = nombre.toUpperCase();
			System.out.println(componerNombre(nombre));
		} while (seguir = true);
	}

	public static String componerNombre(String nombre) {
		String ret = "";
		for (int i = 0; i < nombre.length(); i++) {
			char caracter = nombre.charAt(i);
			switch (caracter) {
			case 'A':
				ret = ret + "KA";
				break;
			case 'B':
				ret = ret + "TU";
				break;
			case 'C':
				ret = ret + "MI";
				break;
			case 'D':
				ret = ret + "TE";
				break;
			case 'E':
				ret = ret + "KU";
				break;
			case 'F':
				ret = ret + "LU";
				break;
			case 'G':
				ret = ret + "JI";
				break;
			case 'H':
				ret = ret + "RI";
				break;
			case 'I':
				ret = ret + "KI";
				break;
			case 'J':
				ret = ret + "ZU";
				break;
			case 'K':
				ret = ret + "ME";
				break;
			case 'L':
				ret = ret + "TA";
				break;
			case 'M':
				ret = ret + "RIN";
				break;
			case 'N':
				ret = ret + "TO";
				break;
			case 'O':
				ret = ret + "MO";
				break;
			case 'P':
				ret = ret + "NO";
				break;
			case 'Q':
				ret = ret + "KE";
				break;
			case 'R':
				ret = ret + "SHI";
				break;
			case 'S':
				ret = ret + "ARI";
				break;
			case 'T':
				ret = ret + "CHI";
				break;
			case 'U':
				ret = ret + "DO";
				break;
			case 'V':
				ret = ret + "RU";
				break;
			case 'X':
				ret = ret + "NA";
				break;
			case 'W':
				ret = ret + "MEI";
				break;
			case 'Y':
				ret = ret + "FU";
				break;
			case 'Z':
				ret = ret + "RA";
				break;
			case 'Á':
				ret = ret + "KA";
				break;
			case 'É':
				ret = ret + "KU";
				break;
			case 'Í':
				ret = ret + "KI";
				break;
			case 'Ó':
				ret = ret + "MO";
				break;
			case 'Ú':
				ret = ret + "DO";
				break;
			case ' ':
				ret = ret + " ";
				break;
			default:
				System.out.println("Debe introducir un nombre válido");
				break;
			}
		}
		return ret;
	}

}
