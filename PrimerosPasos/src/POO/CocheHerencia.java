package POO;

public class CocheHerencia extends CochePOO {

    //Caracteristicas propias del nuevo objeto
    private int capacidad_carga;
    private int plazas_extras;

    //Constructor
    public CocheHerencia(int plazas_extras, int capacidad_carga) {

        super(); //llamar al constructor de la clase padre.

        this.capacidad_carga = capacidad_carga;
        this.plazas_extras = plazas_extras;

    }
    
    public String dimeDatos(){
        
        return " La capacidad de carga es: " + capacidad_carga + " Y las plazas son:" + plazas_extras;
                 
        
    }

}


/*                  HERENCIA


extends + clase_heredadora ---> se usa al lado del nombre de la clase

public class nueva_clase extends clase_heredadora{}

*/
