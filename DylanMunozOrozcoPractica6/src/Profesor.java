import java.time.LocalDate;

public class Profesor extends Trabajador{
    /**
     * Esta clase es una variante de trabajador
     * @author Dylan Munoz Orozco
     * @version 1.0*/

    private String especialidad;
    private int horasLectivasSemanales;
    private int precioHoras = 20;

    public Profesor(String nombre, String apellidos, String dni, LocalDate fechaDeIncorporacion, double salarioBase, String especialidad, int horasLectivasSemanales) {
        super(nombre, apellidos, dni, fechaDeIncorporacion, salarioBase);
        this.especialidad = especialidad;
        this.horasLectivasSemanales = horasLectivasSemanales;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasLectivasSemanales() {
        return horasLectivasSemanales;
    }

    public void setHorasLectivasSemanales(int horasLectivasSemanales) {
        this.horasLectivasSemanales = horasLectivasSemanales;
    }
    /**
     * el metodo calcularSalario nos da el salario de un profesor teniendo en cuenta sus horas y el precio de la misma
     * @return void
     * @parameters ninguno
     */
    public double calcularSalario(){
         return super.getSalarioBase() + (horasLectivasSemanales*precioHoras);
    }

    @Override
    public String trabajar() {
        return "Imparte clases en " + especialidad;
    }
}
