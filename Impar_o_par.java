/* Este codigo ha sido generado por el modulo psexport 20180802-mac de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "IMPAR_O_PAR.java."

import java.io.*;

public class impar_o_par {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double nro;
		nro = bufEntrada.readLine();
		if ((nro%2)==0) {
			System.out.println("es par");
			System.out.println("Gonzalez Piñon Oscar Zair");
		} else {
			System.out.println("es impar");
			System.out.println("Gonzalez Piñon Oscar Zair");
		}
	}


}

