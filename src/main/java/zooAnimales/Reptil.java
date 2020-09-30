package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String name, int age, String habitat, String gender, String color, int tail) {
		super(name,age,habitat,gender);
		colorEscamas = color;
		largoCola = tail;
	}
	
	public Reptil() {
	}
	
	{
		listado.add(this);
	}
	
	public static int cantidadReptiles(){
		return listado.size();
	}
	
	public String movimiento(){
		return "reptar";
	}
	
	public Reptil crearIguana(String name, int age, String gender) {
		iguanas ++;
		return new Reptil(name,age,"humedal",gender,"verde",3);
	}
	
	public Reptil crearSerpiente(String name, int age, String gender) {
		serpientes ++;
		return new Reptil(name,age,"jungla",gender,"blanco",1);
	}
}
