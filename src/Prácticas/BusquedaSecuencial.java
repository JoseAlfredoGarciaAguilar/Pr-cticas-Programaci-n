package Pr�cticas;
//BUSCA UN N�MERO EN UN ARREGLO, Y MUESTRA SI EXISTE DENTRO DE �L O NO
public class BusquedaSecuencial {

	public static void main(String[] args) {
		//SE ASIGNAN VALORES AL ARREGLO
		int arreglo[] = {2,8,0,24,11,13,6,4,1};
		
		//SE DECLARA EL M�TODO
		Busca(arreglo);
	}
	
	public static void Busca(int[] arreglo) {
		boolean b=false;
		//SE PREGUNTA POR EL N�MERO A BUSCAR
		System.out.print("N�MERO A BUSCAR: ");
		int num = Leer.datoInt();
		
		//SE RECORRE EL ARREGLO BUSCANDO EL N�MERO DENTRO DE TODOS LOS ELEMENTOS DEL ARREGLO
		for(int i=0; i<arreglo.length; i++) {
			if(num==arreglo[i]) {
				b=true;
			}
		}
		
		//SE MUESTRA EL MENSAJE
		if(b==true) {
			System.out.println("EL N�MERO " + num + " S� EST� EN EL ARREGLO");
		}else {
			System.out.println("EL N�MERO " + num + " NO EST� EN EL ARREGLO");
		}
	}
}