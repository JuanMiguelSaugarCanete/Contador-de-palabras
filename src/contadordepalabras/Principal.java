package contadordepalabras;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		HashMap<String, Integer> contador = new HashMap<>();
		Scanner escaner = new Scanner(System.in);
		
		String texto ;
		
		System.out.println("Dime el texto:");
		texto = escaner.nextLine();
		texto = texto.toLowerCase().replace(","," ").replace("."," ")
				.replace("á","a").replace("é","e").replace("í","i")
				.replace("ó","o").replace("ú","u").replace(";"," ");
		
		String [] texseparado = texto.split(" ");
		for(String t:texseparado) {
			if(contador.containsKey(t)) {
				contador.put(t,contador.get(t)+1);
			}else {
				contador.put(t, 1);
			}
		}
		for(String clave:contador.keySet()) {
			int valor = contador.get(clave);
			System.out.println(clave + " "+valor);
		}

	}

}
