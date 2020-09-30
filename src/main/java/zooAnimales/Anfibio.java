package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String name, int age, String habitat, String gender, String color, boolean poison) {
		super(name,age,habitat,gender);
		colorPiel = color;
		venenoso = poison;
	}
	
	public Anfibio() {
	}
	
	{
		listado.add(this);
	}
	
	public static int cantidadAnfibios(){
		return listado.size();
	}
	
	public String movimiento(){
		return "saltar";
	}
	
	public Anfibio crearRana(String name, int age, String gender) {
		ranas ++;
		return new Anfibio(name,age,"selva",gender,"rojo",true);
	}
	
	public Anfibio crearSalamandra(String name, int age, String gender) {
		salamandras ++;
		return new Anfibio(name,age,"selva",gender,"negro y amarillo",false);
	}
}
