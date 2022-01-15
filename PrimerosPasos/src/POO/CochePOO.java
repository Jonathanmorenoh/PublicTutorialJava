package POO;

public class CochePOO {
    
    //PROPIEDADES O ATRIBUTOS
    
    //modificadores de acceso evitan modificar los atributos
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, ac;
    
    
    
    //CONSTRUCTOR 
    
    public CochePOO (){
        
      ruedas = 4;
      largo = 2000;
      ancho = 1000;
      motor = 1600;
      peso = 500;
      
    }
   
    //INCLUYO LOS METODOS GETTER Y SETTER PARA PODER ACCEDER A LOS ATRIBUTOS

 //GETTER --> acceso + tipo de dato + nombre del Getter (){ return ancho; }
    public String getComunes() {
        return "La plataforma del vehiculo tiene" + ruedas + " ruedas, " + "mide: " + largo/1000 + ", pesa: " + peso;
    }
    
 //SETTER --> public + void + nombre del Setter () { }
    public void setColor(String color_coche){
        
        color = color_coche;
    }
    
    public String getColor(){
        return "El color del coche es: " + color;
    }

    public void setAsientosCuero(String asientosCuero) {
        //THIS HACE REFERENCIA A LA PROPIA CLASE, THIS.ATRIBUTO DE LA CLASE EN LA QUE ESTAMOS
        
        if(asientosCuero == "si"){
            
            this.asientosCuero = true;
        }else{
            this.asientosCuero = false;
        }
    }
    
    public String dime_asientos(){
        
        if(asientosCuero == true){
           
            return "El coche tiene asientos de cuero";
        }else{
            return "Tiene asientos comunes";
        }
    }
    
    


}



/*

METODO CONSTRUCTOR
    
- Metodo especial que se encarga de dar un estado inicial a nuestro OBJETO
    
- Estructura: ---> public NOMBRE_IGUAL_A_LA_CLASE (){

}
    

*/