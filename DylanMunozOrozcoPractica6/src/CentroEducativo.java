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
