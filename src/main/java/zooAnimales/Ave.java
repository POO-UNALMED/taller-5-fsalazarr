package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String name, int age, String habitat, String gender, String colorPlumas) {
		super(name,age,habitat,gender);
		this.colorPlumas = colorPlumas;
	}
	
	public Ave() {
	}
	
	{
		listado.add(this);
	}
	
	public static int cantidadAves(){
		return listado.size();
	}
	
	public String movimiento(){
		return "volar";
	}
	
	public Ave crearHalcon(String name, int age, String gender) {
		halcones ++;
		return new Ave(name,age,"montañas",gender,"cafe glorioso");
	}
	
	public Ave crearAguila(String name, int age, String gender) {
		aguilas ++;
		return new Ave(name,age,"montañas",gender,"blanco y amarillo");
	}
}
