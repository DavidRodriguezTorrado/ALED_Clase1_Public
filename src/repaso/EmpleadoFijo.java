package repaso;

public class EmpleadoFijo extends Empleado {

	public EmpleadoFijo(String nombre) {
		super(nombre);
	}
	
	@Override
	public int calcularSalario() {
		return 2000;
	}
	
	public static void main(String[] args) {
		EmpleadoFijo e = new EmpleadoFijo("Alejandro");
		System.out.println(e.calcularSalario());
	}
	
	
}
