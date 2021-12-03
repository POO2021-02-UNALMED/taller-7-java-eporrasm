package comunicacion;

import java.util.*;

public class Alfabeto extends Pictograma {
	private static List<String> letras = new ArrayList<String>();
	private String interpretacion;
	public Alfabeto(String origen, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
	}
	public static int cantidadLetras() {
		return letras.size();
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		StringBuilder alfabeto = new StringBuilder();
		for (String letra: letras) {
			alfabeto.append(letra+", ");
		}
		alfabeto.delete(alfabeto.length()-2, alfabeto.length()-1);
		return alfabeto.toString();
	}
	public static List<String> getLetras() {
		return letras;
	}
	public static void setLetras(List<String> letras) {
		Alfabeto.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
