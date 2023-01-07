package Prácticas;
//GENERA UNA RUTA DE CAMION Y UN NÚMERO ALEATORIO
public class CamionesRandom {

	public static void main(String[] args) {
		String c[] = {"BUENOS AIRES","LOMITA-CAÑADAS","VEGAS","HUIZACHES","RUIZ CORTINEZ","BARRIO-PEMEX","NORMAL","DIAZ ORDAZ"};
		int x = (int) (Math.random()*7);
		int num = (int) (Math.random()*30);
		System.out.println(c[x] + " " + num);
	}
}