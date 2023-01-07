package Prácticas;
import java.io.*;

public class LeePersona {
	
	public static void Mostrar(String nom_fich, Persona3[] persona) throws IOException{
		ObjectInputStream o = null;
		File fichero = null;
		
		try {
			System.out.println();
			System.out.println("-MUESTRA DE DATOS-");
			fichero = new File(nom_fich);
			
			if(fichero.exists()) {
				o = new ObjectInputStream(new FileInputStream(fichero));
				Persona3 per;
				String nom, salida_sex;
				char sex;
				int ed, x=0;
				double pes;
				
				do {
					try {
						per = (Persona3) o.readObject();
						persona[x] = per;
						x++;
						nom = per.getNom();
						sex = per.getSex();
						ed = per.getEd();
						pes = per.getPes();
						
						if(sex=='h'||sex=='H') {
							salida_sex = "HOMBRE";
						}else {
							salida_sex = "MUJER";
						}
						
						System.out.println("NOMBRE: "+nom+".   SEXO: "+salida_sex+".   EDAD: "+ed+" AÑOS.   PESO: "+pes+" KG");
					}catch(ArrayIndexOutOfBoundsException e) {}
				}while(true);
			}else {
				System.out.println("FICHERO NO EXISTENTE");
			}
		}catch(EOFException e) {
			System.out.println("FIN DEL LISTADO");
		}catch(ClassNotFoundException e){
			System.out.println("ERROR, " + e.getMessage());
		}finally {
			if(o!=null) {
				o.close();
			}
		}
	}

	public static void main(String[] args) {
		String nom_fich = null;
		File fichero = null;
		
		try {
			System.out.print("NOMBRE DEL FICHERO A MOSTRAR: ");
			nom_fich = LeerArchivo.dato();
			Persona3[] persona = new Persona3[5];
			Mostrar(nom_fich, persona);
		}catch(IOException e) {
			System.out.println("ERROR, " + e.getMessage());
		}
	}
}