package zooAnimales;

import gestion.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	static {
		totalAnimales ++;
	}
	
	public Animal(String name, int age, String habitat, String gender) {
		nombre = name;
		edad = age;
		this.habitat = habitat;
		genero = gender;
	}
	
	public Animal() {
		
	}
	
	public String movimiento(){
		return "desplazarse";
	}
	
	public void totalPorTipo() {
		System.out.println("Mamiferos:"+Mamifero.cantidadMamiferos()+"\n"
		+"Aves:"+Ave.cantidadAves()+"\n"
		+"Reptiles:"+Reptil.cantidadReptiles()+"\n"
		+"Peces:"+Pez.cantidadPeces()+"\n"
		+"Anfibios:"+Anfibio.cantidadAnfibios()+"\n");
	}
	
	public String toString() {
		if (zona != null) {
			return "Mi nombre es "+nombre+", tengo una edad de "+nombre+","
					+ " habito en "+nombre+" y mi genero es "
					+ genero+", la zona en la que me ubico es "+zona.getNombre()+", en el "+zona.getZoo().getNombre()+"";
		}
		else {
			return "Mi nombre es "+nombre+", tengo una edad de "+nombre+","
					+ " habito en "+nombre+" y mi genero es "
					+ genero;
		}
	}
	
	public int getEdad() {
		return edad;
	}
	public String getGenero() {
		return genero;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getNombre() {
		return nombre;
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public Zona getZona() {
		return zona;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}