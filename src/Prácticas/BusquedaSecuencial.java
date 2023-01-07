package Prácticas;
//BUSCA UN NÚMERO EN UN ARREGLO, Y MUESTRA SI EXISTE DENTRO DE ÉL O NO
public class BusquedaSecuencial {

	public static void main(String[] args) {
		//SE ASIGNAN VALORES AL ARREGLO
		int arreglo[] = {2,8,0,24,11,13,6,4,1};
		
		//SE DECLARA EL MÉTODO
		Busca(arreglo);
	}
	
	public static void Busca(int[] arreglo) {
		boolean b=false;
		//SE PREGUNTA POR EL NÚMERO A BUSCAR
		System.out.print("NÚMERO A BUSCAR: ");
		int num = Leer.datoInt();
		
		//SE RECORRE EL ARREGLO BUSCANDO EL NÚMERO DENTRO DE TODOS LOS ELEMENTOS DEL ARREGLO
		for(int i=0; i<arreglo.length; i++) {
			if(num==arreglo[i]) {
				b=true;
			}
		}
		
		//SE MUESTRA EL MENSAJE
		if(b==true) {
			System.out.println("EL NÚMERO " + num + " SÍ ESTÁ EN EL ARREGLO");
		}else {
			System.out.println("EL NÚMERO " + num + " NO ESTÁ EN EL ARREGLO");
		}
	}
}