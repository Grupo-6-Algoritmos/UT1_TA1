import Ej1.PruebaAtributos;

public class Main {
    public static void main(String[] args) {
        PruebaAtributos pruebaAtributos = new PruebaAtributos();
        // cuando se dejan los atributos sin inicializar, imprime los valores por defecto. $age=0 y _nombre=null
        // cuando se dejan las variables locales sin inicializar, el compilador te lo indica.
        pruebaAtributos.$age = 50;
        pruebaAtributos._nombre = "Pepe";
        int cantidad = 15;
        String nombre = "Carlos";
        System.out.println(pruebaAtributos.$age);
        System.out.println(pruebaAtributos._nombre);
        System.out.println(cantidad);
        System.out.println(nombre);
    }
}