import java.time.LocalDate;

public class PersonalAdministrativo extends Trabajador{
    private String departamento;
    private int nivel;
    private int nivel1 = 500;
    private int nivel2 = 250;
    private int nivel3 = 100;

    public PersonalAdministrativo(String nombre, String apellidos, String dni, LocalDate fechaDeIncorporacion, double salarioBase, String departamento, int nivel) {
        super(nombre, apellidos, dni, fechaDeIncorporacion, salarioBase);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double calcularSalario(){
        if (nivel == 1) {
            return super.getSalarioBase() + nivel1;
        } else if (nivel == 2) {
            return super.getSalarioBase() + nivel2;
        } else if (nivel == 3) {
            return super.getSalarioBase() + nivel3;
        }else {
            System.out.println("No hay asignado ningun nivel para este objeto");
            return super.getSalarioBase();
        }
    }

    @Override
    public String trabajar() {
        return "Realiza tareas administrativas en " + departamento;
    }
}
