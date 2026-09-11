package repaso;

public class Estudiante extends Persona implements Cansado {

	public Estudiante(String nombre) {
		super(nombre);
	}
	
	@Override
	public void comer() {
		System.out.println("Soy un estudiante y estoy comiendo...");
	}
	
	public static void main(String[] args) {
		Estudiante e = new Estudiante("Laura");
		System.out.println(e.nombre);
		
		e.comer();
	}

	@Override
	public void descansar() {
		System.out.println("Soy un estudiante y estoy descansando...");
	}
	
	
	
	
}
