import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Trabajador {
    private String nombre;
    private String apellidos;
    private String dni;
    private LocalDate fechaDeIncorporacion;
    private double salarioBase;

    public Trabajador() {
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    public Trabajador(String nombre, LocalDate fechaDeIncorporacion) {
        this.nombre = nombre;
        this.fechaDeIncorporacion = fechaDeIncorporacion;
    }

    public Trabajador(String nombre, String apellidos, String dni, LocalDate fechaDeIncorporacion, double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaDeIncorporacion = fechaDeIncorporacion;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @parameters ninguno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeIncorporacion() {
        return fechaDeIncorporacion;
    }

    public void setFechaDeIncorporacion(LocalDate fechaDeIncorporacion) {
        this.fechaDeIncorporacion = fechaDeIncorporacion;
    }

    /**
     *
     * @return double con el valor del salario
     * @parameters ninguno
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     *
     * @return double con el valor del salario
     * @parameters ninguno
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     *  CalcularSalario nos da el salario exacto del trabajador teniendo en cuenta los factores individuales de cada tipo de trabajador
     * @return double con el valor del salario
     * @parameters ninguno
     */
    public double calcularSalario(){
        return salarioBase;
    }
    /**
     * @return String con un mensaje predeterminado
     * parameters ninguno
     */
    public String trabajar(){
        return "Estoy trabajando en el centro educativo";
    }
    /**
     * Antiguedad calcula en años el tiempo que lleva en el trabajo
     * @return Long con el valor equivalente a los años que lleva trabajando en la empresa
     * @parameters ninguno
     */
    public long antiguedad(){
        return ChronoUnit.YEARS.between(fechaDeIncorporacion, LocalDate.now());
    }

    /**
     *
     * @return string
     * @parameters ninguno
     */

    @Override
    public String toString() {
        return "El trabajador " + dni + " con el nombre " + nombre + apellidos + " fue contratado el dia " + fechaDeIncorporacion + " y actualmente tiene un salario de " + salarioBase;
    }
}
