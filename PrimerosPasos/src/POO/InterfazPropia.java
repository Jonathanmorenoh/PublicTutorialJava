package POO;

public interface InterfazPropia {
    
    public abstract String miInterfaz(String nombre);
}


/*    1- Creacion del metodo ---> 
            public abstract String NombreInterfaz(Tipo_dato  nombre_dato);
            String NombreInterfaz(Tipo_dato Nombre_dato);

      2- Luego nos vamos a la clase en la que queremos implementar la interface
            class Jefatura extends Empleado implements InterfazPropia{}

      3- Implementar TODOS los metodos que se encuentran en la interfaz DENTRO DE LA CLASE DONDE IMPLEMENTO LA INTERFAZ
            ---> miInterfaz
            public String miInterfaz(String nombre){ 
            
                return ..(El String).. ;
            }


*/