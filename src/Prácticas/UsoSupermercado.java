package Prácticas;

public class UsoSupermercado {

	public static void main(String[] args) {
		System.out.println("\tSUPERMERCADO");
		System.out.println("\t-CARNES-");
		System.out.print("¿CUÁNTOS PESCADOS?: ");
		int pesc = Leer.datoInt();
		System.out.print("¿CUÁNTOS POLLOS?: ");
		int poll = Leer.datoInt();
		System.out.println("\t-FRUTAS-");
		System.out.print("¿CUÁNTAS MANZANAS?: ");
		int manz = Leer.datoInt();
		System.out.print("¿CUÁNTOS PLÁTANOS?: ");
		int plat = Leer.datoInt();
		System.out.println("\t-VERDURAS-");
		System.out.print("¿CUÁNTOS TOMATES?: ");
		int tom = Leer.datoInt();
		System.out.print("¿CUÁNTAS CEBOLLAS?: ");
		int ceb = Leer.datoInt();
		
		CarnesPescado[] pescado = new CarnesPescado[pesc];
		CarnesPollo[] pollo = new CarnesPollo[poll];
		FrutasManzana[] manzana = new FrutasManzana[manz];
		FrutasPlátano[] platano = new FrutasPlátano[plat];
		VerdurasTomate[] tomate = new VerdurasTomate[tom];
		VerdurasCebolla[] cebolla = new VerdurasCebolla[ceb];
		
		CapturaPescado(pescado);
		ImprimirPescado(pescado);
	}
	
	public static void CapturaPescado(CarnesPescado[] pescado) {
		double precio=0, peso=0, gramos=0, colesterol=0;
		if(pescado.length!=0) {
			System.out.println("\t-CAPTURA DE PESCADO-");
			for(int a=0; a<pescado.length; a++) {
				System.out.print((a+1) + "- MARCA PESCADO: ");
				String marca = Leer.dato();
				//SE VALIDA QUE SE INGRESE UN PRECIO ENTRE 1 Y 10000 PESOS
				do {
					System.out.print((a+1) + "- PRECIO POR KG: ");
					precio = Leer.datoDouble();
					if(precio<1) {
						System.out.println("NINGÚN PESCADO PUEDE COSTAR TAN BARATO");
					}
					if(precio>=10000) {
						System.out.println("NINGÚN PESCADO PUEDE COSTAR TAN CARO");
					}
				}while(precio<1 || precio>=10000);
				System.out.print((a+1) + "- CÓDIGO DE BARRAS: ");
				String codigo = Leer.dato();
				//SE VALIDA QUE SE INGRESE UN PESO ENTRE 0.1 Y 1000 KILOS
				do {
					System.out.print((a+1) + "- PESO EN KG: ");
					peso = Leer.datoDouble();
					if(peso<0.1) {
						System.out.println("NINGÚN PESCADO PUEDE PESAR TAN POCO");
					}
					if(peso>=1000) {
						System.out.println("NINGÚN PESCADO PUEDE PESAR TANTO");
					}
				}while(peso<0.1 || peso>=1000);
				//SE VALIDA QUE SE INGRESE UNA GRASA MENOR O IGUAL A 5000 GRAMOS
				do {
					System.out.print((a+1) + "- GRASA EN GRAMOS: ");
					gramos = Leer.datoDouble();
					if(gramos>5000) {
						System.out.println("NINGÚN PESCADO TIENE MÁS DE 5000 GR DE GRASA");
					}
				}while(gramos>=5000);
				//SE VALIDA QUE SE INGRESE UN COLESTEROL ENTRE 0 Y 5000 GRAMOS
				do {
					System.out.print((a+1) + "- COLESTEROL EN GRAMOS: ");
					colesterol = Leer.datoDouble();
					if(colesterol<0) {
						System.out.println("NINGÚN PESCADO TIENE MENOS DE 0 GR DE COLESTEROL");
					}
					if(colesterol>5000) {
						System.out.println("NINGÚN PESCADO TIENE MÁS DE 5000 GR DE COLESTEROL");
					}
				}while(colesterol<0 || colesterol>5000);
				
				pescado[a] = new CarnesPescado(marca, precio, codigo, peso, gramos, colesterol);
				System.out.println();
		}
		}
	}
	
	public static void ImprimirPescado(CarnesPescado[] pescado) {
		if(pescado.length!=0) {
			System.out.println("\t-LISTA DE PESCADOS-");
			for(int b=0; b<pescado.length; b++) {
				System.out.println((b+1) + ": " + pescado[b].ToStringPescado());
			}
		}
	}
}