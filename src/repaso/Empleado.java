package repaso;

public class Empleado extends Persona implements Cansado {

	public Empleado(String nombre) {
		super(nombre);
	}

	public int calcularSalario() {
		return 0;
	}

	@Override
	public void descansar() {
		System.out.println("Soy un empleado y estoy descansando...");
	}

}
