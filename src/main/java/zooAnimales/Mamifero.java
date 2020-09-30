package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String name, int age, String habitat, String gender, boolean fur, int feet) {
		super(name,age,habitat,gender);
		pelaje = fur;
		patas = feet;
	}
	
	public Mamifero() {
	}
	
	{
		listado.add(this);
	}
	
	public static int cantidadMamiferos(){
		return listado.size();
	}
	
	public Mamifero crearCaballo(String name, int age, String gender) {
		caballos ++;
		return new Mamifero(name,age,"pradera",gender,true,4);
	}
	
	public Mamifero crearLeon(String name, int age, String gender) {
		leones ++;
		return new Mamifero(name,age,"selva",gender,true,4);
	}

}
