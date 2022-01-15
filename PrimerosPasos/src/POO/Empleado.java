package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    private String nombre;
    private double sueldo;
    private Date fechaAlta;

    public Empleado(String nom, double sue, int aA, int mA, int dA) {

        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(aA, mA - 1, dA);
        fechaAlta = calendario.getTime();

    }

    public String dameNombre() { //GETTER NOMBRE

        return nombre;
    }

    public double dameSueldo() { //GETTER SUELDO

        return sueldo;
    }

    public Date dameFecha() {   //GETTER FECHA

        return fechaAlta;
    }

    public void subeSueldo(double porcentaje) { //SETTER SUELDO

        double aumento = sueldo * porcentaje / 100;

        sueldo = sueldo + aumento;
        //sueldo+= aumento;

    }

}
