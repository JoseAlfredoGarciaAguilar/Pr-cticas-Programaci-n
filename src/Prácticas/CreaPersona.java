package Prácticas;
import java.io.*;

public class CreaPersona {
	
	public static void Crear(File fichero) throws IOException{
		PrintStream f = System.out;
		ObjectOutputStream x = null;
		char r;
		
		try {
			x = new ObjectOutputStream(new FileOutputStream(fichero));
			String nom;
			char sex;
			int ed;
			double pes;
			
			do {
				System.out.print("NOMBRE: ");
				nom = LeerArchivo.dato();
				
				do {
					System.out.print("SEXO DE " + nom + "   H=HOMBRE   M=MUJER: ");
					sex = LeerArchivo.carácter();
					if(sex=='h'||sex=='H') {
						System.out.println(nom + " ES HOMBRE");
					}
					else if(sex=='m'||sex=='M') {
						System.out.println(nom + " ES MUJER");
					}
					else if(sex!='h'&&sex!='H'&&sex!='m'&&sex!='M')
						System.out.println("INVÁLIDO...");
				}while(sex!='h'&&sex!='H'&&sex!='m'&&sex!='M');
				
				do {
					System.out.print("EDAD DE " + nom + " (1-100): ");
					ed = LeerArchivo.carácter();
					if(ed<1||ed>100) {
						System.out.println("INVÁLIDO...");
					}else {
						System.out.println(nom + " TIENE " + ed + " AÑOS");
					}
				}while(ed<1||ed>100);
				
				do {
					System.out.print("PESO DE " + nom + " EN KILOS (10-250): ");
					pes = LeerArchivo.carácter();
					if(pes<10||pes>250) {
						System.out.println("INVÁLIDO...");
					}else {
						System.out.println(nom + " PESA " + pes + " KILOS");
					}
				}while(pes<10||pes>250);
				
				x.writeObject(new Persona3(nom, sex, ed, pes));
				
				do {
					System.out.println("¿QUIERES AGREGAR OTRO REGISTRO?   S=SÍ   N=NO:");
					r = LeerArchivo.carácter();
					LeerArchivo.limpiar();
					if(r=='n'||r=='N') {
						System.out.println("FIN");
					}
					if(r!='s'&&r!='S'&&r!='n'&&r!='N') {
						System.out.println("OPCIÓN INVÁLIDA");
					}
				}while(r!='s'&&r!='S'&&r!='n'&&r!='N');
			}while(r=='s'||r=='S');
		}finally {
			if(x!=null) {
				x.close();
			}
		}
	}

	public static void main(String[] args) {
		PrintStream f = System.out;
		String nom_fich = null;
		File fichero = null;
		
		try {
			System.out.print("NOMBRE DEL NUEVO FICHERO: ");
			nom_fich = LeerArchivo.dato();
			fichero = new File(nom_fich);
			char r='s';
			
			if(fichero.exists()) {
				do {
					f.print("EL FICHERO YA EXISTE. ¿QUIERES SOBREESCRIBIRLO?   S=SÍ   N=NO: ");
					r = LeerArchivo.carácter();
					if(r!='s'&&r!='S'&&r!='n'&&r!='N') {
						System.out.println("INVÁLIDO...");
					}
				}while(r!='s'&&r!='S'&&r!='n'&&r!='N');
			}
			if(r=='s'||r=='S') {
				Crear(fichero);
			}
		}catch(IOException e) {
			f.println("ERROR, " + e.getMessage());
		}
	}
}