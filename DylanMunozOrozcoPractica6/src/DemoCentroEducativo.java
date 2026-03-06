import java.time.LocalDate;

public class DemoCentroEducativo {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Profesor("Angel","Moreno Villanueva","13456123A", LocalDate.parse("2020-02-10"),2000.0,"Informatica",40);
        Trabajador trabajador2 = new Profesor("Juanma","Sanchez Palomar","1354567C", LocalDate.parse("2018-05-30"),1500.0,"Mates",45);
        Trabajador trabajador3 = new PersonalAdministrativo("Elena","Romero Guevara","18456047B", LocalDate.parse("2010-12-22"),1500.0,"Administracion",1);
        Trabajador trabajador4 = new PersonalAdministrativo("Julia","Orozco Sanz", "1923345C",LocalDate.parse("2022-08-23"),1850.0,"Lengua",2);
        CentroEducativo chomon = new CentroEducativo();
        chomon.getCentro().add(trabajador1);
        chomon.getCentro().add(trabajador2);
        chomon.getCentro().add(trabajador3);
        chomon.getCentro().add(trabajador4);
        chomon.trabajadores();
        System.out.println( "El salario medio del centro es: " + chomon.salarioMedio());
        System.out.println(chomon.masViejo());
        System.out.println(trabajador1.trabajar());
        System.out.println(trabajador4.trabajar());
    }
}
