package POO;

import java.util.*;

public class EmpleadoUso {
    
    public static void main(String[] args) {

        /* OPCION 1 
        Empleado empleado1 = new Empleado("Jonathan", 30000, 2018, 06, 14);
        Empleado empleado2 = new Empleado("Jose", 45000, 2017, 10, 01);
        Empleado empleado3 = new Empleado("Maria", 50000, 2020, 04, 15);
        
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(10);
        empleado3.subeSueldo(15);
        
        System.out.println("Nombre = " + empleado1.dameNombre() + ". Sueldo " + empleado1.dameSueldo() + ". Fecha de alta: " + empleado1.dameFecha());
        System.out.println("Nombre = " + empleado2.dameNombre() + ". Sueldo " + empleado2.dameSueldo() + ". Fecha de alta: " + empleado2.dameFecha());
        System.out.println("Nombre = " + empleado3.dameNombre() + ". Sueldo " + empleado3.dameSueldo() + ". Fecha de alta: " + empleado3.dameFecha());
         */
        Empleado[] misEmpleados = new Empleado[4];
        
        misEmpleados[0] = new Empleado("Jonathan", 30000, 2018, 06, 14);
        misEmpleados[1] = new Empleado("Maria", 40000, 2019, 07, 15);
        misEmpleados[2] = new Empleado("Jose", 50000, 2017, 05, 16);
        misEmpleados[3] = new Empleado("Pacolo");
        
        for (Empleado e : misEmpleados) {
            
            e.subeSueldo(5);
            
        }
        
        for (int i = 0; i < misEmpleados.length; i++) {
            
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + ". Sueldo:" + misEmpleados[i].dameSueldo() + ". Fecha Alta: " + misEmpleados[i].dameFecha());
        }
    }    
}

class Empleado {
    
    private String nombre;
    private double sueldo;
    private Date fechaAlta;
    
    //CONSTRUCTOR 1
    
    public Empleado(String nom, double sue, int aA, int mA, int dA) {
        
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(aA, mA - 1, dA);
        fechaAlta = calendario.getTime();
        
    }
    
    //CONSTRUCTOR 2
    
    public Empleado(String nom){
        
        //this para referirnos al parametro de la clase
        this(nom, 30000, 2000, 01, 01);
    }
    
    //CONSTRUCTOR 3
    
    public Empleado(){
        
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
