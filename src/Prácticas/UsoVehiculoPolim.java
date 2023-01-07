package Prácticas;
//USANDO POLIMORFISMO, SE LLENAN DATOS DE 4 VEHÍCULOS DIFERENTES Y SE IMPRIME
public class UsoVehiculoPolim {

	public static void main(String[] args) {
		VehiculoPolim[] vehic = new VehiculoPolim[4];
		vehic[0] = new VehiculoPolim("RGQ106","CHEVROLET","SPARK");
		vehic[1] = new VehiculoTurismoPolim("AZT188", "NISSAN", "AVEO", 3);
		vehic[2] = new VehiculoDeportivoPolim("AFB397", "FORD", "FIESTA", 4);
		vehic[3] = new VehiculoFurgonetaPolim("JHT961", "MINICOOPER", "CHILLI", 495);
		
		System.out.println("MUESTRA DE DATOS");
		for(int a=0; a<vehic.length; a++) {
			System.out.println("VEHÍCULO "+(a+1)+":   "+vehic[a].MostrarDatos());
		}
	}
}