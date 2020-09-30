package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico(String name, String location) {
		nombre = name;
		ubicacion = location;
	}
	
	public Zoologico() {
	}
	
	public void agregarZonas(Zona zone){
		zonas.add(zone);
	}
	
	public int cantidadTotalAnimales() {
		int aux = 0;
		for (Zona z : zonas) {
			aux += z.cantidadAnimales();
		}
		return aux;
	}
	public String getNombre() {
		return nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
}
