package Prácticas;

public class Persona3 {
	private String nom;
	private char sex;
	private int ed;
	private double pes;
	
	public Persona3() {
		
	}

	public Persona3(String nom, char sex, int ed, double pes) {
		super();
		this.nom = nom;
		this.sex = sex;
		this.ed = ed;
		this.pes = pes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getEd() {
		return ed;
	}

	public void setEd(int ed) {
		this.ed = ed;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}
}