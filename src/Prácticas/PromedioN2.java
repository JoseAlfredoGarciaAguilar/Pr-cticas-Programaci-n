package Prácticas;
import javax.swing.JOptionPane;
//SE PIDEN N NÚMEROS Y SE MUESTRA EL PROMEDIO POR JOPTIONPANE
public class PromedioN2 {

	public static void main(String[] args) {
		int suma=0;
		double prom=0;
		Integer.parseInt(JOptionPane.showInputDialog("¿CUÁNTOS VALORES AGREGARÁS?: "));
		int val = Leer.datoInt();
		int[] arr = new int[val];
		
		for(int x=0; x<arr.length; x++) {
			Integer.parseInt(JOptionPane.showInputDialog("VALOR " + (x+1) + ": "));
			arr[x] = Leer.datoInt();
			suma = suma + arr[x];
			prom = suma / arr.length;
		}
		JOptionPane.showMessageDialog(null, "PROMEDIO = " + prom);
	}
}