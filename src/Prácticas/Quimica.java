package Prácticas;

public class Quimica {

	public static void main(String[] args) {
		int acum = 0;
		double cor = 0, incor = 0;
		String resp;
		char z;
		String[] v = { "TRANSFORMACIÓN DE UNA SUSTANCIA EN OTRA",
				"PROCESO DONDE UNA O MÁS SUSTANCIAS AL REACCIONAR SE TRANSFORMAN EN OTRAS",
				"REPRESENTACIÓN DE UNA REACCIÓN QUÍMICA", "SE UNEN PARA FORMAR UN COMPUESTO MÁS COMPLEJO",
				"UN COMPUESTO SE DESCOMPONE PARA DAR DOS ELEMENTOS O MÁS", "REACCIONES EN LAS CUALES UN ELEMENTO DESPLAZA A OTRO DE UN COMPUESTO",
				"LOS REACCIONANTES SON DOS COMPUESTOS Y LOS PRODUCIDOS SON DOS COMPUESTOS DIFERENTES A LOS ANTERIORES",
				"LOS REACCIONANTES SON DOS COMPUESTOS Y UN ELEMENTO, Y LA SUSTANCIA PRODUCIDA ES UN COMPUESTO", "PRODUCEN UNA FLAMA"};
		do {
			acum++;
			int x = (int) (Math.random() * 9);
			System.out.println(v[x]);

			if (x == 0) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if (resp.equals("FENOMENO")) {
					System.out.println("CORRECTO");
					cor++;
				} else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}

			if (x == 1) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if (resp.equals("REACCION")) {
					System.out.println("CORRECTO");
					cor++;
				} else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}

			if (x == 2) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if (resp.equals("ECUACION")) {
					System.out.println("CORRECTO");
					cor++;
				} else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}
			
			if(x==3) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if(resp.equals("SINTESIS")) {
					System.out.println("CORRECTO");
					cor++;
				}else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}
			
			if(x==4) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if(resp.equals("DESCOMPOSICION")) {
					System.out.println("CORRECTO");
					cor++;
				}else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}
			
			if(x==5) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if(resp.equals("SIMPLE")) {
					System.out.println("CORRECTO");
					cor++;
				}else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}
			
			if(x==6) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if(resp.equals("DOBLE")) {
					System.out.println("CORRECTO");
					cor++;
				}else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}
			
			if(x==7) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if(resp.equals("ADICION")) {
					System.out.println("CORRECTO");
					cor++;
				}else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}
			
			if(x==8) {
				System.out.print("RESPUESTA: ");
				resp = Leer.dato();
				if(resp.equals("COMBUSTION")){
					System.out.println("CORRECTO");
					cor++;
				}else {
					System.out.println("INCORRECTO");
					incor++;
				}
			}
			
			double prom_cor = (cor/acum) * 100;
			double prom_incor = (incor/acum) * 100;
			
			do {
				System.out.print("¿QUIERES HACERLO DE NUEVO?   S=SÍ   N=NO: ");
				z = Leer.datocar();
				if (z == 'n' || z == 'N') {
					System.out.println();
					System.out.println("HICISTE " + (int) acum + " PREGUNTAS");
					System.out.println("CORRECTOS: " + (int) cor + " DE " + acum + " - (" + prom_cor + "%)");
					System.out.println("INCORRECTOS: " + (int) incor + " DE " + acum + " - (" + prom_incor + "%)");
					System.out.println("FIN");
				}
			} while (z != 's' && z != 'S' && z != 'n' && z != 'N');
		} while (z == 's' || z == 'S');
	}
}