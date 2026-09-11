package repaso;

public class EmpleadoPorHoras extends Empleado {
	
	int horas;

	public EmpleadoPorHoras(String nombre, int horas) {
		super(nombre);
		this.horas = horas;
	}
	
	@Override
	public int calcularSalario() {
		return 20 * horas;
	}
	
	public static void main(String[] args) {
		EmpleadoPorHoras e = new EmpleadoPorHoras("Carla", 40);
		System.out.println(e.calcularSalario());
	}

	
}
