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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double calcularSalario(){
        return salarioBase;
    }

    public String trabajar(){
        return "Estoy trabajando en el centro educativo";
    }

    public long antiguedad(){
        return ChronoUnit.YEARS.between(fechaDeIncorporacion, LocalDate.now());
    }

    @Override
    public String toString() {
        return "El trabajador " + dni + " con el nombre " + nombre + apellidos + " fue contratado el dia " + fechaDeIncorporacion + " y actualmente tiene un salario de " + salarioBase;
    }
}
