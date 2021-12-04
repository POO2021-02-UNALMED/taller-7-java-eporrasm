package comunicacion;

import java.util.*;

public class Alfabeto extends Pictograma {
	private static String[] letras;
	private String interpretacion;
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	public static int cantidadLetras() {
		return letras.length;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		StringBuilder alfabeto = new StringBuilder();
		for (String letra: letras) {
			alfabeto.append(letra+", ");
		}
		alfabeto.delete(alfabeto.length()-3, alfabeto.length()-1);
		return alfabeto.toString();
	}
	public static String[] getLetras() {
		return letras;
	}
	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
