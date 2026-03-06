import java.util.ArrayList;

public class CentroEducativo {
    private ArrayList<Trabajador> centro;

    public CentroEducativo(){
        this.centro = new ArrayList<>();
    }

    public CentroEducativo(ArrayList<Trabajador> centro) {
        this.centro = centro;
    }

    public ArrayList<Trabajador> getCentro() {
        return centro;
    }

    public void setCentro(ArrayList<Trabajador> centro) {
        this.centro = centro;
    }
    // Trabajadores muestra todos los trabajadores del centro con sus peculiaridades
    public void trabajadores(){
        for (Trabajador t : centro) {
            if (t instanceof Profesor) {
                System.out.println(t + ((Profesor) t).getEspecialidad() + ((Profesor) t).getHorasLectivasSemanales());
            } else if (t instanceof PersonalAdministrativo) {
                System.out.println(t + ((PersonalAdministrativo) t).getDepartamento() + ((PersonalAdministrativo) t).getNivel());
            }else {
                System.out.println(t);
            }
        }
    }
    // SalarioMedio calcula el sueldo medio entre todos los trabajadores
    public double salarioMedio(){
        double num = 0;
        int num2 = 0;
        for (Trabajador t : centro) {
            num = num + t.calcularSalario();
            num2++;
        }
        num = num / num2;
        return num;
    }
    // MasViejo muestra al trabajador mas antiguo
    public long masViejo(){
        long num = 0;
        Trabajador viejo = new Trabajador();
        for (Trabajador t : centro) {
            if (t.antiguedad() > num) {
                num = t.antiguedad();
                viejo = t;
            }
        }
        System.out.println(viejo);
        System.out.println("Lleva los siguientes años en el centro: ");
        return num;
    }
    // Econtrar nos permite metiendo el nombre o la profesion del trabajador poder encontrar los datos de dicho trabajador
    public void encontrar(String nt){
        for (Trabajador t : centro) {
            if (t.getNombre().equalsIgnoreCase(nt)) {
                System.out.println("Los datos del trabajador son: " + t);
            }
            if (nt.equalsIgnoreCase("profesor")) {
                if (t instanceof Profesor) {
                    System.out.println(t);
                }
            } else if (nt.equalsIgnoreCase("personaladministrativo")) {
                if (t instanceof PersonalAdministrativo) {
                    System.out.println(t);
                }
            }
        }
    }
}
