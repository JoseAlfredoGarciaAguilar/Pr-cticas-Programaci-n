package Prácticas;

public class ExceptionSintaxis {

	public static void main(String[] args) {
		try {
			//CÓDIGO QUE PUEDA GENERAR ERRORES
		}catch(Tipo1 ejemplo1) {
			//MANEJAR EXCEPTIONS PARA LA CLASE TIPO1
		}catch(Tipo2 ejemplo2) {
			//MANEJAR EXCEPTIONS PARA LA CLASE TIPO2
		}catch(Tipo3 ejemplo3) {
			//MANEJAR EXCEPTIONS PARA LA CLASE TIPO3
		}finally {
			//ACTIVIDADES QUE SIEMPRE OCURREN
		}
	}
}