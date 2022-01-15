package POO;

public class Auto {

    private int peso;
    private int largo;
    private int ancho;

    private String color;
    private boolean asientosCuero, climatizador;
    private int puertas;

    public Auto() {

        peso = 500;
        largo = 2000;
        ancho = 1000;

    }

    public String getGenerales() {
        return "El auto que eliges pesa: " + peso + ", mide: " + largo + " y de ancho: " + ancho;
    }

    public void setColor(String color_elegido) {
        this.color = color_elegido;
    }

    public String getColor() {
        return " EL color de tu auto es: " + color;
    }

    public void setAsientosCuero(String asientosCuero) {

        if (asientosCuero.equalsIgnoreCase("si")) {

            this.asientosCuero = true;
        } else {
            this.asientosCuero = false;
        }
    }

    public String dime_asientos() {

        if (asientosCuero == true) {

            return "El coche tiene asientos de cuero";
        } else {
            return "Tiene asientos comunes";
        }
    }
    
    public void setClimatizador(String climatizador){
        
        if( climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }
    
    public String dime_climatizador(){
        if(climatizador = true){
            return "El auto incluye climatizador";
        }else{
            return "El auto no incluye climatizador";
        }
    }
    
    public String pesoAuto(){
        
        int peso_carroceria = 500;
        
        int pesoTotal = peso + peso_carroceria;
        
        if(asientosCuero = true){
            pesoTotal = pesoTotal + 50;
        }
        if(climatizador = true){
            pesoTotal = pesoTotal + 100;
        }
        return "El peso del coche es " + pesoTotal;
    }

}
