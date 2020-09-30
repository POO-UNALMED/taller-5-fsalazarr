package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String name, int age, String habitat, String gender, String color, int cant) {
		super(name,age,habitat,gender);
		colorEscamas = color;
		cantidadAletas = cant;
	}
	
	public Pez() {
	}
	
	{
		listado.add(this);
	}
	
	public static int cantidadPeces(){
		return listado.size();
	}
	
	public String movimiento(){
		return "nadar";
	}
	
	public Pez crearSalmon(String name, int age, String gender) {
		salmones ++;
		return new Pez(name,age,"oceano",gender,"rojo",6);
	}
	
	public Pez crearBacalao(String name, int age, String gender) {
		bacalaos ++;
		return new Pez(name,age,"oceano",gender,"gris",6);
	}
}
